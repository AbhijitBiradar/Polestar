package com.polestar.utils;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.Scenario;

public class ReportUtil {
	private ExtentHtmlReporter extentHtmlReporter;
	private ExtentReports extentsReports;

	public ReportUtil(String reportLocation) {
		extentsReports = new ExtentReports();
		
		extentHtmlReporter = new ExtentHtmlReporter(new File(reportLocation));
		extentHtmlReporter.config().setTheme(Theme.DARK);
		extentHtmlReporter.config().setDocumentTitle("This is Document Title");
		extentHtmlReporter.config().setEncoding("utf-8");
		extentHtmlReporter.config().setReportName("This is Reporter Name");
		extentsReports.attachReporter(extentHtmlReporter);	
		
		extentsReports.setSystemInfo("Hostname", "LocalHost");
		extentsReports.setSystemInfo("OS", "Windows10");
		extentsReports.setSystemInfo("Tester Name", "Abhijit Biradar");
		extentsReports.setSystemInfo("Browser", "Chrome");
		
		
	}
	
	public void takeScreenshot() {
		//write this code when you do ui automation
	}

	private String getScenarioTitle(Scenario scenario) {
		return scenario.getName().replaceAll(" ", "");
	}

	private String getScreenshotLocation(String location) {
		return "file:///" + location.replaceAll("\\", "//");
	}

	public void createTest(Scenario scenario, String screenshotFile) throws IOException {
		if (scenario != null) {
			String testName = getScenarioTitle(scenario);
			//String errorMessage=getErrorMessage(scenario);
			
			switch (scenario.getStatus()) {
			case PASSED:
				extentsReports.createTest(testName).pass("Passed");
				break;

			case FAILED:
				extentsReports.createTest(testName).fail("Failed");
				// .addScreenCaptureFromPath(getScreenshotLocation(screenshotFile));
				break;

			default:
				extentsReports.createTest(testName).skip("Skipped");
			}
		}
	}
	
//	private String getErrorMessage(Scenario scenario) {
//		List<Result> testResultList = null;
//		List<Result> failedStepList = null;
//		try {
//			Field stepResult = scenario.getClass().getDeclaredField("stepResult");
//			stepResult.setAccessible(true);
//			testResultList = (List<Result>) stepResult.get(scenario);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		if (testResultList != null && !testResultList.isEmpty()) {
//			testResultList.stream().filter((x) -> {
//				return x.getErrorMessage() != null;
//			}).collect(Collectors.toList());
//		}
//		
//		if(failedStepList!=null && !failedStepList.isEmpty()) {
//			return failedStepList.get(0).getErrorMessage();
//		}
//		return "";
//	}

	public void writeToReport() {
		if (extentsReports != null) {
			extentsReports.flush();
		}
	}
}

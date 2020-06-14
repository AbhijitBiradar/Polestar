package com.polestar.configs;

import com.polestar.constants.Constants;
import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class ReportConfig {	
	private String generateReport;
	private String reportFilePath;
	private String reportType;
	private String deletePreviousReport;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	
	public String setGenerateReport() {
		System.out.println("Loading "+ Constants.reportConstant.GENERATE_REPORT +" from property File");
		generateReport = propertyFileReader.getPropertyValue(Constants.reportConstant.GENERATE_REPORT);
		if (generateReport != null) {
			System.out.println(Constants.reportConstant.GENERATE_REPORT +" loaded successully from property File");
			return generateReport;
		} else {
			System.out.println("Loading "+ Constants.reportConstant.GENERATE_REPORT +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setReportFilePath() {
		System.out.println("Loading "+ Constants.reportConstant.REPORT_FILE_PATH +" from property File");
		reportFilePath = propertyFileReader.getPropertyValue(Constants.reportConstant.REPORT_FILE_PATH);
		if (reportFilePath != null) {
			System.out.println(Constants.reportConstant.REPORT_FILE_PATH +" loaded successully from property File");
			return reportFilePath;
		} else {
			System.out.println("Loading "+ Constants.reportConstant.REPORT_FILE_PATH +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setReportType() {
		System.out.println("Loading "+ Constants.reportConstant.REPORT_TYPE +" from property File");
		reportType = propertyFileReader.getPropertyValue(Constants.reportConstant.REPORT_TYPE);
		if (reportType != null) {
			System.out.println(Constants.reportConstant.REPORT_TYPE +" loaded successully from property File");
			return reportType;
		} else {
			System.out.println("Loading "+ Constants.reportConstant.REPORT_TYPE +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setDeletePreviousReport() {
		System.out.println("Loading "+ Constants.reportConstant.DELETE_PREVIOUS_REPORT +" from property File");
		deletePreviousReport = propertyFileReader.getPropertyValue(Constants.reportConstant.DELETE_PREVIOUS_REPORT);
		if (deletePreviousReport != null) {
			System.out.println(Constants.reportConstant.DELETE_PREVIOUS_REPORT +" loaded successully from property File");
			return deletePreviousReport;
		} else {
			System.out.println("Loading "+ Constants.reportConstant.DELETE_PREVIOUS_REPORT +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String getGenerateReport() {
		if(generateReport==null) {
			setGenerateReport();			
		}		
		return generateReport;
	}
	
	public String getReportFilePath() {
		if(reportFilePath==null) {
			setReportFilePath();			
		}
		return reportFilePath;
	}
	
	public String getReportType() {
		if(reportType==null) {
			setReportType();			
		}		
		return reportType;
	}
	
	public String getDeletePreviousReport() {
		if(deletePreviousReport==null) {
			setDeletePreviousReport();			
		}
		return deletePreviousReport;
	}
	
	public void setAllReportConfig() {
		setGenerateReport();
		setReportFilePath();
		setReportType();
		setDeletePreviousReport();
	}

}

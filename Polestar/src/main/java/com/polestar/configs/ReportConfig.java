package com.polestar.configs;

import com.polestar.constants.TestConstant;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class ReportConfig {	
	private String generateReport;
	private String reportFilePath;
	private String reportType;
	private String deletePreviousReport;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	private String propertyFilePath="C:\\Users\\Sony\\git\\Polestar\\Polestar\\src\\test\\resources\\Config\\APIConfig.properties";
	
	public ReportConfig() {
		propertyFileReader.loadPropertyFile(propertyFilePath);
	}
	
	public String setGenerateReport() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		generateReport = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (generateReport != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return generateReport;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setReportFilePath() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		reportFilePath = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (reportFilePath != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return reportFilePath;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setReportType() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		reportType = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (reportType != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return reportType;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setDeletePreviousReport() {
		System.out.println("Loading "+ TestConstant.BASE_URI +" from property File");
		deletePreviousReport = propertyFileReader.getPropertyValue(TestConstant.BASE_URI);
		if (deletePreviousReport != null) {
			System.out.println(TestConstant.BASE_URI +" loaded successully from property File");
			return deletePreviousReport;
		} else {
			System.out.println("Loading "+ TestConstant.BASE_URI +" from property File is failed");
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

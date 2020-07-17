package com.polestar.configs;

import org.apache.log4j.Logger;

import com.polestar.constants.Constants;
import com.polestar.managers.FileReaderManager;
import com.polestar.utils.PropertyFileUtil;

public class ReportConfig {	
	private String generateReport;
	private String reportFilePath;
	private String reportType;
	private String deletePreviousReport;
	
	PropertyFileUtil propertyFileReader= FileReaderManager.getInstance().getPropertyReader();
	final static Logger log = Logger.getLogger(ReportConfig.class);
	
	public String setGenerateReport() {
		log.info("Loading "+ Constants.reportConstant.GENERATE_REPORT +" from property File");
		generateReport = propertyFileReader.getPropertyValue(Constants.reportConstant.GENERATE_REPORT);
		if (generateReport != null) {
			log.info(Constants.reportConstant.GENERATE_REPORT +" loaded successully from property File");
			return generateReport;
		} else {
			log.info("Loading "+ Constants.reportConstant.GENERATE_REPORT +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setReportFilePath() {
		log.info("Loading "+ Constants.reportConstant.REPORT_FILE_PATH +" from property File");
		reportFilePath = propertyFileReader.getPropertyValue(Constants.reportConstant.REPORT_FILE_PATH);
		if (reportFilePath != null) {
			log.info(Constants.reportConstant.REPORT_FILE_PATH +" loaded successully from property File");
			return reportFilePath;
		} else {
			log.info("Loading "+ Constants.reportConstant.REPORT_FILE_PATH +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setReportType() {
		log.info("Loading "+ Constants.reportConstant.REPORT_TYPE +" from property File");
		reportType = propertyFileReader.getPropertyValue(Constants.reportConstant.REPORT_TYPE);
		if (reportType != null) {
			log.info(Constants.reportConstant.REPORT_TYPE +" loaded successully from property File");
			return reportType;
		} else {
			log.info("Loading "+ Constants.reportConstant.REPORT_TYPE +" from property File is failed");
			throw new RuntimeException(
					"Application Url not specified in the Configuration.properties file for the Key:url");
		}
	}
	
	public String setDeletePreviousReport() {
		log.info("Loading "+ Constants.reportConstant.DELETE_PREVIOUS_REPORT +" from property File");
		deletePreviousReport = propertyFileReader.getPropertyValue(Constants.reportConstant.DELETE_PREVIOUS_REPORT);
		if (deletePreviousReport != null) {
			log.info(Constants.reportConstant.DELETE_PREVIOUS_REPORT +" loaded successully from property File");
			return deletePreviousReport;
		} else {
			log.info("Loading "+ Constants.reportConstant.DELETE_PREVIOUS_REPORT +" from property File is failed");
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

package com.polestar.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.polestar.configs.APIConfig;
import com.polestar.managers.FileReaderManager;

public class LogFileUtil {
	private static PrintStream printStream;
	private static APIConfig apiConfig = new APIConfig();

	public static PrintStream getLogFile() {
		if(printStream==null) {
			try {
				printStream=new PrintStream(new FileOutputStream(""));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return printStream;
		}else {
			return printStream;
		}
		
	}
}

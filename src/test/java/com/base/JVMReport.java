package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJVMReports(String cucumJson) {

		File f = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\reports");

		Configuration con = new Configuration(f, "Guru99Ecom");
		con.addClassifications("OS", "windows10");
		con.addClassifications("browser", "Chrome");
		con.addClassifications("version", "79.0");

		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(cucumJson);

		ReportBuilder builder = new ReportBuilder(jsonFiles, con);
		builder.generateReports();

	}
}

package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AllureReportGenerator {
	
	static File projectDir;
	static File allureResultsDir;
	static File allureReportDir;
	static File allureSinglesDir;
	
	static File generatedReport;
	static File renamedReport;
	
	static String formattedDateTime; 
	//NS block to get date and time of report generation
	{
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		formattedDateTime = currentDateTime.format(formatter);
		//System.out.println(formattedDateTime);
	}
	
	public static void main(String[] args) {
		//MAUHMAPFXMVPR25LGXYGJHGB twillio
		AllureReportGenerator arg= new AllureReportGenerator();
		arg.generateAllureReport();
		arg.moveToAllureSingles();
	}
	
	public void generateAllureReport() {
		try {
			// Get the project directory dynamically
			projectDir = new File(".").getCanonicalFile();

			// Define the allure-results directory inside the project
			allureResultsDir = new File(projectDir, "allure-results");
			allureReportDir = new File(projectDir, "allure-report");
			allureSinglesDir = new File(projectDir, "allure-singles");

			// Ensure the allure-results folder exists
			if (!allureResultsDir.exists()) {
				System.err.println("Error: allure-results-test folder not found in \n" + projectDir.getAbsolutePath());
				return;
			}


			// Run the command to generate the Allure single-file report
			ProcessBuilder processBuilder = new ProcessBuilder(
					"allure", "generate", "--single-file", "--clean"
					);
			processBuilder.directory(projectDir); // Set working directory to project root
			Process process = processBuilder.start();
			process.waitFor();

			System.out.println("Single-file Allure report generated successfully in: \n" + allureReportDir.getAbsolutePath());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public void moveToAllureSingles() {
		// Define the generated index.html and the new file name
        generatedReport = new File(allureReportDir, "index.html");
        renamedReport = new File(allureSinglesDir, "Report "+ formattedDateTime +".html");

        // Rename and move the report to the allure-singles folder
        if (generatedReport.exists()) {
            if (generatedReport.renameTo(renamedReport)) {
                System.out.println("Allure report renamed and moved successfully to: \n" + renamedReport.getAbsolutePath());
            } else {
                System.err.println("Failed to rename and move the Allure report.");
            }
        } else {
            System.err.println("Generated report not found in: \n" + allureReportDir.getAbsolutePath());
        }
	}

}

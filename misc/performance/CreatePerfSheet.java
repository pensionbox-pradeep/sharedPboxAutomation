package performance;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatePerfSheet {

	public static void main(String[] args) {
		// Create a new workbook
		Workbook workbook = new XSSFWorkbook();

		// Create a sheet in the workbook
		Sheet sheet = workbook.createSheet("Performance Metrics");

		// Create the header row
		Row headerRow = sheet.createRow(0);

		// Define the column names
		String[] columns = {"LCP", "INP", "CLS", "FCP", "FID", "TTFB"};

		// Create header cells
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i + 1);
			cell.setCellValue(columns[i]);
		}

		// Create the Desktop and Mobile rows
		Row desktopRow = sheet.createRow(1);
		desktopRow.createCell(0).setCellValue("Desktop");

		Row mobileRow = sheet.createRow(2);
		mobileRow.createCell(0).setCellValue("Mobile");

		// Adjust the column width to fit the content
		for (int i = 0; i < columns.length + 1; i++) {
			sheet.autoSizeColumn(i);
		}

		// Write the output to a file
		try (FileOutputStream fileOut = new FileOutputStream("/PerformanceMetrics.xlsx")) {
			workbook.write(fileOut);
			System.out.println("Excel file created successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				workbook.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}



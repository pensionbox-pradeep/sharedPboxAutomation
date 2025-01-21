package performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class UpdatePerfSheet {

	public static void main(String[] args) {
		String filePath = "./PerformanceMetrics.xlsx";

        try (FileInputStream fileIn = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileIn)) {

            // Access the existing sheet
            Sheet sheet = workbook.getSheet("Performance Metrics");

            if (sheet == null) {
                System.out.println("Sheet not found!");
                return;
            }

            // Access the Desktop and Mobile rows
            Row desktopRow = sheet.getRow(1);
            Row mobileRow = sheet.getRow(2);

            if (desktopRow == null || mobileRow == null) {
                System.out.println("Rows not found!");
                return;
            }

            // Insert/Update values for Desktop row
            double[] desktopValues = {2.5, 1.2, 0.1, 2.0, 0.2, 0.3};  // Example values
            for (int i = 0; i < desktopValues.length; i++) {
                Cell cell = desktopRow.getCell(i + 1);
                if (cell == null) {
                    cell = desktopRow.createCell(i + 1);
                }
                cell.setCellValue(desktopValues[i]);
            }

            // Insert/Update values for Mobile row
            double[] mobileValues = {3.0, 1.5, 0.15, 2.5, 0.25, 0.35};  // Example values
            for (int i = 0; i < mobileValues.length; i++) {
                Cell cell = mobileRow.getCell(i + 1);
                if (cell == null) {
                    cell = mobileRow.createCell(i + 1);
                }
                cell.setCellValue(mobileValues[i]);
            }

            // Adjust the column width to fit the content
            for (int i = 0; i < 7; i++) {  // 7 columns including the first column (Desktop/Mobile)
                sheet.autoSizeColumn(i);
            }

            // Write the updated workbook back to the file
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
                System.out.println("Excel file updated successfully!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}

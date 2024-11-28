package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	/**
	 * This method is used to read String data from excel file
	 * 
	 * @param sheeetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStrDatafromExcel(String sheeetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/testscriptdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheeetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}

	/**
	 * This method is used to read Boolean data from excel file
	 * 
	 * @param sheeetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public boolean getBoolDatafromExcel(String sheeetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/testscriptdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheeetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();

	}

	/**
	 * This method is used to read Number data from excel file
	 * 
	 * @param sheeetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	public double getDoubDatafromExcel(String sheeetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/testscriptdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheeetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();

	}

	/**
	 * This method is used to read Date data from excel file
	 * 
	 * @param sheeetName
	 * @param rowIndex
	 * @param colIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getLocDateDatafromExcel(String sheeetName, int rowIndex, int colIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Testdata/testscriptdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheeetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();

	}
}

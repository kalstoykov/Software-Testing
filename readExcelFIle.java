
import java.io.*;
import jxl.*;
import jxl.read.biff.BiffException;

/** 
 *  The class ReadExcelFile helps us read an Excel *xls file,
 *  accessing its workbook, sheets and cells, with the help
 *  of the Jxl library.
 *  
 * @author    Kal Stoykov
 * @version   Last modified on 11/05/2015
 **/

public class ReadExcelFile {

	/**
	 * 0-argument constructor for the class ReadExcelFile, which opens
	 * the Excel file that needs to be read, access its Workbook, Sheet
	 * and particular cell and prints out the cell content.
	 * 
	 */
	public void readFile()
	{
		try
		{
			// Path to the Excel file that will be read
			String fileName = "C:/TestCases1.xls";
			FileInputStream fs = new FileInputStream(fileName);
			// Access to Workbook
			Workbook wb = Workbook.getWorkbook(fs);
			// Access to Sheet1 on our Excel File
			Sheet sheet1 = wb.getSheet("Sheet1");
			// Access to Sheet2 on our Excel File
			Sheet sheet2 = wb.getSheet("Sheet2");
			// Sets and gets the number of rows in Sheet1
			int numRows = sheet1.getRows();
			// Sets and gets the number of columns in Sheet1
			int numCols = sheet1.getColumns();
			// Iterates through all rows and columns of the current sheet
			// and prints out their content adding a new line after each
			for (int row = 0; row < numRows; row++) {

				for (int col = 0; col < numCols; col++) {
					System.out.print(sheet1.getCell(col, row).getContents() + "\t");
				}
				System.out.println();
			}
			//For sheet2 access Row 2 and Column 1 and print out is content
			String getCellContent = sheet2.getCell(1,2).getContents();
			System.out.println(getCellContent); // output: http://www.nba.com/warriors/
			//For sheet2 access Row 2 and Column 0 and print out is content
			String getCellContent1 = sheet2.getCell(0,2).getContents();
			System.out.println(getCellContent1); // output: Boston Celtics
		}
		// Signals that an I/O exception of some sort has occurred.
		catch (IOException e)
		{
			 System.err.println("Caught IOException: " +  e.getMessage());
		}
		// Exception caught when reading a biff file 
		catch (BiffException e1)
		{
			System.err.println("Caught BiffException: " +  e1.getMessage());
		}

	}

	/**
	 * Main method for the class ReadExcelFile that defines
	 * a test case of the info required and outputs that
	 * info on the screen.
	 */
	public static void main(String args[]) throws BiffException, IOException {
		readExcelFile ref = new readExcelFile();
		ref.readFile();
	}

}

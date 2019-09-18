package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Util {
	
	public static void main(String[] args) throws IOException {
		
		dataFromExcel();
	}
	
	//public static final String FILE_PATH = "C:\\Users\\saini\\Documents\\Guru99Data.XLSX";
	
	public static void dataFromExcel() throws IOException{
		
		String[][] tabArray = null;
		
		File file = new File("C:\\Users\\saini\\Desktop\\testData99.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println("rows : "+rows);
		System.out.println("first row: "+sheet.getFirstRowNum());
		System.out.println("last row: "+sheet.getLastRowNum());
		int totalrows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total number of rows: "+totalrows);
		int totalcolumns = sheet.getRow(0).getPhysicalNumberOfCells();
		
		System.out.println("Total number of columns: "+ totalcolumns);
		
		
		Iterator <Row> iterator = sheet.iterator();
		
		while(iterator.hasNext()) {
			Row currentRow = iterator.next();
			Iterator<Cell> cellIterator = currentRow.iterator();
			
			while(cellIterator.hasNext()) {
				Cell currentCell = cellIterator.next();
				if(currentCell.getCellType()==CellType.STRING) {
					System.out.print(currentCell.getStringCellValue() +"--");
				} else if(currentCell.getCellType()==CellType.NUMERIC) {
					System.out.print(currentCell.getNumericCellValue());
				}
			}
			
			System.out.println();
		}
		
		
		//Cell y =wb.getSheetAt(0).getRow(2).getCell(CellReference.convertColStringToIndex("C"));
		
		//String z = y.getStringCellValue();
		
		//System.out.println(z);
		
		/*
		 * int maxrow = sheet.getPhysicalNumberOfRows(); int i=0;
		 * 
		 * tabArray = new String[4][2];
		 * 
		 * for(int r=1;r<maxrow-1;r++) { int j=0; Row row = sheet.getRow(r);
		 * 
		 * for(int c=1;c<3;c++) { Cell cell = row.getCell(c); String s =
		 * cell.getStringCellValue(); System.out.print(s+"   "+i+j+" ");
		 * 
		 * tabArray[i][j]=s; j++; }
		 * 
		 * System.out.println(""); i++;
		 * 
		 * }
		 * 
		 * 
		 * for(int a=0; a<4; a++) {
		 * 
		 * for(int b=0;b<2;b++) { System.out.print(tabArray[a][b]+"  "); }
		 * 
		 * System.out.print("\n"); }
		 */
		
		
		
	}
	  

}

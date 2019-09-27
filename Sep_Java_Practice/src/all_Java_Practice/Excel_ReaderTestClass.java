package all_Java_Practice;

import java.util.Hashtable;

public class Excel_ReaderTestClass {
	
	public static Object[][] getExceldata(Xls_Reader xls, String testCase){
		xls = new Xls_Reader("D://Test_Excel.xlsx");
		String sheetName = "sheet2";
		int testStart = 1;
		while(!xls.getCellData(sheetName, 0, testStart).equals(testCase)){
			testStart++;
		}
		System.out.println(testStart);
		
		int rowStart=testStart+2;
		int colStart = testStart+1;
		
		int row=0;
		while(!xls.getCellData(sheetName, 0, rowStart+row).equals("")){
			row++;
		}
		System.out.println(rowStart);
		
		int col=0;
		while(!xls.getCellData(sheetName, col, colStart).equals("")){
			col++;
		}
		System.out.println(colStart);
		Object[][] data=new Object[row][1];
		int RD=0;
		Hashtable<String,String> table=null;
		for(int r=rowStart;r<rowStart+row;r++){
			table = new Hashtable<String,String>();
			for(int c=0;c<col;c++){
				String key = xls.getCellData(sheetName, c, colStart);
				String value = xls.getCellData(sheetName, c, r);
				table.put(key, value);
			}
			data[RD][0]=table;
			RD++;
		}
		return data;
	}

}

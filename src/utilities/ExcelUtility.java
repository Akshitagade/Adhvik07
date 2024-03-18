package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
XSSFWorkbook workbook;
XSSFSheet sheet;
XSSFCell celldata_username,celldata_password;
public XSSFSheet setWorkbook() throws IOException {
	FileInputStream fs = new FileInputStream(System.getProperty("User.dir")+("\\src\\testdata\\NEW USER SIGNUP.xlsx"));
	workbook=new XSSFWorkbook(fs);
	sheet = workbook.getSheetAt(0);
	return sheet;
}
public XSSFCell Get_Username(int rownum, int colnum) throws IOException
{
	sheet = setWorkbook();
	XSSFCell celldata_username= sheet.getRow(rownum).getCell(colnum);
	return celldata_username;
}
public XSSFCell Get_Password(int rownum , int colnum) throws IOException
{
	sheet = setWorkbook();
	XSSFCell celldata_password= sheet.getRow(rownum).getCell(colnum);
	return celldata_password;
	
	
}
}

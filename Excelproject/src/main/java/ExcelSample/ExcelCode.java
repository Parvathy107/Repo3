package ExcelSample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 
{
	static FileInputStream f; //Nonprimitive datatype ie., Classes.
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String readStringData(int i, int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\MIDHUN M\\OneDrive\\Desktop\\ExcelStud.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("StudDetails");
		XSSFRow r=sh.getRow(i);
		XSSFCell c= r.getCell(j);
		return(c.getStringCellValue());
	}
		public static String readIntegerData(int i,int j) throws IOException
		{
			f=new FileInputStream("C:\\Users\\MIDHUN M\\OneDrive\\Desktop\\ExcelStud.xlsx");
			w=new XSSFWorkbook(f);
			sh=w.getSheet("StudDetails");
			XSSFRow r=sh.getRow(i);
			XSSFCell c=r.getCell(j);
			int a=(int) c.getNumericCellValue();
			return String.valueOf(a);
		}
			
	
	}



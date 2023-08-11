package ExcelSample;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException 
	{
		String sr=ExcelCode.readStringData(0,0);
		String sra=ExcelCode.readIntegerData(0,1);
		String sc=ExcelCode.readIntegerData(1, 1);
		String sca=ExcelCode.readStringData(1, 0);
			System.out.println(sr);
		  System.out.println(sra);
	
		System.out.println(sc);
	    System.out.println(sca);
	}

}

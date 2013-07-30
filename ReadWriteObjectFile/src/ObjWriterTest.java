

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import file.util.*;

public class ObjWriterTest {

	@Test
	public void test() {
		
		
		Date date = new Date();
		Receipt aReceipt = new Receipt(1, "Tanes", date, 5, new BigDecimal(50));
		String fileName = aReceipt.getReceiptNum() + "_"	+ aReceipt.getReceiptDate().toString().replace(':', '_') + "_"+ aReceipt.getServerName() + ".dat";
		//test object writer
		ObjWriter theWriter = new ObjWriter(aReceipt,fileName);
		try {
			theWriter.writeObjFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//test object reader
		Receipt readReceipt=null;
		try {
			readReceipt = (Receipt)theWriter.readObjFile("1_Tue Jul 30 12_06_19 EDT 2013_Tanes.dat");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(readReceipt);
	}

}

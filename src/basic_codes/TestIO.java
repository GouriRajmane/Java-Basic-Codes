package basic_codes;

import java.util.Date;
import java.io.File;

public class TestIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D://JavaTraining/Hello.java");
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());

		Date d1 = new Date();
		System.out.println(d1.getMonth());
		System.out.println(d1.getYear());

	}

}

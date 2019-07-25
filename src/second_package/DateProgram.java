package second_package;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class DateProgram {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date dt=new Date();
		System.out.println(dt);
		SimpleDateFormat s=new SimpleDateFormat("dd-MM-yyyy");
		//SimpleDateFormat s=new SimpleDateFormat("dd-mm-yyyy");
		System.out.println(s.format(dt));
		String str="12-12-2019";
		//String str="12-60-2019";
		System.out.println(str);
		System.out.println(s.parse(str));
		
	}

}

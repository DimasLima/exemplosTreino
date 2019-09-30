package trabalhandoComDatas;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Calendar {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = (Date) Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		//Calendar cal = Calendar.
		

	}


	

}

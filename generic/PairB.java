package generic;

import java.util.Date;
import java.util.HashMap;

public class PairB {

	public static void main(String[] args) {
		//creating an object
				HashMap<String,Date> hm = new HashMap<String,Date>();
				//adding key-value pair
				hm.put("today is", new java.util.Date());
				System.out.println(hm);
	}

}

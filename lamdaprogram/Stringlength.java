package lamdaprogram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Stringlength {
interface StringLength{
	int getLength(String str);
}
	public static void main(String[] args) {
		ArrayList<String> strl=new ArrayList<>(Arrays.asList("vedhavathi","revathi","renu","naveena"));
strl.removeIf((String str)->str.length()%2==1);
System.out.println(strl);
	}

}

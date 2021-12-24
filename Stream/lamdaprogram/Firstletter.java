package lamdaprogram;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Firstletter {

	public static void main(String[] args) {
		/*String str =" hello my dear friends.";
		char c[]=str.toCharArray();
		System.out.println("the first character of each word is :");
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' '&&(i==0||c[i-1]==' ')) {
				System.out.println(c[i]);
			}
		}*/
String[] strA= {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
System.out.println(Arrays.stream(strA)
		.filter(Objects::nonNull)
		.map(s->s.charAt(0))
		.collect(Collectors.toList()));
		
		

	

}
}

package string;

public class StringOperations {

	public static void main(String[] args) {
		String str="Java String poll refers to collection of strings which are stored in heap memory";
		System.out.println(" string in lowercase : "+str.toLowerCase());
		System.out.println(" string in uppercase : "+str.toUpperCase());
		System.out.println(" string replacing: "+str.replace('a', '$'));
		System.out.println(" string contains : "+str.contains("collection"));
		System.out.println(" string matches : "+str.matches("java string poll refers to collection of strings which are stored in heap memory"));
		System.out.println(" strings are equal : "+str.equalsIgnoreCase("java string poll refers to collection of strings which are stored in heap memory"));
	}

}

package java11;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\StudentList.txt");
		String s;
		int count=0;
		BufferedReader br = new BufferedReader(new FileReader(file));

	
while((s=br.readLine())!=null) {
	String words[]=s.split("");
	count=count+words.length;
}
System.out.println(+count);
br.close();
	}

}

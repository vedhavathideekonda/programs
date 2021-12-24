package lamdaprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class OddLength {

	public static void main(String[] args) {
		/*List<String> names = new ArrayList();
		names.add("vedha");
		names.add("vedhavathi");
		names.add("varsha");*/

		Stream<String> s =Stream.of("hello","world");
		Consumer<String> a = str ->System.out.println(str.toUpperCase());
		a.accept("hello");
	

	}

}

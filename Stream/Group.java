package Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Group {

	public static void main(String[] args) {
		List<fruit> fruits =  Arrays.asList(
			new fruit("apple", 90, 25, "red"),
			new fruit("orange", 80, 15, "orange"),	
			new fruit("banana", 95, 5, "yellow"),
			new fruit("grapes", 50, 20, "green"),
			new fruit("cherry", 5, 2, "red")
				);
		//descending order of calories
		List<Integer> c=fruits.stream()
			.filter(p->p.calories<100)
			.sorted(( o1,o2) ->(o2.getCalories()-o1.getCalories()))
			.map(p->p.calories)
			.collect(Collectors.toList());
			System.out.println(c);
		//displaying colorwise
					List<String> c1=fruits.stream()
					.sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
				   	.map(p->p.color)
				   	.collect(Collectors.toList());
					System.out.println(c1);
				
					//display red color fruit price ascending order
					List<String> c2=fruits.stream()
				            .filter(p->p.getColor().equals("red"))
							.sorted((o1,o2) ->(o1.getColor().compareTo(o2.getColor())))
							.sorted(( o1,o2) ->(o1.getPrice()-o2.getPrice()))
						   	.map(p->p.toString())
						   	.collect(Collectors.toList());
							System.out.println(c2);
	

	
}
}

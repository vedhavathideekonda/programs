package lamdaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Items {

	public static void main(String[] args) {
		List<ListItems> list = new ArrayList<ListItems>();
		list.add(new ListItems(1,"hello"));
		list.add(new ListItems(2,"my"));
		list.add(new ListItems(3,"dear"));
		list.add(new ListItems(4,"friends"));
		
		Map<Integer,String> map=new HashMap<>();
		list.forEach((n)->{map.put(n.getKey(),n.getValue());});
		System.out.println("map"+map);
		
	}

}

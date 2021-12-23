package generic;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.Random;
	public class HashMapDemo {
	 public static void main(String[] args) {
	  //
	  // Create a hashtable and put some key-value pair.
	  //
	  HashMap<Integer, Double> values = new HashMap<Integer, Double>();
	  values.put(10, 9.7);
	  values.put(9, 2.7);
	  values.put(8, 3.5);
	  values.put(7, 0.56);
	  values.put(6, 9.3);
	  values.put(5, 5.7);
	  values.put(4, 8.7);
	  values.put(3, 3.5);
	  values.put(2, 7.56);
	  values.put(1, 6.3);
	 
	  // Get a random entry from the HashMap.
	  Object[] Keys = values.keySet().toArray();
	  Object key = Keys[new Random().nextInt(Keys.length)];
	  System.out.println(" Random Value " + key + " :: " + values.get(key));
	 
	 List<Map.Entry<Integer, Double>> list = new ArrayList<Map.Entry<Integer, Double>>(values.entrySet());

	for (Map.Entry<Integer, Double> entry : list) {
	  System.out.println(entry.getKey() + " :: " + entry.getValue());
	  }
	 }
}



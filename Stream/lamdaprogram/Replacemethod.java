package lamdaprogram;

import java.util.ArrayList;
import java.util.Arrays;

public class Replacemethod {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		ArrayList<String> words = new ArrayList<>(Arrays.asList("manu","rani","renna","renu","vani"));
		System.out.println(words);
		words.replaceAll(e->e.toUpperCase());
		System.out.println(words);
    }
   }

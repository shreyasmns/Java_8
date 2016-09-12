package java_8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class Filer_ForEach {

	public static void main(String[] args) {
			
		List<String> versions = new ArrayList<>();
			versions.add("Gingerbread");
			versions.add("Android Nougat");
			versions.add("Ice Cream Sandwich");
			versions.add("Jelly Bean");
			versions.add("LollipopL");
			versions.add("HoneyComb");
			
			System.out.println("All Versions whose length is greater 10 : ");
			
			versions.stream()
			.filter(s -> s.length() > 10)
			.forEach(System.out::println);
			
			System.out.println("\nVersion which starts with L : ");
			
			String firstl = versions.stream()
			.filter(s -> s.startsWith("L"))
			.findFirst().get();
			System.out.println(firstl);
			
			System.out.println("\nverisons length grt than 8 and contains letter a : ");
			
			versions.stream()
			.filter(s -> s.length() > 8)
			.filter(s -> s.contains("a"))
			.forEach(System.out::println);
			
			
	}

}

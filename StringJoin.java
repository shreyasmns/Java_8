package java_8;

import java.util.Arrays;

import java.util.List;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class StringJoin {

	public static void main(String[] args) {
		System.out.println("Java 8 : String Join method Illustartion");
		String countries = String.join(" and ", "India ", "USA", "France");
		System.out.println("\nCountries are : "+countries);
		
		List<String> states =Arrays.asList("New York", "Washington", "California");
		String usStates = String.join(", ", states);
		System.out.println("Few US States are : "+usStates);
		
		String[] langs = {"Java", "Python", "Perl", "JavaScript"};
		String progLangs = String.join(" | ", langs);
		System.out.println("Programming Languages : "+progLangs);
		
	}

}

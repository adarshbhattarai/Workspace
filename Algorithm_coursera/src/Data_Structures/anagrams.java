package Data_Structures;

import java.util.HashSet;

public class anagrams {

	public static void main(String[] args) {
		
		String a = "nuunasdnaiwenjjjjj";
		String b = "asdnajnduiwejeinjansinasdn";
		HashSet<Character> anagrama = new HashSet<>();
		HashSet<Character> ana = new HashSet<>();
		for (Character c : a.toCharArray()) {
			anagrama.add(c);
		}
		
		for (Character c : b.toCharArray()) {
			ana.add(c);
		}
		System.out.println(anagrama);
		System.out.println(ana);
		
		if(anagrama.containsAll(ana)){
			System.out.println("Anagram");
		}
		else
			System.out.println("Not ana");
	}
}

package PartOne;

public class Vowels {
	public static void main(String[] args) {
		int vowels=0;
		int constants=0;
		int numbers=0;
		int characters=0;
		
		String s1="I am Chaitanya @9552";
		
		s1=s1.toLowerCase();
		
		for (int i = 0; i < s1.length(); i++) {
			
			char ch=s1.charAt(i);
			
			if(ch>='a' && ch<='z') {
			
			if(ch=='a'||ch=='i'||ch=='o'||ch=='e'||ch=='u') {
				vowels++;
			}else {
				constants++;
			}
			
		}else {
			if(ch>='0' && ch<='9') {
				numbers++;
			}else {
				characters++;
			}
		}
	}
	System.out.println(vowels);	
	System.out.println(constants);
	System.out.println(numbers);
	System.out.println(characters);
	}

}

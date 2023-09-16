package Interview1;

public class ReverseSentence {
	public static void main(String[] args) {
		String s="i am shubham";
		
		String[] sp = s.split("\\s+");
		
		String temp="";
		//s.re

    for (int i = sp.length-1; i >=0; i--) {
    temp=temp+sp[i]+" ";
	
	}
    System.out.println(temp.trim());
		
		
	}
}

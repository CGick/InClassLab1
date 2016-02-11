package class4LabBackwardString;

import java.util.Scanner;

public class BackwardString {

	public static void main(String[] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		String input,output;
		
		System.out.println("Enter a sentence: ");
		input = keyboard.nextLine();
		
		output = reverseSentence(input);
		
		System.out.println(output);
		

	}
	
	public static String reverseSentence(String str){
		
		char[] chArray = str.toCharArray();
		StringBuilder strBuild = new StringBuilder(str.length());
		
		for(int index = str.length() ; index > 0; index--){
			
			strBuild.append(chArray[index -1 ]);
		}
		
		
		
		return strBuild.toString();
	}
}

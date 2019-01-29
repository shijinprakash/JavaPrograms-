package testingGround;

/*
 * Function 			: Anagram Generator
 * Improvements made	: storing values in a list and print them from it.
 * Improvements to make	: s.no with the anagrams
 *
 */


import java.util.ArrayList;
import java.util.Scanner;

public class AnagramGenerator {

	
		public static void main(String[] args) 
		{ 
			System.out.println("Enter the string to generate Anagram of :");
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			sc.close();
			int n = str.length(); 
			AnagramGenerator generator = new AnagramGenerator();
			generator.permute(str, 0, n-1); 
		} 

		/** 
		* permutation function 
		* @param str string to calculate permutation for 
		* @param l starting index 
		* @param r end index 
		*/
		private void permute(String str, int l, int r) 
		{
			ArrayList<String> generatedValues = new ArrayList<String>();
			int sno = 0;
			if (l == r) {
				//System.out.println(str); 
				//sno = sno + 1;
				if(generatedValues.contains(str) == false){
					
					generatedValues.add(sno + " " + str);
					
				}
				
			}
			else
			{ 
				for (int i = l; i <= r; i++) 
				{ 
					str = swap(str,l,i); 
					permute(str, l+1, r); 
					str = swap(str,l,i); 
					sno++;
				} 
			} 
			
			for(String e : generatedValues) {
				System.out.println(e);
			}
		} 

		/** 
		* Swap Characters at position 
		* @param a string value 
		* @param i position 1 
		* @param j position 2 
		* @return swapped string 
		*/
		public String swap(String a, int i, int j) 
		{ 
			char temp; 
			char[] charArray = a.toCharArray(); 
			temp = charArray[i] ; 
			charArray[i] = charArray[j]; 
			charArray[j] = temp; 
			return String.valueOf(charArray); 
		} 

	} 

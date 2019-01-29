package testingGround;

import java.util.Random;

public class StringGenerator {
	
	char[] upperAlphaArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private char[] lowerAlphaArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
	private String[] specialCharacters = {"@","%","+","!","#","$","^","?",":",".","(",")","{","}","[","]","~","-","_","."};
	int passwordLength = 7;
	
	StringBuffer generatedPassword = new StringBuffer();
	
	String[] password = new String[8];
	
	String[] selector = new String[]{"upperAlphaArray","lowerAlphaArray","numbers","specialCharacters"};
	
	/*
	 * To Be Activated while populating options
	 * 
		private boolean upperAlphaFlag = false;
		private boolean lowerAlphaFlag = false;
		private boolean numberFlag = false;
		private boolean specialCharactersFlag = false;
	*/
	
	
	
	public String generatorMethod(){
		
		Random randomUAlpha = new Random();
		int letter = randomUAlpha.nextInt(upperAlphaArray.length);
		char randomUpperAlpha = upperAlphaArray[letter];
		
		password[0] = Character.toString(randomUpperAlpha);
		//System.out.println(password[0]);
		
		do {
			for (int i = 1; i <= passwordLength ; i++){
				
				
				String randomPick = selector[new Random().nextInt(selector.length)];
				
				
				if (randomPick == "upperAlphaArray"){
					randomUpperAlpha = upperAlphaArray[new Random().nextInt(upperAlphaArray.length)];
					password[i] = Character.toString(randomUpperAlpha);
					//System.out.println(password[i]);
				}
				else if (randomPick == "lowerAlphaArray"){
					char randomLowerAlpha = lowerAlphaArray[new Random().nextInt(lowerAlphaArray.length)];
					password[i] = Character.toString(randomLowerAlpha);
					//System.out.println(password[i]);
				}
				else if (randomPick == "numbers"){
					char randomNumber = numbers[new Random().nextInt(numbers.length)];
					password[i] = Character.toString(randomNumber);
					//System.out.println(password[i]);
				}
				else if (randomPick == "specialCharacters"){
					String randomSpecialCharacters = specialCharacters[new Random().nextInt(specialCharacters.length)];
					password[i] = randomSpecialCharacters;
					//System.out.println(password[i]);
				}
			}
		
		
		
			for(String s : password) {
				//System.out.print(s);
				generatedPassword.append(s);
				
			}
		}
		while((generatedPassword.toString().contains(upperAlphaArray.toString())) || (generatedPassword.toString().contains(lowerAlphaArray.toString())) || (generatedPassword.toString().contains(numbers.toString())) || (generatedPassword.toString().contains(specialCharacters.toString())));
		return generatedPassword.toString();
	}
	
	
	public static void main(String[] args) {
		StringGenerator generator = new StringGenerator();
		generator.generatorMethod();
		System.out.println(generator.generatedPassword);
	}

}

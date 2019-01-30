package testingGround;

import java.util.Random;

public class StringGenerator {
	
	char[] upperAlphaArray = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	private char[] lowerAlphaArray = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	private char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
	private String[] specialCharacters = {"@","%","+","!","#","$","^","?",":",".","(",")","{","}","[","]","~","-","_","."};
	int passwordLength = 8;
	boolean lowerFlag = false;
	boolean numberFlag = false;
	boolean specialCharacterFlag = false;
	boolean conditionFlag = false;
	
	StringBuffer generatedPassword = new StringBuffer();
	StringBuffer upperAlphaSB = new StringBuffer();
	
	
	String[] password = new String[passwordLength];
	
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
			for (int i = 1; i <= passwordLength - 1 ; i++){
				
				
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
			
			for(int x = 1; x<passwordLength; x++){
				
			char[] passChar = password[x].toCharArray();
			
			
			
			
				for(int i = 0; i<passChar.length; i++){
					
					if(lowerFlag == false){
						for(int j=0; j<lowerAlphaArray.length; j++){
							if(passChar[i] == lowerAlphaArray[j]){
								//System.out.println("lower char found " + passChar[i]);
								lowerFlag = true;
								break;
							}
						}
					}
					if (numberFlag == false){
						for(int j=0; j<numbers.length; j++){
							if(passChar[i] == numbers[j]){
								//System.out.println("number found " + passChar[i]);
								numberFlag = true;
								break;
							}
						}
					}
					if (specialCharacterFlag == false){
						for(int j=0; j<specialCharacters.length; j++){
							if(Character.toString(passChar[i]).equals(specialCharacters[j])){
								//System.out.println("specialCharacter found " + passChar[i]);
								specialCharacterFlag = true;
								break;
							}
						}
					}
				}
				
				if (lowerFlag == true && numberFlag == true && specialCharacterFlag == true){
					conditionFlag = true;
				}
			}
			
		}while(conditionFlag == false);
		
		
			for(String s : password) {
				//System.out.print(s);
				generatedPassword.append(s);
				
			}
			
		return generatedPassword.toString();
	}
	
	
	public static void main(String[] args) {
		StringGenerator generator = new StringGenerator();
		generator.generatorMethod();
		System.out.println(generator.generatedPassword);
	}

}

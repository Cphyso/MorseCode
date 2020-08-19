/**
 * author : Sifiso Mhlongo
 * Description: A class that define two methods
 * 				one method converts text to morseCode
 * 				the other morseCode to text
 * Class makes use of directional hashMap of guava framework from google
 * */

package com.umuzi.projects;

import com.google.common.collect.BiMap; 
import com.google.common.collect.HashBiMap;

public class MorseCode {

	static BiMap<Character, String> morseCode = HashBiMap.create(); 
	
	public void createMorseCodeDictionary() {
		 	morseCode.put('A', ".-");
	        morseCode.put('B', "-...");
	        morseCode.put('C', "-.-.");
	        morseCode.put('D', "-..");
	        morseCode.put('E', ".");
	        morseCode.put('F', "..-.");
	        morseCode.put('G', "--.");
	        morseCode.put('H', "....");
	        morseCode.put('I', "..");
	        morseCode.put('J', ".---");
	        morseCode.put('K', "-.-");
	        morseCode.put('L', ".-..");
	        morseCode.put('M', "--");
	        morseCode.put('N', "-.");
	        morseCode.put('O', "---");
	        morseCode.put('P', ".--.");
	        morseCode.put('Q', "--.-");
	        morseCode.put('R', ".-.");
	        morseCode.put('S', "...");
	        morseCode.put('T', "-");
	        morseCode.put('U', "..-");
	        morseCode.put('V', "...-");
	        morseCode.put('W', ".--");
	        morseCode.put('X', "-..-");
	        morseCode.put('Y', "-.--");
	        morseCode.put('Z', "--..");
	        morseCode.put(' ', "/");
	}
	 StringBuilder morseCodeToLetters(String morseCodeString) {
		
		StringBuilder morseToken2 = new StringBuilder("");
		StringBuilder letters = new StringBuilder("");
		
		for(int k = 0; k < morseCodeString.length(); k++) {
			
			if(Character.isSpaceChar((morseCodeString.charAt(k)))) {
				String x = morseToken2.toString();
				letters.append(morseCode.inverse().get(x));
				morseToken2 = new StringBuilder("");
			}else {
				morseToken2.append(morseCodeString.charAt(k));	
			}
		}
		return letters;
	}
	 StringBuilder lettersToMorseCode(String phrase) {
		StringBuilder text = new StringBuilder();
		for(int i = 0; i < phrase.length(); i++) {
			Character x = Character.toUpperCase(phrase.charAt(i));
			String morseLetter = morseCode.get(x); 
			text.append(morseLetter + " ");
		}
		return text;
	} 
	public static void main(String[] args) {
		MorseCode coder = new MorseCode();
		coder.createMorseCodeDictionary();
		System.out.println(coder.lettersToMorseCode("hello there"));
		System.out.println(coder.morseCodeToLetters(".... . .-.. .-.. --- / - .... . .-. . "));
	}
}

package com.umuzi.projects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MorseCodeTest {

	@Test
	void testMorseCodeToLetters() {
		MorseCode test1 = new MorseCode();
		test1.createMorseCodeDictionary();
		assertSame(new StringBuilder(".... . .-.. .-.. --- / - .... . .-. . "),test1.lettersToMorseCode("hello there"));
		
	}

	@Test
	void testLettersToMorseCode() {
		MorseCode test2 = new MorseCode();
		test2.createMorseCodeDictionary();
		assertNotSame(new StringBuilder("HELLO THERE"),test2.morseCodeToLetters(".... . .-.. .-.. --- / - .... . .-. . "));
	}


}

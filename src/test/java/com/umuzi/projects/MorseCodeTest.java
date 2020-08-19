package com.umuzi.projects;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MorseCodeTest {

	@Test
	void testMorseCodeToLetters() {
		MorseCode test1 = new MorseCode();
		test1.createMorseCodeDictionary();
		assertEquals(".... . .-.. .-.. --- / - .... . .-. . ",test1.lettersToMorseCode("hello there"));
	}

	@Test
	void testLettersToMorseCode() {
		MorseCode test2 = new MorseCode();
		test2.createMorseCodeDictionary();
		assertEquals("hello there",test2.morseCodeToLetters(".... . .-.. .-.. --- / - .... . .-. . "));
	}

}

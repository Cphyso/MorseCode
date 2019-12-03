import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    public static void main(String[] args) {

        Map<Character, String> morseCode = new HashMap<>();
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

        /* ********************* Converting From --> Letters TO --> Morse Code ************* */
        //letters to morse code method call 
        char[] letters = lettersToMorseCode("Hi there");     // test case given in the problem descriptions(it can be changed to anything else)

        for (int i = 0; i < letters.length; i++) {
            System.out.print(morseCode.get(letters[i]) + " ");
        }
        System.out.println();

        /* ********************* Converting From --> Morse Code TO --> Plain Text ************* */

        /* ************************************************************ *
         * Declare a map to store morse code as key                     *
         *and characters as value for reverse conversion                *
         * The same Map will be used to create the content of the new   *
         * map, just values as key and keys and values this time around *
         * ************************************************************ */
        Map<String, Character> characters = new HashMap<>();

        for (Map.Entry<Character,String> entry: morseCode.entrySet()){
            char key = entry.getKey();
            String value = entry.getValue();
            characters.put(value,key);
        }
        
        // Morse code to letters method call
        String[] morseChars = morseCodeToLetters(".... .. / - .... . .-. . "); // test case given in the problem descriptions(it can be changed to anything else)

        for (int i = 0; i < morseChars.length; i++) {
            if(morseChars[i].equals("")){
                morseChars[i] = " ";
            }
            System.out.print(characters.get(morseChars[i]));
        }
        System.out.println();
    }
    static char[] lettersToMorseCode(String words){

        return words.toUpperCase().toCharArray();
    }
    private static String[] morseCodeToLetters(String morseCodeWord){
        return morseCodeWord.split(" ");
    }
}

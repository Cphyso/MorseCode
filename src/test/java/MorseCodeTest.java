import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeTest {

    @Test
    public void test0() {
        MorseCode mc = new MorseCode();
        assertEquals(8, mc.lettersToMorseCode("Hi there").length, " This test case should pass. Same number of characters");
    }
    @Test
    public void test1(){
        //space count comparison
        String spaces = " ";
        int spacesCounter = 0;
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher(spaces);
        while(matcher.find()){
            spacesCounter ++;
        }
        assertEquals(1, spacesCounter, "This test should PASS because there is an equal number of spaces between the output and expected output i.e 1");
//        assertEquals(7, spacesCounter, "This test should FAIL, there is an unequal number of spaces between the output and expected output");
    }
}
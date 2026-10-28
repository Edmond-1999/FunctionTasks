package shortestWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortestWordTest {
    @Test
    public void testShortestWord() {
        ShortestWord shortestWord = new ShortestWord();
        String sentence = "I like to dance";

        String expected = "I";
        String actual = shortestWord.shortestWord(sentence);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatIHaveASentenceThatHasTwoEquallyShortestWordsAndItReturnsTheFirstOne() {
        ShortestWord shortestWord = new ShortestWord();

        String sentence = "The way I dance is different from a different person";

        String expected = "I";
        String actual = shortestWord.shortestWord(sentence);

        assertEquals(expected, actual);
    }

    @Test
    public void testThatIHaveASentenceThatHasTwoEquallyShortestWordsAndItReturnsTheFirstOne2() {
        ShortestWord shortestWord = new ShortestWord();
        String sentence = ".. Hippopotamus ..";

        String expected = "Hippopotamus";
        String actual = shortestWord.shortestWord(sentence);

        assertEquals(expected, actual);
    }

}

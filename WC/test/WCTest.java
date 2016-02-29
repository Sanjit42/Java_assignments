import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WCTest {
    @Test
    public void counted_char_no_should_be_zero_when_give_empty_string() {
        WC wc = new WC("");
        wc.addScanner(new CharacterScanner());
        assertEquals("0", wc.count());
    }

    @Test
    public void count_is_0_when_there_is_no_character() throws Exception {
        WC wc = new WC("");
        wc.addScanner(new CharacterScanner());
        assertEquals("0", wc.count());

    }

    @Test
    public void count_no_of_chars_in_a_string() {
        WC wc = new WC("Do not write a main.");
        wc.addScanner(new CharacterScanner());
        assertEquals("20", wc.count());
    }

    @Test
    public void no_of_word_should_be_one_in_a_empty_string() {
        WC wc = new WC("");
        wc.addScanner(new WordScanner());
        assertEquals("0", wc.count());
    }

    @Test
    public void count_no_of_words_in_a_string() {
        WC wc = new WC("Do not write a main ");
        wc.addScanner(new WordScanner());
        assertEquals("5", wc.count());
    }

    @Test
    public void count_no_of_words_in_a_string_two_line() {
        WC wc = new WC("Do not \n write a main");
        wc.addScanner(new WordScanner());
        assertEquals("5", wc.count());
    }

    @Test
    public void no_of_line_should_be_0_in_a_empty_string() {
        WC wc = new WC("");
        wc.addScanner(new LineScanner());
        assertEquals("0", wc.count());
    }

    @Test
    public void test_total_no_of_line_in_a_string() {
        WC wc = new WC("Do not write a main\n ");
        wc.addScanner(new LineScanner());
        assertEquals("1", wc.count());
    }

    @Test
    public void test_total_no_of_lines_in_a_string() {
        WC wc = new WC("Do not write a main.\n As of now");
        wc.addScanner(new LineScanner());
        assertEquals("1", wc.count());
    }
}

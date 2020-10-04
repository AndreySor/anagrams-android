package com.foxminded.anagram;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    Anagram anagram = new Anagram();

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenStringNull() {
        anagram.reverse(null);
    }

    @Test
    public void shouldReturnEmptyStringWhenInputEmptyString() {
        String expected = "";
        String actual = anagram.reverse("");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnEmptyStringWhenInputContainsSpaces() {
        String expected = "";
        String actual = anagram.reverse("       ");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnLetterWhenInputLetter() {
        String expected = "d";
        String actual = anagram.reverse("d");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberWhenInputNumber() {
        String expected = "4";
        String actual = anagram.reverse("4");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSymbolWhenInputSymbol() {
        String expected = "!";
        String actual = anagram.reverse("!");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnInputtedSequenceSymbolsWhenInputContainsOnlySymbols() {
        String expected = "!@#.^:$%^&*()";
        String actual = anagram.reverse("!@#.^:$%^&*()");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnNumberslWhenInputContainsOnlyNumbers() {
        String expected = "12345";
        String actual = anagram.reverse("12345");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseWordWhenInputContainsOnlyLetters() {
        String expected = "abcd";
        String actual = anagram.reverse("dcba");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseOnlyLettersWhenInputContainsLettersAndSymbols() {
        String expected = "dc3!b5a4()";
        String actual = anagram.reverse("ab3!c5d4()");
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReverseEachWordSeparatelyWhenInputContainsSeveralWords() {
        String expected = "c1b2a3 4g5f6d";
        String actual = anagram.reverse("a1b2c3 4d5f6g");
        assertEquals(expected, actual);
    }
}

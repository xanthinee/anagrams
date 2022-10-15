package firstTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseTest {

    Reverse test = new Reverse();

    @Test
    void wordReverse_shouldReturnReversedWord_whenWordContainsDifferentLetters() {
        assertEquals("gfedcba", test.wordReverse("abcdefg"));
    }

    @Test
    void wordReverse_shouldReturnSingleCharacter_whenInputIsSingleCharacter() {
        assertEquals("a", test.wordReverse("a"));
    }

    @Test
    void wordReverse_shouldNotChangeWord_whenWordsContainsOnlySymbols() {
        assertEquals("!@#$%^&", test.wordReverse("!@#$%^&"));
    }

    @Test
    void wordReverse_shouldReturnWordWithReversedOnlyLetters_whenInputWordContainsLettersAndSymbols() {
        assertEquals("hk$m@t*ra", test.wordReverse("ar$t@m*kh"));
    }

    @Test
    void wordReverse_shouldSaveSpaceOnItsStartingPlace_whenInputWordContainsLeadingSpace() {
        assertEquals(" metra", test.wordReverse(" artem"));
    }

    @Test
    void wordReverse_shouldSaveSpaceOnItsStartingPlace_whenInputWordContainsTrailingSpace() {
        assertEquals("metra ", test.wordReverse("artem "));
    }

    @Test
    void stringReverse_shouldReturnReversedStringAndKeepSpaces_whenStringContainsStartingAndTrailingSpaces() {
        assertEquals(" metra vonrims  ", test.stringReverse(" artem smirnov  "));
    }

    @Test
    void stringReverse_shouldReturnReversedStringOfSameWord_whenInputIsStringOfSameWord() {
        assertEquals("metra metra metra", test.stringReverse("artem artem artem"));
    }

    @Test
    void stringReverse_shouldReturnNull_whenInputIsNull() {
        assertEquals(null, test.stringReverse(null));
    }

    @Test
    void stringReverse_shouldDoNothing_whenEmptyString() {
        assertEquals("", test.wordReverse(""));
    }

    @Test
    void stringReverse_shouldOutputSingleSpace_whenInputIsSingleSpace() {
        assertEquals(" ", test.stringReverse(" "));
    }

    @Test
    void stringReverse_shouldOutputSeveralSpaces_whenInputIsSeveralSpaces() {
        assertEquals("  ", test.stringReverse("  "));
    }

    @Test
    void stringReverse_shouldReturnReversedWords_whenInputIsSameWordInLowerAndUpperCases() {
        assertEquals("metra METRA", test.stringReverse("artem ARTEM"));
    }

    @Test
    void stringReverse_shouldReturnReversedSeveralDifferentWords_whenInputIsSeveralDifferentWords() {
        assertEquals("metra valsydalv yegres", test.stringReverse("artem vladyslav sergey"));
    }
}
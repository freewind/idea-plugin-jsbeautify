package idea.jsbeautify

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class CalculateNewCaretOffsetTest {

    @Test
    fun testOffsetInHead() {
        val offset = calculateNewCaretOffset("abc", 0, "abc")
        assertThat(offset).isEqualTo(0)
    }

    @Test
    fun testOffsetInMiddle() {
        val offset = calculateNewCaretOffset("a b  c", 3, "    a b c")
        assertThat(offset).isEqualTo(7)
    }

    @Test
    fun testOffsetInEnd() {
        val offset = calculateNewCaretOffset("abc", 3, "    a b c")
        assertThat(offset).isEqualTo(9)
    }

    @Test
    fun testLongTextToShort() {
        val offset = calculateNewCaretOffset("   a   b   c    ", 8, "abc")
        assertThat(offset).isEqualTo(2)
    }

    @Test
    fun testDuplicatedChars() {
        val offset = calculateNewCaretOffset("aaaaa", 3, "aaaaa")
        assertThat(offset).isEqualTo(3)
    }

    @Test
    fun testIncompatibleContentAfterCaret() {
        val offset = calculateNewCaretOffset("abcde", 3, "a b c123")
        assertThat(offset).isEqualTo(5)
    }

    @Test
    fun testIncompatibleContentBeforeCaret() {
        val offset = calculateNewCaretOffset("abcde", 3, "123456")
        assertThat(offset).isEqualTo(3)
    }

    @Test
    fun testCaretInSpaces() {
        val offset = calculateNewCaretOffset("a     b", 3, "ab")
        assertThat(offset).isEqualTo(1)
    }

}
import org.junit.Assert.assertEquals
import org.junit.Test
import subtask3.Abbreviation

class Task2AbbreviationTest {

    private val converter = Abbreviation()

    @Test
    fun testAbbreviation1() {
        assertEquals("YES", converter.abbreviationFromA("daBcd", "ABC"))
    }

    @Test
    fun testAbbreviation2() {
        assertEquals("YES", converter.abbreviationFromA("mnbTy", "BT"))
    }

    @Test
    fun testAbbreviation3() {
        assertEquals("YES", converter.abbreviationFromA("qWerty", "WY"))
    }

    @Test
    fun testAbbreviation4() {
        assertEquals("NO", converter.abbreviationFromA("ytrewq", "RY"))
    }

    @Test
    fun testAbbreviation5() {
        assertEquals("NO", converter.abbreviationFromA("abhfs", "ASCI"))
    }

    @Test
    fun testAbbreviation8() {
        assertEquals("NO", converter.abbreviationFromA("popo", "PPF"))
    }

    @Test
    fun testAbbreviation9() {
        assertEquals("YES", converter.abbreviationFromA("popadanez", "PP"))
    }

    @Test
    fun testAbbreviation10() {
        assertEquals("YES", converter.abbreviationFromA("poPadanez", "PP"))
    }

    @Test
    fun testAbbreviation11() {
        assertEquals("NO", converter.abbreviationFromA("popadAnEz", "PP"))
    }

    @Test
    fun testAbbreviation21() {
        assertEquals("YES", converter.abbreviationFromA("aaaaaaaaaa", "AAAAA"))
    }

    @Test
    fun testAbbreviation22() {
        assertEquals("YES", converter.abbreviationFromA("baaaaaaBaa", "BAA"))
    }

    @Test
    fun testAbbreviation23() {
        assertEquals("NO", converter.abbreviationFromA("baaaaaaBaA", "BAB"))
    }

    @Test
    fun testAbbreviation24() {
        assertEquals("YES", converter.abbreviationFromA("baaaaaaBaA", "BABA"))
    }

    @Test
    fun testAbbreviation36() {
        assertEquals("NO", converter.abbreviationFromA("gdssAdhgfhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation37() {
        assertEquals("YES", converter.abbreviationFromA("gdsasAdhgfhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation38() {
        assertEquals("YES", converter.abbreviationFromA("gdssAdhgafhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation39() {
        assertEquals("YES", converter.abbreviationFromA("gdssadhgafhdBdhnChdfh", "AABC"))
    }

    @Test
    fun testAbbreviation30() {
        assertEquals("YES", converter.abbreviationFromA(
            "AopghopghgophopBiopoghghCgopophopopgrhgh", "AGHGHGHBGHGHCGHGH"))
    }

    @Test
    fun testAbbreviation41() {
        assertEquals("NO", converter.abbreviationFromA(
            "baaaaaaBAA", "BABA"))
    }

    @Test
    fun testAbbreviation42() {
        assertEquals("NO", converter.abbreviationFromA(
            "babaaaaABABA", "BABA"))
    }
}

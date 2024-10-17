import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class TestExample {
    @Test
    fun `Basic Tests`() {
        assertEquals("*********\n* olleH *\n* dlroW *\n*********", mirror("Hello World"))
        assertEquals("************\n* srawedoC *\n************", mirror("Codewars"))
    }

    @Test
    fun `More advanced test`() {
        assertEquals("***********\n* yiawyer *\n* oywyim  *\n* atwdvpz *\n* apzqgh  *\n***********", mirror("reywaiy miywyo zpvdwta hgqzpa"))
    }
}
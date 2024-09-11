package solution


import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class  CubesTest {

    private fun testing(s: String, expect: String) {
        val actual: String = Cubes.isSumOfCubes(s)
        assertEquals(expect, actual)
    }
    @Test
    fun basicTests() {
        testing("0 9026315 -827&()", "0 0 Lucky")
        testing("Once upon a midnight dreary, while100 I pondered, 9026315weak and weary -827&()", "Unlucky")
        testing("Once 1000upon a midnight 110dreary, while100 I pondered, 9026315weak and weary -827&()", "0 0 Lucky")

    }
}
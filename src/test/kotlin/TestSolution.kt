import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class TestExample {
    fun checkF(input : Int, shouldBe : Int) = assertEquals(f(input), shouldBe)
    fun checkM(input : Int, shouldBe : Int) = assertEquals(m(input), shouldBe)

    @Test
    fun basicTests() {
        checkF(0, 1)
        checkF(5, 3)
        checkF(10, 6)
        checkF(15, 9)
        checkF(25, 16)
        checkM(0, 0)
        checkM(5, 3)
        checkM(10, 6)
        checkM(15, 9)
        checkM(25, 16)
    }
}
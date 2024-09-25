package solution

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class TestLongRunning {

    @Test
    fun longNumbersTests() {
        assertEquals(BigInteger.valueOf(6385476296235036), Diagonal.diagonal(1291, 5))
    }

    @Test
    fun veryLongNumberTest() {

        assertEquals(
            BigInteger(
                "15520018282794855145521771584008670616528023199516300148225151327498554518" +
                        "946739091210873083654062335657029403538513437778616308444771447785680961989809223546226398042673172" +
                        "9793794728652023023749985526341895119496429851855415" +
                        "24070069692166648244838032400"
            ), Diagonal.diagonal(5720, 120)
        )


    }
}
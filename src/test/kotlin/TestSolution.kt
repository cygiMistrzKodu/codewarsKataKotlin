package solution

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class DiagonalTest {

    @Test
    fun getPartOfDiagonalFromPascalRow() {
        assertEquals(BigInteger.ONE, Diagonal.partOfDiagonalFromRow(1, 1))
        assertEquals(BigInteger.ONE, Diagonal.partOfDiagonalFromRow(2, 2))
        assertEquals(BigInteger.ONE, Diagonal.partOfDiagonalFromRow(1, 1))
        assertEquals(BigInteger.ONE, Diagonal.partOfDiagonalFromRow(1, 0))
        assertEquals(BigInteger.TWO, Diagonal.partOfDiagonalFromRow(2, 1))
        assertEquals(BigInteger.ONE, Diagonal.partOfDiagonalFromRow(2, 2))
        assertEquals(BigInteger.valueOf(35), Diagonal.partOfDiagonalFromRow(7, 3))
        assertEquals(BigInteger.valueOf(21), Diagonal.partOfDiagonalFromRow(7, 5))
        assertEquals(BigInteger.valueOf(1), Diagonal.partOfDiagonalFromRow(7, 7))
    }


    @Test
    fun when1And0ThenDiagonalSum2() {
        assertEquals(BigInteger.valueOf(2), Diagonal.diagonal(1, 0))
    }

    @Test
    fun when2And0ThenDiagonalSum3() {
        assertEquals(BigInteger.valueOf(3), Diagonal.diagonal(2, 0))
    }

    @Test
    fun when3And0ThenDiagonalSum4() {
        assertEquals(BigInteger.valueOf(4), Diagonal.diagonal(3, 0))
    }

    @Test
    fun when2And1ThenDiagonalSum3() {
        assertEquals(BigInteger.valueOf(3), Diagonal.diagonal(2, 1))
    }

    @Test
    fun when3And1ThenDiagonalSum6() {
        assertEquals(BigInteger.valueOf(6), Diagonal.diagonal(3, 1))
    }

    @Test
    fun when3And2ThenDiagonalSum4() {
        assertEquals(BigInteger.valueOf(4), Diagonal.diagonal(3, 2))
    }

    @Test
    fun when4And0ThenDiagonalSum4() {
        assertEquals(BigInteger.valueOf(5), Diagonal.diagonal(4, 0))
    }

    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(5985), Diagonal.diagonal(20, 3))
        assertEquals(BigInteger.valueOf(20349), Diagonal.diagonal(20, 4))
        assertEquals(BigInteger.valueOf(54264), Diagonal.diagonal(20, 5))

    }

}
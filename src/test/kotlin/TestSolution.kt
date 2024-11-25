package solution

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class OpstringsTest {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }
    @Test
    fun test() {
        println("Fixed Tests vertMirror")
        var s = "hSgdHQ\nHnDMao\nClNNxX\niRvxxH\nbqTVvA\nwvSyRu"
        var r = "QHdgSh\noaMDnH\nXxNNlC\nHxxvRi\nAvVTqb\nuRySvw"
        testing(Opstrings.oper(Opstrings::vertMirror, s), r)
        s = "IzOTWE\nkkbeCM\nWuzZxM\nvDddJw\njiJyHF\nPVHfSx"
        r = "EWTOzI\nMCebkk\nMxZzuW\nwJddDv\nFHyJij\nxSfHVP"
        testing(Opstrings.oper(Opstrings::vertMirror, s), r)

        println("Fixed Tests horMirror")
        s = "lVHt\nJVhv\nCSbg\nyeCt"
        r = "yeCt\nCSbg\nJVhv\nlVHt"
        testing(Opstrings.oper(Opstrings::horMirror, s), r)
        s = "njMK\ndbrZ\nLPKo\ncEYz"
        r = "cEYz\nLPKo\ndbrZ\nnjMK"
        testing(Opstrings.oper(Opstrings::horMirror, s), r)

    }
}
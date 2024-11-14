package solution


import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class DirReductionTest {

    private fun testing(arr: Array<String>, expect: Array<String>) {
        val actual: Array<String> = DirReduction.dirReduc(arr)
        assertEquals(expect.contentDeepToString(), actual.contentDeepToString())
    }

    @Test
    fun basicTests() {
        var a = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST")
        testing(a, arrayOf("WEST"))
        a = arrayOf("NORTH", "WEST", "SOUTH", "EAST")
        testing(a, arrayOf("NORTH", "WEST", "SOUTH", "EAST"))
        a = arrayOf("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "NORTH")
        testing(a, arrayOf("NORTH"))
        a = arrayOf("NORTH", "EAST", "NORTH", "EAST", "WEST", "WEST", "EAST", "EAST", "WEST", "SOUTH")
        testing(a, arrayOf("NORTH", "EAST"))
        a = arrayOf("")
        testing(a, arrayOf(""))

    }

    @Test
    fun emptyAndNullDirectionIsEmpty() {
        var a = arrayOf("")
        testing(a, arrayOf(""))

        a = emptyArray()
        testing(a, arrayOf(""))
    }

    @Test
    fun goToOneDirection() {
        var a = arrayOf("NORTH")
        testing(a, arrayOf("NORTH"))

        a = arrayOf("SOUTH")
        testing(a, arrayOf("SOUTH"))

        a = arrayOf("WEST")
        testing(a, arrayOf("WEST"))

    }

    @Test
    fun directionThatShouldNotBeReduced() {
        var a = arrayOf("NORTH", "NORTH")
        testing(a, arrayOf("NORTH", "NORTH"))

        a = arrayOf("SOUTH", "SOUTH")
        testing(a, arrayOf("SOUTH", "SOUTH"))

        a = arrayOf("WEST", "WEST", "WEST")
        testing(a, arrayOf("WEST", "WEST", "WEST"))

        a = arrayOf("EAST", "EAST", "EAST")
        testing(a, arrayOf("EAST", "EAST", "EAST"))

        a = arrayOf("EAST", "NORTH", "NORTH")
        testing(a, arrayOf("EAST", "NORTH", "NORTH"))

        a = arrayOf("NORTH", "WEST", "SOUTH", "EAST")
        testing(a, arrayOf("NORTH", "WEST", "SOUTH", "EAST"))

        a = arrayOf("SOUTH", "WEST", "NORTH", "EAST")
        testing(a, arrayOf("SOUTH", "WEST", "NORTH", "EAST"))
    }

    @Test
    fun directionToReduced() {
        var a = arrayOf("NORTH", "SOUTH")
        testing(a, arrayOf(""))

        a = arrayOf("WEST", "EAST")
        testing(a, arrayOf(""))

        a = arrayOf("EAST", "WEST")
        testing(a, arrayOf(""))

        a = arrayOf("SOUTH", "NORTH")
        testing(a, arrayOf(""))

        a = arrayOf("NORTH", "SOUTH", "WEST")
        testing(a, arrayOf("WEST"))

        a = arrayOf("NORTH", "SOUTH", "WEST", "EAST")
        testing(a, arrayOf(""))

        a = arrayOf("NORTH", "SOUTH", "WEST", "EAST", "NORTH")
        testing(a, arrayOf("NORTH"))

        a = arrayOf("SOUTH", "WEST", "WEST", "NORTH", "NORTH", "SOUTH", "EAST")
        testing(a, arrayOf("SOUTH", "WEST", "WEST", "NORTH", "EAST"))

        a = arrayOf("SOUTH", "EAST", "WEST", "NORTH")
        testing(a, arrayOf(""))
    }


    @Test
    fun optimizedDirectionTest() {

        var directions = listOf("NORTH", "SOUTH")
        var toRemove = listOf("NORTH", "SOUTH")

        val testBefore = DirReduction.optimizeDirection(directions, toRemove)

        println(testBefore)

        assertContentEquals(emptyList(), testBefore)

        directions = listOf("SOUTH", "EAST", "WEST", "NORTH")
        toRemove = listOf("EAST", "WEST")

        val test = DirReduction.optimizeDirection(directions, toRemove)

        println(test)

        assertContentEquals(listOf("SOUTH", "NORTH"), DirReduction.optimizeDirection(directions, toRemove))


    }
}
package updown


import kotlin.test.Test
import kotlin.test.assertEquals

private fun testing(actual:String, expected:String) {
    assertEquals(expected, actual)
}
class arrangestringMainTest {
    @Test
    fun test() {
        println("Fixed Tests updown")
        testing(arrange("who hit retaining The That a we taken"),
            "who RETAINING hit THAT a THE we TAKEN") // 3
        testing(arrange("on I came up were so grandmothers"),
            "i CAME on WERE up GRANDMOTHERS so") // 4
        testing(arrange("way the my wall them him"),
            "way THE my WALL him THEM") // 1
    }
}
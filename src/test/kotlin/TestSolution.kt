package solution

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PhoneDirTest {
    private fun testing(actual: String, expected: String) {
        assertEquals(expected, actual)
    }

    val dr = ("/+1-541-754-3010 156 Alphand_St. <J Steeve>\n 133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010\n"
            + "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n <P Salinger> Main Street, +1-098-512-2222, Denver\n"
            + "<Q Salinge> Main Street, +1-098-512-2222, Denve\n" + "<R Salinge> Main Street, +1-098-512-2222, Denve\n"
            + "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado\n")

    @Test
    fun test1() {
        testing(
            PhoneDir.phone(dr, "48-421-674-8974"),
            "Phone => 48-421-674-8974, Name => Anastasia, Address => Via Quirinal Roma"
        )
        testing(
            PhoneDir.phone(dr, "19-421-674-8974"),
            "Phone => 19-421-674-8974, Name => C Powel, Address => Chateau des Fosses Strasbourg F-68000"
        )
        testing(PhoneDir.phone(dr, "1-098-512-2222"), "Error => Too many people: 1-098-512-2222")
        testing(PhoneDir.phone(dr, "5-555-555-5555"), "Error => Not found: 5-555-555-5555")

    }

    @Test
    fun errorCases() {
        testing(PhoneDir.phone(dr, "1-098-512-2222"), "Error => Too many people: 1-098-512-2222")
        testing(PhoneDir.phone(dr, "5-555-555-5555"), "Error => Not found: 5-555-555-5555")
    }

    @Test
    fun findHowManyPhoneTest() {
        var phoneBookEntry = "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000"

        assertEquals(1, PhoneDir.countPhone(phoneBookEntry, "19-421-674-8974"))

        phoneBookEntry = "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n" +
                "<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000\n"

        assertEquals(2, PhoneDir.countPhone(phoneBookEntry, "19-421-674-8974"))

        phoneBookEntry = "<Elizabeth Corber> +8-421-674-8974 Via Papa Roma\n" +
                "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n"

        assertEquals(1, PhoneDir.countPhone(phoneBookEntry, "8-421-674-8974"))
    }

    @Test
    fun getEntryWithPhoneNumberTest() {

        assertEquals("<Anastasia> +48-421-674-8974 Via Quirinal Roma", PhoneDir.getPhoneLine(dr,"48-421-674-8974"))

        val twoEntry = "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n<Elizabeth Corber> +8-421-674-8974 Via Papa Roma\n"

        assertEquals("<Elizabeth Corber> +8-421-674-8974 Via Papa Roma", PhoneDir.getPhoneLine(twoEntry,"8-421-674-8974"))

    }

    @Test
    fun getNameFromPhoneEntryTest() {
        assertEquals("Anastasia", PhoneDir.nameFromEntry("<Anastasia> +48-421-674-8974 Via Quirinal Roma"))
        assertEquals("Bernard Deltheil", PhoneDir.nameFromEntry(" <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado"))
        assertEquals("E Kustur", PhoneDir.nameFromEntry("133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010"))
    }

    @Test
    fun getAddressOneEntryTest() {
        assertEquals("Via Quirinal Roma", PhoneDir.addressFromEntry("<Anastasia> +48-421-674-8974 Via Quirinal Roma"))
        assertEquals("Mount Av. Eldorado", PhoneDir.addressFromEntry(" <Bernard Deltheil> +1-498-512-2222; Mount Av.  Eldorado"))
        assertEquals("133 Green Rd. NY-56423", PhoneDir.addressFromEntry("133, Green, Rd. <E Kustur> NY-56423 ;+1-541-914-3010"))
        assertEquals("Chateau des Fosses Strasbourg F-68000", PhoneDir.addressFromEntry("<C Powel> *+19-421-674-8974 Chateau des Fosses Strasbourg F-68000"))
        assertEquals("156 Alphand St.", PhoneDir.addressFromEntry("/+1-541-754-3010 156 Alphand_St. <J Steeve>"))
        assertEquals("Eleonore Street QB-87209", PhoneDir.addressFromEntry("<Robert Mitch> Eleonore Street QB-87209 +2-481-512-2222?"))
        assertEquals("156 Alphand St.", PhoneDir.addressFromEntry("/+1-541-754-3010 156 Alphand_St. <J Steeve>"))
        assertEquals("PO Box 5300 Albertville SC-28573", PhoneDir.addressFromEntry("+5-541-984-3012 <Peter Reeves> /PO Box 5300; Albertville, SC-28573"))
        assertEquals("San Antonio TT-45120", PhoneDir.addressFromEntry("<Arthur Clarke> San Antonio $+1-121-504-8974 TT-45120"))
        assertEquals("1333 Green Road NW-46423", PhoneDir.addressFromEntry(" 1333, Green, Road <F Fulgur> NW-46423 ;+6-541-914-3010!"))
        assertEquals("Sequoia Alley PQ-67209", PhoneDir.addressFromEntry(" :+1-321-512-2222 <Paul Dive> Sequoia Alley PQ-67209"))
        assertEquals("Via Papa Roma", PhoneDir.addressFromEntry("<Elizabeth Corber> +8-421-674-8974 Via Papa Roma"))

//        val twoEntry = "<Anastasia> +48-421-674-8974 Via Quirinal Roma\n + <Elizabeth Corber> +8-421-674-8974 Via Papa Roma\n"
//
//        assertEquals("Via Papa Roma", PhoneDir.addressFromEntry(twoEntry))

    }
}
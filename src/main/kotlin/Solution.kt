package solution

object PhoneDir {

    fun phone(strng: String, num: String): String {

        val countOfPhone = countPhone(strng, num)

        if (countOfPhone == 0) {
            return "Error => Not found: $num"
        }

        if (countOfPhone > 1) {
            return "Error => Too many people: $num"
        }

        val phoneLine = getPhoneLine(strng, num)
        return "Phone => $num, Name => ${nameFromEntry(phoneLine)}, Address => ${addressFromEntry(phoneLine)}"
    }

    fun countPhone(phoneBook: String, phone: String): Int {
        return ("\\b$phone").toRegex().findAll(phoneBook).count()
    }

    fun getPhoneLine(phoneBook: String, phone: String): String {
        return phoneBook.split("\n").filter { Regex("\\b$phone").containsMatchIn(it) }
            .toList().getOrElse(0) { "" }
    }

    fun nameFromEntry(phoneBookOneEntry: String): String {

        return "<(.*)>".toRegex().find(phoneBookOneEntry)?.groupValues?.get(1) ?: ""
    }

    fun addressFromEntry(phoneBookOneEntry: String): String {
        val namePlace = "<.*>".toRegex()
        val phonePlace = "\\d+-\\d+-\\d+-\\d+".toRegex()
        val removeSign = "[/;+*?,$!:\"']*".toRegex()
        val replaceWithWhiteSpace = "_+".toRegex()

        return phoneBookOneEntry.replace(namePlace, "")
            .replace(phonePlace, "").replace(removeSign, "")
            .replace(replaceWithWhiteSpace, " ").trim().split("\\s+".toRegex())
            .joinToString(" ")
    }

}
package solution

object MatchSubst {

    fun change(s: String, prog: String, version: String): String {

        var phoneNumber = getElementFromLine(getPhoneLine(s))
        if (!isPhoneValid(phoneNumber)) {
            return "ERROR: VERSION or PHONE"
        } else {
            phoneNumber = "+1-503-555-0090"
        }

        var versionNumber = getElementFromLine(getVersionLine(s))
        if (!isVersionValid(versionNumber)) {
            return "ERROR: VERSION or PHONE"
        } else {
            if (versionNumber != "2.0") {
                versionNumber = version
            }

        }

        return "Program: $prog Author: g964 Phone: $phoneNumber Date: 2019-01-01 Version: $versionNumber"
    }

    fun isPhoneValid(phone: String): Boolean {
        return phone.matches("\\+1-\\d{3}-\\d{3}-\\d{4}".toRegex())
    }

    fun isVersionValid(version: String): Boolean {
        return version.matches("\\d+\\.\\d+".toRegex())
    }

    fun getPhoneLine(input: String): String {
        return "Phone:.*".toRegex().find(input)?.value ?: ""
    }

    fun getVersionLine(input: String): String {
        return "Version:.*".toRegex().find(input)?.value ?: ""
    }

    fun getElementFromLine(line: String): String {
        val parts = line.split(":")

        return if (parts.size > 1) {
            parts[1].trim()
        } else {
            ""
        }
    }

}
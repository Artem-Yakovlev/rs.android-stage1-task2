package subtask2

class TimeConverter {

    private val verbalTimes = arrayOf(
        "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
        "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen",
        "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
        "twenty six", "twenty seven", "twenty eight", "twenty nine"
    )

    fun toTextFormat(hour: String, minute: String) = try {
        val numberHours = hour.toInt()
        val numberMinutes = minute.toInt()
        if (numberHours in 1..23 && numberMinutes in 0..59) {
            giveVerbalTime(numberHours, numberMinutes)
        } else {
            ""
        }
    } catch (numberFormatException: NumberFormatException) {
        ""
    }

    private fun giveVerbalTime(nHours: Int, nMinute: Int) = when (nMinute) {
        0 -> "${verbalTimes[nHours - 1]} o' clock"
        1 -> "one minute past ${verbalTimes[nHours - 1]}"
        15 -> "quarter past ${verbalTimes[nHours - 1]}"
        in 2..29 -> "${verbalTimes[nMinute - 1]} minutes past ${verbalTimes[nHours - 1]}"
        30 -> "half past ${verbalTimes[nHours - 1]}"
        31 -> "one minute to ${verbalTimes[nHours - 1]}"
        45 -> "quarter to ${verbalTimes[nHours]}"
        in 32..59 -> "${verbalTimes[59 - nMinute]} minutes to ${verbalTimes[nHours]}"
        else -> ""
    }
}

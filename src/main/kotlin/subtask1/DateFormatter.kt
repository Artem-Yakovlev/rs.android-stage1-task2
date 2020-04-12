package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String = try {

        val readableDate = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            .format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))

        if (readableDate[0] == '0') {
            readableDate.substring(1)
        } else {
            readableDate
        }

    } catch (exception: Exception) {
        "Такого дня не существует"
    }


}

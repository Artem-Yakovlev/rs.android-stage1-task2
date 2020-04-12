package subtask5

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any = when (blockB) {
        String::class -> blockA.filterIsInstance<String>().joinToString("")
        Int::class -> blockA.filterIsInstance<Int>().sum()
        else -> blockA.filterIsInstance<LocalDate>()
            .minWith(NearestDateComparator)?.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) ?: ""
    }

    private object NearestDateComparator : Comparator<LocalDate> {

        private val actualDate = LocalDate.now()

        override fun compare(p0: LocalDate?, p1: LocalDate?): Int {
            val firstOperand = kotlin.math.abs(ChronoUnit.DAYS.between(p0, actualDate))
            val secondOperand = kotlin.math.abs(ChronoUnit.DAYS.between(p1, actualDate))
            return firstOperand.compareTo(secondOperand)
        }

    }
}

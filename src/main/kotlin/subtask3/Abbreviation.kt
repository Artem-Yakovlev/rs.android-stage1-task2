package subtask3

class Abbreviation {

    companion object {
        private const val POSITIVE_RESULT = "YES"
        private const val NEGATIVE_RESULT = "NO"
    }

    fun abbreviationFromA(a: String, b: String) = if (a.toUpperCase() == b) {
        POSITIVE_RESULT
    } else {
        val convertPossibility = Array(a.length + 1) { BooleanArray(b.length + 1) }
        for (i in a.indices) {
            for (j in convertPossibility[0].indices) {
                if (convertPossibility[i][j] || i + j == 0) {
                    if (j < b.length && a[i].equals(b[j], true)) {
                        convertPossibility[i + 1][j + 1] = true
                    }
                    if (a[i].isLowerCase()) {
                        convertPossibility[i + 1][j] = true
                    }
                }
            }
        }
        if (convertPossibility[a.length][b.length]) POSITIVE_RESULT else NEGATIVE_RESULT
    }

}

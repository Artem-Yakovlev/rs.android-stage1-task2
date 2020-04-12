package subtask4

import java.lang.StringBuilder

class Pangram {

    companion object {
        private val VOWELS = setOf('a', 'e', 'i', 'o', 'u', 'y')
    }

    fun getResult(inputString: String): String {
        val wordsPairs = ArrayList<Pair<Int, String>>()
        val isInputStringPangram = isStringPangram(inputString)

        inputString.split(Regex("\\s+")).filter { it != "" }.forEach {
            wordsPairs.add(getResultPairFromWord(it, isInputStringPangram))
        }

        return wordsPairs
            .apply { sortBy { it.first } }
            .joinToString(" ") { "${it.first}${it.second}" }
    }

    private fun isStringPangram(sentence: String): Boolean {
        val lowerSentence = sentence.toLowerCase()
        for (letter in 'a'..'z') {
            if (letter !in lowerSentence) {
                return false
            }
        }
        return true
    }

    private fun getResultPairFromWord(word: String, countVowels: Boolean): Pair<Int, String> {
        var numberLetters = 0
        val editedWord = StringBuilder(word)

        for (i in editedWord.indices) {
            if (isDesiredTypeOfLetter(editedWord[i], countVowels)) {
                editedWord[i] = editedWord[i].toUpperCase()
                numberLetters++
            }
        }

        return numberLetters to editedWord.toString()
    }

    private fun isDesiredTypeOfLetter(symbol: Char, isDesiredVowel: Boolean) = symbol.isLetter() &&
            if (isDesiredVowel) {
                symbol.toLowerCase() in VOWELS
            } else {
                symbol.toLowerCase() !in VOWELS
            }

}

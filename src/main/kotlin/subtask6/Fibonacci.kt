package subtask6

class Fibonacci {

    fun productFibonacciSequenceFor(n: Int): IntArray {
        var firstFib = 0
        var secondFib = 1
        while (firstFib * secondFib < n) {
            firstFib = secondFib.also { secondFib += firstFib }
        }
        return intArrayOf(firstFib, secondFib, if (firstFib * secondFib == n) 1 else 0)
    }
}

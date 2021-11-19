
fun isPalindrome(word: String): Boolean {

        var answer: Boolean

        if (word == word.reversed()) {
                answer = true
        } else {
                answer = false
        }

        return answer
}

fun minSplit(amount: Int): Int {

        var answer: Int = 0
        var amount = amount

        while (amount != 0) {
                if (amount / 50 >= 1) {
                        amount -= 50
                        answer += 1
                } else if ( amount / 20 >= 1 ) {
                        amount -= 20
                        answer += 1
                } else if (amount / 10 >= 1) {
                        amount -= 10
                        answer += 1
                } else if (amount / 5 >= 1) {
                        amount -= 5
                        answer += 1
                } else if (amount / 1 >= 1) {
                        amount -= 1
                        answer += 1
                }
        }

        return answer
}

fun notContains(nums: Array<Int>): Int {

        var answer: Int = 0
        var checker: Int = 1

        while (answer == 0) {
                if (checker in nums) {
                        checker += 1
                } else {
                        answer = checker
                }
        }

        return answer
}

fun countVariants(n: Int): Int {

        var n1 = 0
        var n2 = 1

        for (i in 1..n) {
                val sum = n1 + n2
                n1 = n2
                n2 = sum
        }

        return n2
}

fun main(args: Array<String>) {
        //print(isPalindrome("reviver"))
        //print(minSplit(174))

        var nums: Array<Int> = arrayOf(1, 2, 3, 5, 10, 77, 43, 23, 12)
        //print(notContains(nums))
        //print(countVariants(7))
}


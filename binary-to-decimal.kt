fun main(args: Array<String>) {
    var sum = 0
    var base = 2

    val binaryDigit = readLine()!!

    var index = binaryDigit.length - 1

    for (i in binaryDigit) {
        val u = Character.getNumericValue(i)
        sum += u * calcPower(base, index)
        println(sum)
        --index
    }

    var dec = sum
    println(dec)
}

fun calcPower(base: Int, exponent: Int): Int {
    var exponent = exponent
    var result = 1
    while (exponent != 0) {
        result *= base
        println("Result > $result")
        --exponent
    }
    return result
}

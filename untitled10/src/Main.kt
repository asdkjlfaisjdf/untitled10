import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val array = arrayOf(1,3,44,88,5,7)
    val array1 = IntArray(100)
    var count = 0
    var res = 0

    for (arr in array.indices) {
        println(" " + array[arr])
        if (array[arr]% 2 == 0) {
            array1[count] = array[arr]
            count++
        }
    }
    println()
    for (element in 0 until count) {
        print(" " + array1[element])
        res+= array1[element]
    }
    println(" bunday sonlar $count ta")
    println(res)
}
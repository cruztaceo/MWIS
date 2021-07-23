import java.io.File
import kotlin.math.max

fun main() {
    val inputFileName = "src/main/resources/MWIS.txt"
    val input = readFileAsLinesUsingBufferedReader(inputFileName).map { it.toInt() }.toIntArray()

    val result = mwis(input)

    println(result.contentToString())

    val optimalIndex = intArrayOf(1, 2, 3, 4, 17, 117, 517, 997)
    val filteredResult = result.filter { i -> optimalIndex.contains(i) }.toIntArray()

    println(filteredResult.contentToString())
}

/**
 * Read file
 *
 * @param fileName Read file
 * @return List of strings read
 */
fun readFileAsLinesUsingBufferedReader(fileName: String): List<String> = File(fileName).bufferedReader().readLines()

fun mwis(w: IntArray): IntArray {
    val n = w.size
    val a = mutableListOf(0, w[0])
    println(a.toIntArray().contentToString())
    for (i in 2 until n + 1)
        a.add(max(a[i - 1], a[i - 2] + w[i - 1]))
    println(a.toIntArray().contentToString())

    var i = n
    val s = mutableListOf<Int>()
    while (i >= 1) {
        i -= if (a[i] == a [i-1]) {
            1
        } else {
            s.add(i)
            2
        }
    }
    return s.toIntArray().reversedArray()
}
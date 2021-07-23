import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun mwis() {
        val array = intArrayOf(5, 2, 3, 1, 18, 2, 6, 9, 12)
        // Index n = intArrayOf(0, 2, 4, 6, 8)
        // Index n + 1 = intArrayOf(1, 3, 5, 7, 9)
        val result = intArrayOf(1, 3, 5, 7, 9)
        assertArrayEquals(result, mwis(array))
    }
}
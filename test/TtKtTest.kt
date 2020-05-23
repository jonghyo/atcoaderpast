import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class TtKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "4 2 9";
        val output =
            "8";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "4 2 7";
        val output =
            "7";

        assertIO(input, output);
    }

    @Test
    fun 入力例_3() {
        val input =
            "4 2 8";
        val output =
            "8";

        assertIO(input, output);
    }

    @Test
    fun 入力例_4() {
        val input =
            "4 10 8";
        val output =
            "8";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        torT()

        assertEquals(sysOut.toString(), output+ System.lineSeparator())
        println(sysOut.toString())
    }
}

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.PrintStream

internal class RollerCoasterKtTest {

    @Test
    fun 入力例_1() {
        val input =
            "4 150" + System.lineSeparator() +
                    "150 140 100 200";
        val output =
            "2";

        assertIO(input, output);
    }

    @Test
    fun 入力例_2() {
        val input =
            "1 500" + System.lineSeparator() +
                    "499";
        val output =
            "0";

        assertIO(input, output);
    }

    @Test
    fun 入力例_3() {
        val input =
            "5 1" + System.lineSeparator() +
                    "100 200 300 400 500";
        val output =
            "5";

        assertIO(input, output);
    }

    @Test
    fun 入力例_4() {
        val input =
            "6 300" + System.lineSeparator() +
                    "100 0 100 100 101 300";
        val output =
            "1";

        assertIO(input, output);
    }

    private fun assertIO(input: String, output: String) {
        val sysIn = ByteArrayInputStream(input.toByteArray())
        System.setIn(sysIn)

        val sysOut = ByteArrayOutputStream()
        System.setOut(PrintStream(sysOut))

        rollerCoaster()

        assertEquals(sysOut.toString(), output + System.lineSeparator())
    }
}


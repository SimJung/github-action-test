import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class CalculatorTest {
    @Test
    fun testAdd() {
        val calculator = Calculator()
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }
}
import kotlin.test.Test
import kotlin.test.assertEquals

class variant4KtTest {
    val EPS = 0.000001

    @Test
    fun testVar4calcS() {
        assertEquals(1.397903, var4calcS(0.335), EPS)
    }

    @Test
    fun testVar4calcF() {
        assertEquals(0.347382, var4calcF(0.335, 0.025), EPS)
    }
}
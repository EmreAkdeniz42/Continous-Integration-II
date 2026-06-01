import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PrimeCheckTest {
  // --------------------------------------------------------------- //
  @Test
  public void TestNegativeNumbers() {
    for (int i = -10; i < 0; ++i) {
      assertEquals("Test negative number " + i, false, PrimeCheck.isPrime(i));
    }
  }

  // --------------------------------------------------------------- //
  @Test
  public void TestEdgeCases() {
    assertEquals("Test 0", false, PrimeCheck.isPrime(0));
    assertEquals("Test 1", false, PrimeCheck.isPrime(1));
    assertEquals("Test 2", true, PrimeCheck.isPrime(2));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testPrimes() {
    assertEquals(true, PrimeCheck.isPrime(2));
    assertEquals(true, PrimeCheck.isPrime(11));
    assertEquals(true, PrimeCheck.isPrime(19));
    assertEquals(true, PrimeCheck.isPrime(89));
  }

  // --------------------------------------------------------------- //
  @Test
  public void testNonPrimes() {
    assertEquals(false, PrimeCheck.isPrime(75));
    assertEquals(false, PrimeCheck.isPrime(86));
    assertEquals(false, PrimeCheck.isPrime(99));
    assertEquals(false, PrimeCheck.isPrime(123));
    assertEquals(false, PrimeCheck.isPrime(1235));
  }
}

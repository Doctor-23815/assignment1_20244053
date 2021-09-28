package TodayJunior.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
@Test
public void testAdd() {
Calculator calculator = new Calculator();
int a = 5;
int b = 4;
int actual = calculator.add(a, b);
int expected = 9;
assertEquals(expected, actual, "Sum is not correct");
}
@Test
void testSubtract() {
fail("Not yet implemented");}
}

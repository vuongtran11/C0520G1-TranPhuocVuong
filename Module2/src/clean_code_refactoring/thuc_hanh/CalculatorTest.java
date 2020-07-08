package clean_code_refactoring.thuc_hanh;

import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
    @DisplayName("Test")
    void testCalculateAdd() {
        int firstOperand = 1;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    private void assertEquals(int expected, int result) {
    }

}


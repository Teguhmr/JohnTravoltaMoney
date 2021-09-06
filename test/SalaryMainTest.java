import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryMainTest {

    @Test
    void testSalary() {
        int salaryExpected = 870000;
        assertEquals(salaryExpected, SalaryMain.calculateSalary(52));
    }

    @Test
    void testMessageSaveMoney() {
        String messageExpected = "Bisa menabung";
        assertEquals(messageExpected, SalaryMain.saveMoneyMessage(SalaryMain.calculateSalary(52), 600000));
    }

    @Test
    void testSavings() {
        int savingsExpected = 270000;
        assertEquals(savingsExpected, SalaryMain.calculateAmountSaving(SalaryMain.calculateSalary(52), 600000));
    }
}
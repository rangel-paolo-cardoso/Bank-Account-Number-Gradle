package bank.account;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class AccountNumberFormatterTest {
    private static AccountNumberFormatter formatter;

    AccountNumberFormatterTest() {
        formatter = new AccountNumberFormatter();
    }

    @Test
    @DisplayName("1 - Formats account number less than 6 digits.")
    public void formatAccountNumberLessThan6Digits() {
        assertEquals("000448", formatter.formatAccountNumber(448));
    }

    @Test
    @DisplayName("2 - Formats account number greater than 6 digits.")
    public void formatAccountNumberGreaterThan6Digits() {
        assertEquals("567890", formatter.formatAccountNumber(1234567890));
    }

    @Test
    @DisplayName("3 - Formats account number equal to 6 digits.")
    public void formatAccountNumberEqualTo6Digits() {
        assertEquals("111111", formatter.formatAccountNumber(111111));
    }
}

package bank.account;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.DisplayName;

class AppTest {
    
    @Test
    @DisplayName("1 - Runs the main method successfully.")
    public void successExecution() {
        String userInpuString = "448";

        ByteArrayInputStream consoleInput = new ByteArrayInputStream(userInpuString.getBytes());
        System.setIn(consoleInput);

        ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(consoleOutput);
        System.setOut(printStream);

        App.main(null);

        String[] lines = consoleOutput.toString().split(System.lineSeparator());
        String finalOutput = lines[lines.length - 1];

        assertEquals("Account number: 000448", finalOutput);
    }
}

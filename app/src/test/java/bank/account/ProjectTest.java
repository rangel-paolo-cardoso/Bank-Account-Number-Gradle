package bank.account;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    @Test
    @DisplayName("1 - Verifies if the project contains the dependency Apache Commons.")
    public void testIfProjectContainsApacheCommonsDependency() {
        try {
            File pom = new File("build.gradle.kts");
            try (BufferedReader reader = new BufferedReader(new FileReader(pom))) {
                boolean isValid = false;
                String line;
                while ((line = reader.readLine()) != null && !isValid) {
                    System.out.println(line);
                    isValid = line.contains("commons-lang3");
                }
                assertTrue(isValid);
            }
        } catch (Exception error) {
            error.printStackTrace();
            assertFalse(true);
        }
    }

    @Test
    @DisplayName("2 - Verifies if the file build.gradle exists.")
    public void testIfProjectContainsDependyManager() {
        try {
            File pom = new File("build.gradle.kts");
            assertTrue(pom.exists());
        } catch (Exception error) {
            assertFalse(true);
        }
    }
}

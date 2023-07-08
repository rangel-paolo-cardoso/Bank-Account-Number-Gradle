package bank.account;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Rangel Paolo Cardoso Bomfim (Java Developer).
 */
public class App {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the account number:");
            int accountNumber = sc.nextInt();

            AccountNumberFormatter formatter = new AccountNumberFormatter();
            System.out.println("Account number: " + formatter.formatAccountNumber(accountNumber));
        } catch (InputMismatchException e) {
            System.out.println("Invalid account number!");
        }
    }
}

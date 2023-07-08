# Challenge requirements

### Aggregator Challenge: Bank Account Validator System

Hello! Today our aggregator challenge will put us in a scenario where we will supposedly be within a development team of a financial institution, and you, as a developer, will be responsible for implementing a small support system for validating bank accounts.

Our software architect has put together a technical specification that has been designated as a demand for you. Below are the details:

>  TECHNICAL SPECIFICATION
> ------------
> **Project**: Bank Account Validator
>
> **Objective**: We have found that other financial institutions do not establish the same format for sending account numbers when using the wire transfer function. Therefore, the development of this system aims to ensure that the account number format informed by the user is to the guidelines of our institution (account numbers with 6 digits).
>
> **Requirements**:
>
> - Set the project to `gradle` to maintain automated, scalable, and distributed dependency management;
> - Use the `Apache Commons Lang` library in version `3.11` to ensure adherence between all other company projects;
> - The user must enter the bank account number (numbers only) on the system console, and the system will validate whether the entered value is greater than, less than, or equal to 6 digits — which will lead to one of the actions below:
    >   - `account < 6 digits`: must add zeros to the left until reaching the size of 6 numbers;
    >   - `account > 6 digits`: all numbers before the last 6 must be removed;
    >   - `account = 6 digits`: already adhered, the value must remain unchanged.
> - Non-numeric values will not be accepted;
> - Package the application in `jar` format for deployment.

#### Demand Overview 📄

- **Step 1 ☕**: The company only works with `gradle` as a dependency manager for the project;
- **Step 2 ☕**: If you have already installed and configured gradle on your desktop, you can now start downloading the packages from [gradle](https://gradle.org/releases/ "Go to website") directly from the official website and proceed with creation;

  > Tip 💡: It is suggested to use `gradle 6.9.2` versions.

- **Step 3 ☕**: Take the following parameters for the application as a reference:

  > #### GRADLE
  >
  > **Type**: java-application, **Language**: java, **Multiple subprojects**: no, **DSL language**: Groovy, **Project name**: bank-account, **Source package**: com.betrybe.acc.java.bankaccount

- **Step 4 ☕**: Before starting to implement the solution, remember to consciously change your `build.gradle` file:
  - Add the `Apache Commons Lang version 3.11` dependency in the project's dependencies block;
  - Update the project's dependencies so that it downloads the necessary libraries, which will be used during the next steps.

- **Step 5 ☕**: For the project, we won't need many files. First, we will need a class with the `main` method to initialize our application and a second class that we can name `AccountNumberFormatter.java` with a method called `formatAccountNumber` to format the bank account number;

  ```java
  public class Application {
      
      public static void main(String[] args) {
          // Use prior knowledge to read the user input, capture the account number, create an instance of the AccountNumberFormatter class, and get the formatted account number returned.
      }
      
  }
  ```
  
  ```java
  public class AccountNumberFormatter {
      
      public String formatAccountNumber(int literalAccountNumber) {
          return "fomattedNumber";
      }
      
  }
  ```

- **Step 6 ☕**: If you have doubts about implementing a way to format the bank account number within the `formatAccountNumber` method, don't forget that the `Apache Commons Lang` library is here to make our work easier. You can use two helpful methods:

  ```java
  /*
  The right method removes all characters on the left and keeps all characters on the right. The value corresponds to the string that will be processed, and the length corresponds to the number of characters that must remain intact on the right.
  */
  StringUtils.right(String value, int length);
  
  /*
  The leftPad method adds a character padding to the left of a String. The value corresponds to the string that will be processed, the length corresponds to the length of the string and the prefix corresponds to the character that should fill in the missing spaces.
  */
  StringUtils.leftPad(String value, int length, Char prefix);
  ```

- **Step 7 ☕**: The last step will be to package the application into an executable `.jar` file. Use your dependency manager to complete this task. In the case of `gradle`, if all the steps are aligned with the steps of this *overview*, a `.jar` file should be generated in the `/build/libs/` directory

> **Tip** 💡: To run the generated .jar file at the end of the process, use the command `java -jar where-is-your-jar-file`.

# Exemples 👓

If the user enters the account `448` in the console input, they should get ok feedback as a result:

    Enter account number:
    448
    Account number: 000448

However, if the user enters the account `1234567890` in the console input, he should get the warning message:

    Enter account number:
    1234567890
    Account number: 567890

If a non-numeric value is entered (for instance `12345-X`), a validation message should appear:

    Enter account number:
    12345-X
    Invalid account number!

Good luck and focus on quality delivery! 😉


---
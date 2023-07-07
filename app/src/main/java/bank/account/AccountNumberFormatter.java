package bank.account;

public class AccountNumberFormatter {

    /**
    * Formats the account number.
    *
    * @param literalAccountNumber account number.
    */
    public String formatAccountNumber(int literalAccountNumber) {
        String textAccountNumber = String.valueOf(literalAccountNumber);
        if (textAccountNumber.length() < 6) {
            textAccountNumber = leftPad(textAccountNumber, 6, "0");
        }
        if (textAccountNumber.length() > 6) {
            textAccountNumber = right(textAccountNumber, 6);
        }
        return textAccountNumber;
    }

    /**
     * This method pads the string with zeros on its left side.
     * @param text the text itself.
     * @param size the final size you desire.
     * @param filler the character that will be used to fill.
     * @return the final string.
     */
    private String leftPad(String text, int size, String filler) {
        int repetition = size - text.length();
        StringBuilder finalText = new StringBuilder();
        for (int i = 0; i < repetition; i++) {
            finalText.append(filler);
        }
        finalText.append(text);
        return finalText.toString();
    }

    /**
     * This method cuts the leftmost characters in the text. So only the rightmost remains.
     * @param text
     * @param size
     * @return
     */
    private String right(String text, int size) {
        int sizeToBeRemoved = text.length() - size;
        return text.substring(sizeToBeRemoved);
    }
}

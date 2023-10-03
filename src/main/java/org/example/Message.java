package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {

    NUMBERS_AMOUNT("Enter your guess (0-99)"),
    TRIALS("The trials you have left are: "),
    GREATER("Your number is GREATER than the one you are trying to guess"),
    LOWER("Your number is LOWER than the one you are trying to guess"),
    TRY_AGAIN("Please try again"),
    GUESSED("You guessed it!"),
    NOT_GUESSED("Sorry you didn't guess the number, the answer was: ");

    private static final Message[] VALUES = values();

    private final String message;

    public static Message[] getValues() {
        return VALUES;
    }
}

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise extends StringUtils {
    public static void main(String[] args) {
        System.out.println("Enter some words: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println(isNumeric(userInput));
    }
}

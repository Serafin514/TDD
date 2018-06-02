package calculator.actions;

import java.util.Scanner;

public class ImputReaderClass {

    public static String readerMethod() {
        Actions actions = new Actions();
        System.out.println("Enter Example");

        Scanner scanner = new Scanner(System.in);
        String stringExample = scanner.next();
        return stringExample;
    }


}

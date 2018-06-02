package calculator.actions;

import java.util.Scanner;

public class ImputReaderClass {

    public static String readerMethod() {
        Actions actions = new Actions();
        System.out.println("Enter Example");

        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static EquationModel extractExuations(String text){
        String[] split = text.split("(?<=[-+*/])|(?=[-+*/])");
        double firstNumber = Double.parseDouble(split[0]);
        double secondNumber = Double.parseDouble(split[2]);
        char sing = split[1].charAt(0);
        return new EquationModel(firstNumber,secondNumber,sing);
    }


}

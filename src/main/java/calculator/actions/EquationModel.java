package calculator.actions;

public class EquationModel {
    private double aDouble;
    private double bDouble;
    private char aChar;

    public EquationModel(double aDouble, double bDouble, char aChar) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
        this.aChar = aChar;
    }


    public double getaDouble() {
        return aDouble;
    }

    public void setaDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public double getbDouble() {
        return bDouble;
    }

    public void setbDouble(double bDouble) {
        this.bDouble = bDouble;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

}

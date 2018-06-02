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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquationModel that = (EquationModel) o;
        return Double.compare(that.aDouble, aDouble) == 0 &&
                Double.compare(that.bDouble, bDouble) == 0 &&
                aChar == that.aChar;
    }

}

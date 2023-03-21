public class EquationConverter {
    private final String stringEquation;
    private String[] equationStringList;

    EquationConverter(String stringEquation) {
        this.stringEquation = stringEquation;
    }

    // take original string input and make it into list
    public void stringNumbersListToStringEquation() {
        this.equationStringList = stringEquation.split(" ");
    }

    // check if we can use equation for calculation
    private boolean checkValidity() {
        if (equationStringList.length < 3 || equationStringList.length % 2 == 0) {
            return false;
        } return true;
    }
}



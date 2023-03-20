import java.util.ArrayList;

public class Operation {
    int num1;
    int num2;
    ArrayList<String> stringEquation;
    ArrayList<Integer> numbersList;
    ArrayList<Character> operatorsList;

    Operation () {

    }

    private void equationValidityCheck() {


    }


    public void setStringEquation(ArrayList<String> stringEquation) {
        this.stringEquation = stringEquation;
    }


    public void setOperators(ArrayList<Character> operatorsList) {
        this.operatorsList = operatorsList;
    }

    public ArrayList<Character> getOperatorsList() {
        return operatorsList;
    }

    public void setNumbers(ArrayList<Integer> numbersList) {
        this.numbersList = numbersList;
    }

    public ArrayList<Integer> getNumbersList() {
        return numbersList;
    }
}

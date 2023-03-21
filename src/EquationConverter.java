import java.util.ArrayList;
import java.util.List;

public class EquationConverter {
    private ArrayList<String> equationList;
    private ArrayList<Double> numbersList;
    private ArrayList<String> operatorsList;



    // initialize equationList
    EquationConverter() {
        equationList = new ArrayList<>();
        numbersList = new ArrayList<>();
        operatorsList = new ArrayList<>();
    }

    // set the Equation
    public void setEverything(String equationString) {
        equationList.clear();
        equationList.addAll(List.of(equationString.split(" ")));
        setNumbersList();
        setOperatorsList();
    }

    // get equationList
    public ArrayList<String> getEquationList() {
        return equationList;
    }


    // set list of numbers
    public void setNumbersList() {
        numbersList = new ArrayList<>();
        for (int i = 0; i < equationList.size(); i += 2) {
            numbersList.add(Double.parseDouble(equationList.get(i)));
        }
    }

    // set list of operators
    public void setOperatorsList() {
        operatorsList = new ArrayList<>();
        for (int i = 1; i < equationList.size(); i += 2) {
            operatorsList.add(equationList.get(i));
        }
    }

    public ArrayList<Double> getNumbersList() {
        return numbersList;
    }

    public ArrayList<String> getOperatorsList() {
        return operatorsList;
    }
}



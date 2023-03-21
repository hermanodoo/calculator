import java.util.ArrayList;

public class Calculator {
    private ArrayList<Double> numberList;
    private ArrayList<String> operatorList;


    public double calculateEquation(ArrayList<Double> numbersList, ArrayList<String> operatorList) throws ArithmeticException {

        this.numberList = numbersList;
        this.operatorList = operatorList;

        for (int i = 0; i < operatorList.size(); i++) {
            if (operatorList.get(i).equals("*")) {
                numbersList.set(i + 1, numbersList.get(i) * numbersList.get(i + 1));
                operatorList.set(i, "+");
                numbersList.set(i, 0D);
            }
            if (operatorList.get(i).equals("/")) {
                double result = numbersList.get(i) / numbersList.get(i + 1);
                if (Double.isInfinite(result)) throw new ArithmeticException("Infinite");
                if (Double.isNaN(result)) throw new ArithmeticException("NaN");
                operatorList.set(i, "+");
                numbersList.set(i, 0D);
            }
        }

        Double accumulator = numbersList.get(0);

        for (int i = 1; i < numberList.size(); i++) {
            if (operatorList.get(i - 1).equals("+")) {
                accumulator += numbersList.get(i);
            }
            if (operatorList.get(i - 1).equals("-")) {
                accumulator -= numbersList.get(i);
            }
        }
        return accumulator;
    }

    public ArrayList<Double> getNumberList() {
        return numberList;
    }

    public ArrayList<String> getOperatorList() {
        return operatorList;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Operation {
    String equation;
    private ArrayList<String> fromStringToArrayList;
    private ArrayList<String> equationArrayList;
    private ArrayList<Integer> numbersArrayList;
    private ArrayList<String> operationArrayList;


    public Operation(String equation) {


    }

    public int getOperation(String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
        }
        return -1;
    }

    // function for converting inputted String into ArrayList
    void convertToStringArrayList() {
        this.fromStringToArrayList = new ArrayList<>();
        String[] originalStringToList = this.equation.split(" ");
        fromStringToArrayList.addAll(Arrays.asList(originalStringToList));
    }

    // function for extracting "operators" in convertToStringArrayList
    void operationArrayList() {
        for (int i = 0; i < this.fromStringToArrayList.size(); i += 2) {
            operationArrayList.add(this.fromStringToArrayList.get(i));
        }
    }

    // function for extracting "numbers" in operationArrayList
    void numbersArrayList() {
        for (int i = 1; i < operationString.length(); i += 2) {
            operationArrayList.add(this.)
        }


    }




}

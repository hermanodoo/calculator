import java.util.ArrayList;

public class Database {
    private ArrayList<String> historyList;
    private String historyString;

    // add a line of equation to the String
    public void addHistory(String equation) {
        this.historyList.add(equation);
    }

    // return historyString
    public String getHistory() {
        ArrayListToString();
        return historyString;
    }

    // add answer to complete your equation
    public void addAnswerToEquation(int intAnswer) {
        String stringAnswer = String.valueOf(intAnswer);
        this.historyList.set(historyList.size() - 1, historyList.get(historyList.size() - 1).concat(" " + stringAnswer));
    }

    // convert historyList to String
    private void ArrayListToString() {
        StringBuilder sb = new StringBuilder();
        for (String oneLineHistory : historyList) {
            sb.append(oneLineHistory.concat("\n"));
        }
        historyString = sb.toString();
    }

}

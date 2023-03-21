import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Database {
    private ArrayList<String> historyList;
    private String historyString;

    Database() {
        this.historyList = new ArrayList<>();
    }

    public boolean checkEmpty() {
        if (historyList.isEmpty()) {
            return false;
        } return true;
    }


    // add a line of equation to the String
    public void addHistory(String equation) {
        this.historyList.add(equation);
    }

    // return historyString
    public String getHistory() {
        ArrayListToString();
        return historyString;
    }

    // convert historyList to String
    private void ArrayListToString() {
        StringBuilder sb = new StringBuilder();
        for (String oneEquation : historyList) {
            sb.append(oneEquation.concat("\n"));
        }
        historyString = sb.toString();
    }

    // add answer to complete your equation
    public void addAnswerToEquation(Double answer) {
        String stringAnswer = String.valueOf(answer);
        historyList.set(historyList.size() - 1, historyList.get(historyList.size() - 1).concat(" = " + stringAnswer));
    }

    public ArrayList<String> getHistoryList() {
        return historyList;
    }

    public String getHistoryString() {
        return historyString;
    }
}

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

    // convert historyList to String
    private void ArrayListToString() {
        StringBuilder sb = new StringBuilder();
        for (String oneLineHistory : historyList) {
            sb.append(this.historyList);
        }
        historyString = sb.toString();
    }

}

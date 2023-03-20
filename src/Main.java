import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String equation;

        Menu menu = new Menu();
        Operation operation = new Operation();
        Database database = new Database();



        // Starting Calculator
        System.out.println("Calculator Initializing...");

        // Checking Input if it's 1 or 2 or 3
        while(true) {
            System.out.println("1. History\n2. Calculation\n3. Terminate");
            menu.setMenuChoice(Integer.parseInt(br.readLine()));

            if (menu.getMenuChoice() >= 1 && menu.getMenuChoice() <= 3) {
                break;
            }

            System.out.println("Wrong Input, try again.");
        }


        // using if else to figure out whether to view history or calculation
        switch(menu.getMenuChoice()) {
            case 1:
                database.getHistory();

                case 2:
                    database.addHistory(br.readLine());
                    String equation = br.readLine();
                    operation(br.readLine())

                case 3:
                    exit(0);


        }
    }
}
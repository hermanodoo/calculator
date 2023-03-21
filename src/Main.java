import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Menu menu = new Menu();
        Operation operation = new Operation();
        Database database = new Database();

        // Starting Calculator
        System.out.println("Calculator Initializing...");

        // Main Loop of Options
        while(true) {
            // Checking Input if it's 1 or 2 or 3
            while(true) {
                System.out.println("1. History\n2. Calculation\n3. Terminate");
                menu.setMenuChoice(Integer.parseInt(br.readLine()));

                if (menu.getMenuChoice() >= 1 && menu.getMenuChoice() <= 3) {
                    break;
                }

                System.out.println("Wrong Input, please try again.");
            }

            // using if else to figure out whether to view history/perform calculation/exit program
            switch(menu.getMenuChoice()) {
                case 1:
                    database.getHistory();
                    break;
                case 2:
                    try {
                        System.out.println("Enter equation\n(Example: 1 + 4 * 5 / 2)\n");
                        EquationConverter ec = new EquationConverter(br.readLine());
                        if () {

                        }


                    } catch () {
                        System.out.println("Wrong format! Please try again.");
                    }
                    operation.checkEquation();
                    break;

                case 3:
                    exit(0);
            }
        }
    }
}
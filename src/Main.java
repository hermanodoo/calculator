import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // take in option chose in the menu & instantiate all the objects
        Menu menu = new Menu();
        Calculator calculate = new Calculator();
        Database database = new Database();
        EquationConverter equationConverter = new EquationConverter();
        EquationFormatChecker equationFormatChecker = new EquationFormatChecker();


        // Starting Calculator
        System.out.println("Calculator Initializing...");

        // Main Loop of Options
        while(true) {
            // Checking Input if it's 1 or 2 or 3
            while(true) {
                System.out.println("-------------------");
                System.out.println("1. History\n2. Calculation\n3. Terminate");
                try {
                    menu.setMenuChoice(Integer.parseInt(br.readLine()));
                    if (menu.getMenuChoice() >= 1 && menu.getMenuChoice() <= 3) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(">>>Wrong Input, please try again.");
                }
            }

            // using if else to figure out whether to view history/perform calculation/exit program
            switch (menu.getMenuChoice()) {
                // view history
                case 1 -> {
                    if (database.checkEmpty()) {
                        System.out.println("Retrieving History...\n");
                        System.out.println(database.getHistory());
                    } else {
                        System.out.println(">>> History's Empty");
                    }
                }
                // do calculation
                case 2 -> {
                    boolean continueCalculation = true;
                    while (continueCalculation) {
                        try {
                            System.out.println("-------------------");
                            System.out.print("Enter equation (Example: 1 + 4 * 5 / 2)\n=> ");
                            // take in the equation as String and pass it on to equation convertor
                            String equation = br.readLine();
                            equationConverter.setEverything(equation);
                            // checking validity of equation
                            boolean validityCheck = equationFormatChecker.checkValidity(equationConverter.getNumbersList(), equationConverter.getOperatorsList());
                            if (validityCheck) {
                                // code is in this order because of possible ArithmeticException in calculate

                                // find the answer
                                Double answer = calculate.calculateEquation(equationConverter.getNumbersList(), equationConverter.getOperatorsList());

                                // add equation to history (only equation, not answer)
                                database.addHistory(equation);
                                System.out.println("Answer: " + answer);
                                //and add answer to the database
                                database.addAnswerToEquation(answer);
                                continueCalculation = false;
                            }
                        } catch (NumberFormatException e1) {
                            System.out.println("Wrong format, try again.");
                        } catch (ArithmeticException e2) {
                            if (e2.getMessage().equals("Infinite"))
                                System.out.println("Can't divide by zero. Try again.");
                            if (e2.getMessage().equals("NaN")) System.out.println("Not a Number. Try Again");
                        }
                    }
                }

                // exit program
                case 3 -> {
                    System.out.println("Terminating calculator...");
                    System.exit(0);
                }
            }
        }
    }
}

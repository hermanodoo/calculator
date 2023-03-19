import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("계산기 앱");
        System.out.println("1. 조회\n2. 계산");

        // take input of options
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String choice = br.readLine();
        Menu menu = new Menu(Integer.parseInt(choice));

        // take in numbers along with operation, repeat if not 1 nor 2
        while (menu.getOption() < 0) {
            System.out.println("Type in 1 or 2!");
            menu.setOption(parseInt(br.readLine()));
        }

        // take operation as a list, separating with space
        System.out.println("Input your operation\n(Example: 1 + 3 * 10)");
        Operation operation = new Operation(br.readLine());


        Operation operation = new Operation(br.readLine());
        while(menu < -1) {
            int[] numbers
        }

        // return the results with the equation


    }
}
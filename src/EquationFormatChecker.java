import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EquationFormatChecker {
    private final List<String> operatorSet = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));

    // 0 for valid equation, 1 for invalid equation, 2 for division by zero
    public boolean checkValidity(ArrayList<Double> numbers, ArrayList<String> operators) {
        int length = numbers.size() + operators.size();

        // checking if either List is empty or length is valid
        if (numbers.isEmpty() || operators.isEmpty() || length < 3 || length % 2 == 0) {
            return false;
        }

        // check if operatorsList contains + - * /
        for (String operator : operators) {
            if (!operatorSet.contains(operator)) {
                return false;
            }
        }
        return true;
    }


}

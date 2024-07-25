question 1:


 public static void main(String[] args) {

    Solution solution = new Solution();

    String input1 = "we8+you2-7to/*32";

    String input2 = "i*-t5s-t8h1e4birds";

    int output1 = solution.fixTheFormula(input1);

    int output2 = solution.fixTheFormula(input2);

    System.out.println("Output for input1: " + output1);

    System.out.println("Output for input2: " + output2);

  }

  public int fixTheFormula(String input1) {

    if (input1 == null || input1.isEmpty()) {

      return 0;

    }

    StringBuilder numbersBuilder = new StringBuilder();

    StringBuilder operatorsBuilder = new StringBuilder();

    for (char c : input1.toCharArray()) {

      if (Character.isDigit(c)) {

        numbersBuilder.append(c);

      } else if (c == '+' || c == '-' || c == '*' || c == '/') {

        operatorsBuilder.append(c);

      }

    }

    char[] numbers = numbersBuilder.toString().toCharArray();

    char[] operators = operatorsBuilder.toString().toCharArray();

    int result = numbers[0] - '0';

    int index = 1;

    for (char op : operators) {

      int nextNumber = numbers[index] - '0';

      switch (op) {

        case '+':

          result += nextNumber;

          break;

        case '-':

          result -= nextNumber;

          break;

        case '*':

          result *= nextNumber;

          break;

        case '/':

          if (nextNumber != 0) {

            result /= nextNumber;

          } else {

            throw new ArithmeticException("Division by zero encountered.");

          }

          break;

      }

      index++;

    }

    return result;

  }

}

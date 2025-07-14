package lv1;

import java.util.Scanner;

public class APP {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(" 계산을 시작합니다 'exit' 을 입력하면 계산을 종료합니다.\n");
            System.out.print("Please input the first number (or type 'exit'): ");
            String input1 = scanner.next();
            if (input1.equalsIgnoreCase("exit")) break;

            System.out.print("Please input the operator symbol: (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Please input the second number: ");
            String input2 = scanner.next();
            if (input2.equalsIgnoreCase("exit")) break;

            try {
                int num1 = Integer.parseInt(input1);
                int num2 = Integer.parseInt(input2);
                int result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Wrong operator.");
                        continue;
                }

                System.out.println("result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("wrong input.");
            }
        }

        System.out.println("계산기를 종료합니다.");
        scanner.close();
    }
}
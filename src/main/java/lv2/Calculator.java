package lv2;
import java.util.Scanner;

public class Calculator {
        public void run () {
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
                    private int num1 = Integer.parseInt(input1);
                    private int num2 = Integer.parseInt(input2);
                    private int result = 0;

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

            // 연산 결과 저장 및 삭제 기능 메서드 구현 (인터넷 서치해봄..)
            public void removeResult() {
                Output.printOutput("가장 먼저 저장된 값인 ["+resultList.get(0) + "] 을 삭제합니다. ");
                resultList.remove(0);
                Output.printOutput("현재 저장된 값: "+resultList);

            }

        }
}



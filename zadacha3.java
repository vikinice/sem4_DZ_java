
/*3.В калькулятор добавьте возможность отменить последнюю операцию. */

import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;



public class zadacha3 {
    public static void main(String[] args) 
        {
    int a;
    int b;
    int result = 0;
    String oper;
    Scanner scan = new Scanner(System.in);
    a = inputNumber("\nВведите число: ");
    oper = inputStr("\n| + | - | * | / |\nВыберите операцию\n: ");
    b = inputNumber("\nВведите следующее число: ");
    
    Stack<Integer> stack = new Stack<>();
        if (Objects.equals(oper, "+")) {
            result = a + b;
        } else if (Objects.equals(oper, "-")) {
            result = a - b;
        } else if (Objects.equals(oper, "*")) {
            result = a * b;
        } else if (Objects.equals(oper, "/")) {
            result = a / b;
        } else
            System.out.printf("Неизвестная операция!!!");

    System.out.println("\nРЕЗУЛЬТАТ: " + result);

    stack.push(result);
    while (true) {
        oper = inputStr("\n-> Выполнить следующее вычисление, введите: | + | - | * | / |" +
                "\n-> Введите | -- | чтобы отменить последнюю операцию: ");
        if (Objects.equals(oper, "--")) {
            System.out.println("̶У̶д̶а̶л̶е̶н̶н̶о̶е̶ ̶з̶н̶а̶ч̶е̶н̶и̶е̶:̶ ̶" + stack.pop());
            result = stack.peek();
            System.out.println("Последнее сохраненное вычисление: " + result);
        } else {
            b = inputNumber("Введите число: ");
            if (Objects.equals(oper, "+")) {
                result = result + b;
            } else if (Objects.equals(oper, "-")) {
                result = result - b;
            } else if (Objects.equals(oper, "*")) {
                result = result * b;
            } else if (Objects.equals(oper, "/")) {
                result = result / b;
            } else
                System.out.printf("Неизвестная операция!!!");
            stack.push(result);
            System.out.println("\nРЕЗУЛЬТАТ: " + result);
        }
    }
}

    public static int inputNumber(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.print(text);
        int num = scan.nextInt();
        return num;
    }
    public static String inputStr(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        String str = sc.nextLine();
        return str;
    }
}
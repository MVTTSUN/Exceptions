import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // 1
    float num = stringToFloat();
    System.out.println(num);

    // 2
    int[] array = { 1, 5, 7, 15, 16, 22, 75, 1 };
    task2(array, 0, 7);

    // 3
    task3();

    // 4
    String str = task4();
    System.out.println("Результат ввода: " + str);
  }

  public static float stringToFloat() {
    boolean flagInput = true;
    Scanner scanner = new Scanner(System.in);
    float floatNumber = 0;

    while (flagInput) {
      System.out.println("Введите число с точкой\n");
      String number = scanner.next();
      if (isFloat(number)) {
        floatNumber = Float.parseFloat(number);
        flagInput = false;
      }
    }
    return floatNumber;
  }

  private static boolean isFloat(String number) {
    try {
      float numberFloat = Float.parseFloat(number);
    } catch (NumberFormatException e) {
      System.out.println("Число не является типом float");
      return false;
    }
    return true;
  }

  public static void task2(int[] intArray, int diff, int numberArray) {
    if (numberArray > intArray.length - 1) {
      System.out.println("Индекс числителя в массиве чисел находится за границами размера");
    } else if (diff == 0) {
      System.out.println("Делить на ноль нельзя");
    } else {
      double catchedRes1 = intArray[numberArray] / diff;
      System.out.println("catchedRes1 = " + catchedRes1);
    }
  }

  public static void task3() {
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = { 1, 2 };
      abc[3] = 9;
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }

  }

  public static void printSum(Integer a, Integer b) {
    System.out.println(a + b);
  }

  public static String task4() {
    Scanner scanner = new Scanner(System.in);
    String str = "";

    while (str.equals("")) {
      str = scanner.nextLine();
      if (str.equals("")) {
        System.out.println("Пустую строку вводить нельзя");
      }
    }

    return str;
  }
}

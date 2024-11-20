//public class Main {
//    public static void main(String[] args) {
//        // + , - , / , * , %
//        int x = 4 + 5;s

import lesson3.Lesson3;

import java.util.Scanner;

//        int y = 5 - 4;
//
//        int umn = 5 * 5;
//        int delenie2 = 7 % 5;
//        double d = (double) 6 / 5;   // будет дробная часть
//        int d2 = 6/5; // не будет дробной части
//        System.out.println(x);
//        System.out.println(delenie2);
//        System.out.println(6 + 9);
//        }
//    }
public class Main {
//    public static void main(String[] args) {
//        // + , - , / , * , %
//        int number1 = 168;
//        int number2 = 1500;
//        System.out.println(number1 + number2);
//        System.out.println(number1 - number2);
//        System.out.println(number1 * number2);
//        System.out.println(number1 / number2);
//        System.out.println(number1 % number2);
//    }
//}

//В методе main инициализировать все примитивные типы.
//Выведите в консоль char и сумму сложение всех численных переменнных
//public class Main {
//public static void main(String[] args) {
//    //Примитивные типы в JavaScript:
//    // number, string, boolean, null, undefined, symbol (ES6)
//    // Инициализация переменных
//    int intNum = 135;
//    short shortNum = 1210;
//    byte byteNum = 6;
//    long longNum = 441;
//    float floatNum = 7.8f;
//    double doubleNum = 5.8;
//    boolean booleanVar = true;
//    char charSym = 'h';
//
//    double sum = byteNum + shortNum + intNum + longNum + floatNum + doubleNum;
//    System.out.println("Значение char: " + charSym);
//    System.out.println("Сумма числовых переменных: " + sum);
//    }
//}



//public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//    Lesson3 lesson3 = new Lesson3();
//
//    System.out.print("write tut  ");
//    lesson3.nonStaticNum = scanner.nextInt();
//
//    System.out.println(lesson3.nonStaticNum);
//}


//        System.out.print(numberScan);

//        Lesson3 lesson3 = new Lesson3();
//        lesson3.nonStaticNum = 8;
//        lesson3.method();
//
//        System.out.println(Lesson3.nonStaticNum);
//        System.out.println(Lesson3.number);
//    }

   // считать два числа из консоли, и сложить их и вывести результат
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        Lesson3 lesson3 = new Lesson3();
//
//        System.out.print("write a1  ");
//        int a1 = scanner.nextInt();
//        System.out.print("write a2  ");
//        int a2 = scanner.nextInt();
//
//        System.out.println(lesson3.nonStaticNum);
//        System.out.println(lesson3.number);
//        System.out.println(a1);
//        System.out.println(a1+a2);
//    }

//    Считать два числа из консоли в переменныe экземпляра класса и вывести результат их сложения

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Lesson3 lesson3 = new Lesson3();

        System.out.print("write tut 1  ");
        System.out.print("write tut 2  ");
        int numberScan = scanner.nextInt();

        lesson3.numberLesson3 = scanner.nextInt();
        lesson3.number1Lesson3 = scanner.nextInt();
        System.out.println(lesson3.numberLesson3 + lesson3.number1Lesson3);

    }


}


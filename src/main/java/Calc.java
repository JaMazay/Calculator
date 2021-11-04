import java.util.Scanner;

//Scanner - Этот класс, для считывания данных, которые пользователь вводит.
//Его функциональность простая. Имулирует сканер, считывает данные , которые ты для него укажешь.
// action = args [0] - сложение, вычитание и тд

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// анализируем входной поток данных
        System.out.println("Введите первое число");
        double a = scanner.nextDouble();// присваиваем первое введеное значение для переменной "a"
        System.out.println("Введите второе число");
        double b = scanner.nextDouble();// присваиваем первое введеное значение для переменной "b"
        String action = args [0];

        if(args[0].equals("+")) // сложение
        {
            System.out.println("Ответ: "+ (a+b));
        }

        if(args[0].equals("-")) //вычитание
        {
            System.out.println("Ответ: "+ (a-b));
        }

        if(args[0].equals("*")) //умножение
        {
            System.out.println("Ответ: "+ (a * b));
        }

        if(args[0].equals("/")) //деление
        {
            System.out.println("Ответ: "+ (a / b));
        }

        if(args[0].equals ("/") && b == 0)  // деление на ноль
        {
            System.out.println ("Деление на ноль невозможно");
        }

        if(args[0].equals("%")) //остаток от деления
        {
            System.out.println("Ответ: "+ (a / b));
        }

        if(args[0].equals("^")) //возведение в степень
        {
            System.out.println("Ответ: " + (Math.pow(a,b)));
        }

    }
}

import java.util.Scanner;

//Scanner - Этот класс пригодится, для считывания данных, которые пользователь вводит.
//Его функциональность очень проста. Он, словно настоящий сканер, считывает данные из источника, который ты для него укажешь.

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// анализируем входной поток данных
        System.out.println("Введите первое число");
        int a = scanner.nextInt();// присваиваем первое введеное значение для переменной "a"
        System.out.println("Введите второе число");
        int b = scanner.nextInt();// присваиваем первое введеное значение для переменной "b"
        int c = a - b;
        System.out.println("Ответ: " + c);
    }
}

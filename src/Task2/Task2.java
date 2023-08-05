package Task2;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
// Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException
// с сообщением "Деление на ноль недопустимо".
// В противном случае, программа должна выводить результат деления.
public class Task2 {

    public static int divider(int a, int b) throws DivisionByZeroException{
        if(b==0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a/b;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  1-ое число");
        int a = scanner.nextInt();
        System.out.println("Введите  2-ое число");
        int b = scanner.nextInt();
        try {
            int res = divider(a,b);
            System.out.println("результат деления = " + " " + res );
        }
        catch (DivisionByZeroException e){
            System.out.println("Ошибка!"+ " " + e.getMessage());
        }

        scanner.close();

    }

}

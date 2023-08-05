package Task3;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:
//
//Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
//Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
//Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
//Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
//В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
public class Task3 {

    public static boolean Checker(int num1) throws NumberOutOfRangeException {
        if (num1 <100)
        {return true;}
        else  {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
    }
    }

    public static boolean Checker2(int num2) throws NumberOutOfRangeException {
        if (num2 >0)
        {return true;}
        else  {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }

    public static boolean CheckerNum1Num2(int num1, int num2) throws NumberSumException{
        if (num1+num2>=10){
            return true;
        }
        else {
            throw new NumberSumException("Сумма первого и второго чисел слишком мала");
        }
    }

    public static boolean CheckerNum3(int num3) throws DivisionByZeroException1{
        if (num3!=0){
            return true;
        }
        else {
            throw new DivisionByZeroException1("Деление на ноль недопустимо");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите  1-ое число");
        int a = scanner.nextInt();
        System.out.println("Введите  2-ое число");
        int b = scanner.nextInt();
        System.out.println("Введите  3-ое число");
        int c = scanner.nextInt();
        try {

            Checker(a);
            Checker2(b);
            CheckerNum1Num2(a,b);
            CheckerNum3(c);
            System.out.println("Проверка пройдена успешно");
            }
            catch (NumberOutOfRangeException | DivisionByZeroException1 | NumberSumException e){
                System.out.println(e.getMessage());

            }

        }


    }



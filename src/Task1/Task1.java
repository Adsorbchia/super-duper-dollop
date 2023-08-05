package Task1;

import java.util.Scanner;

//Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
// Если число отрицательное или равно нулю, программа должна выбрасывать
// исключение InvalidNumberException с сообщением "Некорректное число".
// В противном случае, программа должна выводить сообщение "Число корректно".
public class Task1 {
    public static boolean Check(int num) throws InvalidNumberException {
        if (num!=0 && num>0){
            return true;}
        else {
            throw new InvalidNumberException( "Некорректное число");}

    }


    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
            try {
                Check(num);
                System.out.println("Число корректно");

            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }

            scanner.close();

}}

// К калькулятору из предыдущего дз добавить логирование.

package java_homework_2;

import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class task_4 {
    
    static int enterNumber(int numberFlag){

        Scanner scanner = new Scanner(System.in);
        
        if (numberFlag == 1){
            System.out.print("Введите первое число: ");            
        }
        else{
            System.out.print("Введите второе число: ");            
        }        
        
        return scanner.nextInt();       
    }

    public static void main(String[] args) throws SecurityException, IOException{     
        
        Logger log = Logger.getLogger(task_4.class.getName());
        log.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("./java_homework_2/logcalc.txt", true);      
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat);

        System.out.println("Добро пожаловать в простой калькулятор");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите требуемое действие: '+' - сложение,  '-' - вычитание, '*' - умножение, '/' - деление: ");
        String flag = scanner.nextLine();        

        int number1 = enterNumber(1);
        int number2 = enterNumber(2);

        switch (flag){
            case "+":
                int sum = number1 + number2;
                System.out.printf(" %d + %d = %d\n", number1, number2, sum);
                log.info(Integer. toString(number1) + " + " + Integer. toString(number2) + " = " + Integer. toString(sum));
                break;

            case "-":
                int difference = number1 - number2;
                System.out.printf(" %d - %d = %d\n", number1, number2, difference);
                log.info(Integer. toString(number1) + " - " + Integer. toString(number2) + " = " + Integer. toString(difference));
                break;

            case "*":
                int product = number1 * number2;
                System.out.printf(" %d * %d = %d\n", number1, number2, product);
                log.info(Integer. toString(number1) + " * " + Integer. toString(number2) + " = " + Integer. toString(product));
                break;   

            case "/":
                int division = number1 / number2;
                System.out.printf(" %d / %d = %d\n", number1, number2, division);
                log.info(Integer. toString(number1) + " / " + Integer. toString(number2) + " = " + Integer. toString(division));
                break;

            default:
                System.out.println("Действие введено неверно");
                log.info("Действие введено неверно");
                break;
        }
        scanner.close();
    }
}

//Реализуйте алгоритм ѝортировки пузырьком чиѝлового маѝѝива, результат поѝле каждой итерации запишите в лог-файл.
 
package java_homework_2;

import java.util.Arrays;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class task_2 {

    static void bubbleSort(int[] array) throws SecurityException, IOException{

        Logger log = Logger.getLogger(task_2.class.getName());
        log.setLevel(Level.INFO);
        FileHandler fh = new FileHandler("./java_homework_2/log.txt");
        log.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter ();
        fh.setFormatter(sFormat);

        log.info("???????? ??????:\n" + Arrays.toString(array) + "\n");

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if(array[i] > array[i + 1]){
                    isSorted = false;
 
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
            log.info("?????? ????? ????????? ????????:\n" + Arrays.toString(array) + "\n");
        }        
    }

    public static void main(String[] args) throws SecurityException, IOException{

        Random random = new Random();
        int[] arrayIn = new int[10];
       

        for ( int i = 0; i < arrayIn.length - 1; i++){
            arrayIn[i] = random.nextInt(11 - 1);
            System.out.print(arrayIn[i]);
        }

        bubbleSort(arrayIn);
    }
}

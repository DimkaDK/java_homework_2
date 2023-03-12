/* Дана json строка (можно сохранить в файл и читать из файла)
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
Пример вывода:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика. */


package java_homework_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class task_3 {

    static void parsingJspon(String lineJson){

        for (int i = 0; i < lineJson.length(); i++){
            if(lineJson.charAt(i) == '"'){
 
            }


        }
        System.out.println(lineJson);



    }
    public static void main(String[] args) throws Exception{

        String line = "empty";

        try {
            String pathProject = "./java_homework_2";
            String pathFile = pathProject.concat("/students.json");
            File file = new File(pathFile);
            BufferedReader bufReader = new BufferedReader(new FileReader(file));
            line = bufReader.readLine();
            bufReader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        parsingJspon(line);      
    }    
}

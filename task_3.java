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

        // методы replace() и replaceAll(), как-то по особенному относяться к символам '[' и '{', пришлось убирать их замысловато

        String lineWorking = "";                 

        for (int i = 0; i < lineJson.length(); i++){
            if (lineJson.charAt(i) == '{' || lineJson.charAt(i) == '}' || lineJson.charAt(i) == '[' || lineJson.charAt(i) == ']'|| lineJson.charAt(i) == '\"' ){                
            }
            else{                
                lineWorking += lineJson.charAt(i);
            }                
        }

        String[] student = lineWorking.split(",");
        String[] studentOut = new String[2];
        StringBuilder infoOut = new StringBuilder();   
                
        for (int i = 0; i < student.length; i++){
            studentOut = (student[i].split(":"));            
            if (studentOut[0].equals("фамилия")){                
                infoOut.append("Студент " + studentOut[1] + " ");
            }
            else if (studentOut[0].equals("оценка")){                
                infoOut.append("получил " + studentOut[1] + " ");
            }
            else{
                infoOut.append("по предмету " + studentOut[1] + "\n");
            }
        }
        System.out.println(infoOut);
    }

    public static void main(String[] args) throws Exception{

        String line = "empty";

        try {
            File file = new File("./java_homework_2/students.json");
            BufferedReader bufReader = new BufferedReader(new FileReader(file));
            line = bufReader.readLine();
            bufReader.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        parsingJspon(line);      
    }    
}

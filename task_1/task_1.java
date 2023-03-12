/* Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */


package java_homework_2.task_1;

import java.util.HashMap;
import java.util.Map;

public class task_1 {
    public static void main(String[] args){

        Map<String, String> students = new HashMap<String, String>();

        students.put("name", "Ivanov");
        students.put("country", "Russia");
        students.put("city", "Moscow");
        students.put("age", "null");

        StringBuilder request = new StringBuilder();

        for(Map.Entry<String, String> item : students.entrySet()){
            if (item.getValue() != "null"){
                request.append(item.getKey() + ": " + item.getValue() + "   ");
            }
        }

        System.out.println(request);

    }
}

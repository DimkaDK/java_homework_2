/* Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.
Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} */


import java.util.ArrayList;
import java.util.Set;

import org.json.simple.JSONObject;

public class App {
    public static void main(String[] args) throws Exception {
        
        JSONObject obj = new JSONObject();

        obj.put("name","Ivanov");
        obj.put("country","Russia");
        obj.put("city","Moscow");
        obj.put("age","null");
        
        Set<String> keys = obj.keySet();
              
        StringBuilder request = new StringBuilder();
        for (String i: keys){
            if( obj.get(i) != "null"){
                request.append(i + ": " + obj.get(i) + " ");
            }
       }

       System.out.println(request);
      
    }
}

package Day08;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojo.demo.Employee;

public class C01_excludeNullValues {



    @Test
    public void test() throws JsonProcessingException {

        // { "salary": 25000 }

        Employee employee = new Employee();


        employee.setSalary(25000);

        System.out.println(employee);


        // Serialize islemi gerceklestirmek icin Jackson kutuphanesinin bize sagladigi Jackson ObjectMapper objesini kullaniriz

        ObjectMapper obj = new ObjectMapper();

        // Bir Java objesini string e cevirdik (serialize)
        String employeeString = obj.writeValueAsString(employee);

        System.out.println(employeeString);





    }


}

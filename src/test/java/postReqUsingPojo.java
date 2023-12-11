import com.pojo.Employee;
import com.pojo.FavFood;
import com.pojo.Marks;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;

public class postReqUsingPojo {

    /*POJO Instructions
    {}-->Class file
    []-->List<Type> creation*/

    @Test
    public void pojoReq() {

        Marks marks = new Marks(80, 90);
        Marks marks1 = new Marks(90, 100);
        List<Marks> allMarks = new ArrayList<>();
        allMarks.add(marks);
        allMarks.add(marks1);

        List<String> dinner = new ArrayList<>();
        dinner.add("Dosa");
        dinner.add("Paneer");

        List<String> jobs = new ArrayList<>();
        jobs.add("Automation Tester");
        jobs.add("devops");

        FavFood favFood = new FavFood("Poori", "FriedRice", dinner);

        Employee employee = new Employee(40, "Praveen", "Xavier", "12345@gmail.com", favFood, jobs, allMarks);

        Response response = given().header("Content-Type", ContentType.JSON)
                .body(employee).post("http://localhost:3000/employees");

        response.prettyPrint();
    }
}

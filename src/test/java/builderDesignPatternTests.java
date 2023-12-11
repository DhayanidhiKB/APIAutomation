import com.pojo.Student;
import com.pojo.StudentBuilder;
import org.testng.annotations.Test;

public class builderDesignPatternTests {

    @Test
    public void buildTest(){

        Student student=new StudentBuilder()
                .setId(18)
                .setFirstname("Praveen")
                .setLastname("Dhaya")
                .setEmail("px@gmail.com").build();

        System.out.println(student);
    }
}

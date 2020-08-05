package spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springTests.ClassA;
import springTests.DemoApplication;

@ActiveProfiles("dev")
@SpringBootTest(
        classes = DemoApplication.class
)
public class ApplicationTest {

    @Autowired
    private ClassA a;

    @Test
    void contextLoads () {
        a.somePrint();
    }
}

package springTests;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component("test")
public class MyInterfaceImpl implements MyInterface {

    @Override
    public String getNameOfClass() {
        return "MyInterfaceImpl";
    }
}

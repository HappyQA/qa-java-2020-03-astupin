package springTests;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!dev")
@Component
@Primary
public class MyInterfaceNewImpl implements MyInterface {

    @Override
    public String getNameOfClass() {
        return "MyInterfaceNewImpl";
    }
}

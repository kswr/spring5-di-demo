package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default","en"})
@Primary
public class PrimaryGreetingService implements GreetingService{

    @Override
    public String sayHello() {
        return "Hello - Primary greeting service";
    }
}

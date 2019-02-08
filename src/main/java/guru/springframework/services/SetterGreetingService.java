package guru.springframework.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello - i was injected by the setter";
    }
}

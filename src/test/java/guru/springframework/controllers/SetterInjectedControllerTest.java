package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;


public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreetinService() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}

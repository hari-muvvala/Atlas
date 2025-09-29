package trainertasks.day36;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Service {
    String getName() {
        return "Default";
    }
}

class Client {
    private final Service service;
    Client(Service service) { this.service = service; }
    String fetchName() { return service.getName(); }
}

public class Task09_InjectMocksDemo {

    @Mock
    Service service;

    @InjectMocks
    Client client;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testInjectMocks() {
        when(service.getName()).thenReturn("Injected");
        assertEquals("Injected", client.fetchName());
    }
}
package SumService;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import SumService.entity.Num;
import SumService.service.NumService;

@SpringBootTest
public class AppTest {

    @Autowired
    private NumService srv;

    @Test
    public void addNumberWithoutException() {
        assertDoesNotThrow(() -> srv.add(new Num("test1", 3)));
    }

    @Test
    public void addNumberWithException() {
        assertThrows(Exception.class, () -> srv.add(new Num()));
    }

    @Test
    public void getSumWithoutException() {
        assertDoesNotThrow(() -> srv.sum("test1", "test1"));
    }

    @Test
    public void getSumWithException() {
        assertThrows(Exception.class, () -> srv.sum(null, null));
    }
}
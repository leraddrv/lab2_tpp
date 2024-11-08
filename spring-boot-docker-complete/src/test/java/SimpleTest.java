import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    public void testPassing() {
        // Цей тест пройде успішно
        assertEquals(2, 1 + 1);
    }

//    @Test
//    public void testFailing() {
//        // Цей тест не пройде
//       assertEquals(2, 5 - 1);  // Цей тест не пройде, бо 5 - 1 дорівнює 4
//   }
    
    @Test
    public void testPassing() {
        // Цей тест пройде успішно
        assertEquals(68, 136:2);
    }
}
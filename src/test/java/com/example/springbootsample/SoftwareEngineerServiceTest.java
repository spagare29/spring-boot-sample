
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springbootsample.SoftwareEngineer;
import com.example.springbootsample.SoftwareEngineerService;

@SpringBootTest
class SoftwareEngineerServiceTest {
    @Autowired
    private SoftwareEngineerService service;
    
    @Test
    void testGetAllEngineers() {
        List<SoftwareEngineer> engineers = service.getAllEngineers();
        assertNotNull(engineers);
    }
}
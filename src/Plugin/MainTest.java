package Plugin;

import com.sap.scco.ap.pos.dao.CDBSessionFactory;
import com.sap.scco.ap.pos.service.ReceiptPosService;
import com.sap.scco.ap.pos.service.ServiceFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void TestSumWithEnvLibrary() {
        Main main = new Main();
        int result = main.Sum(2,2);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void TestSumWithoutEnvLibrary() {
        int result = 2+2;
        int expected = 4;
        assertEquals(expected, result);
    }
}
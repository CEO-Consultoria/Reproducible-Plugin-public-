package Plugin;

import com.sap.scco.ap.plugin.BasePlugin;
import com.sap.scco.ap.plugin.BreakExecutionException;
import com.sap.scco.ap.plugin.annotation.PluginAt;
import com.sap.scco.ap.plugin.annotation.ui.JSInject;
import com.sap.scco.ap.pos.service.ReceiptPosService;
import com.sap.scco.util.exception.InvalidStateException;
import com.sap.scco.util.exception.ValidationException;
import com.sap.scco.util.logging.Logger;

import java.io.InputStream;

public class Main extends BasePlugin {
    public static final Logger logger = Logger.getLogger(Main.class);

    @Override
    public String getId() {
        return "1.0";
    }

    @Override
    public String getName() {
        return "Testable Plugin";
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public void startup() {
        System.out.println("Testable plugin here!");
    }

    public int Sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
}
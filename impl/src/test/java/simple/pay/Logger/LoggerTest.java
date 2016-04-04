package simple.pay.Logger;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import simple.pay.logger.Logger;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by shuailu on 3/31/16.
 */
public class LoggerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @BeforeTest
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @Test
    public void testLoggerLogInfo() {
        Logger logger = Logger.getLogger(String.class);
        logger.info("method1", "msg1: %s, %s", "param1", "param2");
        assertEquals("String(method1): msg1: param1, param2\n", outContent.toString());
        assertEquals(0, errContent.toString().length());
    }

}

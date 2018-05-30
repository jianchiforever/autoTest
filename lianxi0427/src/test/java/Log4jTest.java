import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import util.SeleniumUtil;

/**
 * Created by new on 2018/5/3.
 */
public class Log4jTest {
    public static void main(String[] args) {
        Logger logger =  Logger.getLogger(Log4jTest.class);
        PropertyConfigurator.configure("./log4j.properties");
        logger.info("这是info日志级别信息");
        logger.error("这是info日志级别信息");
    }
}
package util;

import org.apache.log4j.PropertyConfigurator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

/**
 * Created by new on 2018/5/8.
 */
public class LogConfiguration {
    public static void inLog(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd HH_mm_ss");
        String date=dateFormat.format(new Date());
        final String logFilePath="./Log/"+date+"testlog.log";
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger","info,toConsole,toFile");
        prop.setProperty("log4j.appender.toConsole","org.apache.log4j.ConsoleAppender");
        prop.setProperty("log4j.appender.toConsole.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.toConsole.layout.ConversionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        prop.setProperty("log4j.appender.toFile","org.apache.log4j.DailyRollingFileAppender");
        prop.setProperty("log4j.appender.toFile.layout","org.apache.log4j.PatternLayout");
        prop.setProperty("log4j.appender.toFile.layout.ConvesionPattern","[%d{yyyy-MM-dd HH:mm:ss}] [%p] %m%n");
        prop.setProperty("log4j.appender.toFile.file",logFilePath);
        PropertyConfigurator.configure(prop);

    }
}

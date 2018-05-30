package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by new on 2018/5/8.
 */
public class DiaoyongConfig {
    public static String browserName;
    public static String url;
    public static void ReadProperties() throws IOException{
        Properties p = new Properties();
//        加载配置文件
        InputStream ips = new FileInputStream("./Config.properties");
        p.load(ips);
        browserName=p.getProperty("browserName");
        url=p.getProperty("url");
    }
    static {
        try{
            ReadProperties();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println(DiaoyongConfig.browserName);
        System.out.println(DiaoyongConfig.url);
    }
}

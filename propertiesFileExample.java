
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesFileExample{
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("db.user", "Laxmi");
        props.setProperty("db.password", "secret");
        FileOutputStream fos = new FileOutputStream("config.properties");
        props.store(fos, "Db connection");
        System.out.println("Info has been stored");
        fos.close();
        Properties loadProperties = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        loadProperties.load(fis);
        System.out.println("File has been uploaded");
        fis.close();

        System.out.println(loadProperties.getProperty("db.user"));
        System.out.println(loadProperties.getProperty("db.password"));
    }
}
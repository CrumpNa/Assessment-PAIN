import org.apache.commons.io.IOUtils;
import java.io.IOException;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));//changes raw text to string
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);

    }
}

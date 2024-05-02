package common;

import com.google.common.base.Strings;
import helper.globalProperties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class commonFunctions {

    public static void getEnvironment()
    {
        globalProperties.environment = System.getProperty("environment");
        if( Strings.isNullOrEmpty(globalProperties.environment ))
            globalProperties.environment = data.Common.defaultEnv;
    }
    public static String getAbsolutePathString(String relativePath) {
        Path path = Paths.get(relativePath);
        return ((Path) path).toAbsolutePath().toString();
    }
    public static String readValueFromFile(String filePath) {
        String value = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            value = bufferedReader.readLine();
            bufferedReader.close();
        } catch (IOException ex) {
            System.out.println("Error reading file '" + filePath + "'");
        }
        return value;
    }
}
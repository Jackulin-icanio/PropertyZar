package common;

import com.google.common.base.Strings;
import helper.globalProperties;
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
}
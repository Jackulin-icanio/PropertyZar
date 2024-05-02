package tests;
import org.testng.annotations.Test;
import pages.PropertiesPage;

import java.io.IOException;

public class PropertiesTest {

    PropertiesPage propertiesPage = new PropertiesPage();

    @Test
    public void createProperties() throws InterruptedException, IOException {
        propertiesPage.newProperty();
        propertiesPage.initializeAndClickHOAValue();
        propertiesPage.initializeAndClickOwnerValue();
        Thread.sleep(4000);
    }
}

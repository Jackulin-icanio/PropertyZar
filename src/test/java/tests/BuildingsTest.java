package tests;

import org.testng.annotations.Test;
import pages.BuildingsPage;

import java.io.IOException;

public class BuildingsTest {

    BuildingsPage buildingsPage = new BuildingsPage();

    @Test
    public void createBuildings() throws InterruptedException, IOException {
        buildingsPage.newBuilding();
        buildingsPage.initializeAndClickPropertyValue();
        buildingsPage.initializeAndClickOwnerValue();
        Thread.sleep(4000);
    }
}

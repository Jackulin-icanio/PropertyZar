package tests;

import org.testng.annotations.Test;
import pages.UnitsPage;

import java.io.IOException;

public class UnitsTest {

    UnitsPage unitsPage = new UnitsPage();

    @Test
    public void createBuildings() throws InterruptedException, IOException {
        unitsPage.newUnit();
        unitsPage.initializeAndClickPropertyValue();
        unitsPage.initializeAndClickBuildingValue();
        unitsPage.initializeAndClickOwnerValue();
        Thread.sleep(4000);
    }
}

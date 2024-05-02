package tests;

import org.testng.annotations.Test;
import pages.OwnerPage;

import java.io.IOException;

public class OwnerTest {

    OwnerPage ownerPage = new OwnerPage();

    @Test
    public void createOwner() throws InterruptedException, IOException {
        ownerPage.newOwner();
        Thread.sleep(4000);
    }
}
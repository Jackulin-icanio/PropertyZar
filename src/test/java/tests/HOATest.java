package tests;

import org.testng.annotations.Test;
import pages.HOAPage;
import pages.OwnerPage;

import java.io.IOException;

public class HOATest {

    HOAPage hoaPage = new HOAPage();

    @Test
    public void createHOA() throws InterruptedException, IOException {
        hoaPage.newHOA();
        hoaPage.clickMemberValue();
        Thread.sleep(4000);
    }
}
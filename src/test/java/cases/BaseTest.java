package cases;

public class BaseTest extends OtusRunTest {

    //@Test
    public void openOtusPage () {
        driver.navigate().to(cfg.URL());
   }
}

package automation.tests.unit;

import org.junit.BeforeClass;
import org.junit.Test;
import project.selenium.pages.HomePage;
import ru.yandex.qatools.allure.annotations.Title;

/**
 * Created by shantonu on 5/5/16.
 */
public class LogInPageTest {

    @BeforeClass
    public static void  initClass(){

    }

    @Test
    public void testFirst(){
        HomePage home = new HomePage();
        home.click.on(home.searchButton);
    }


}

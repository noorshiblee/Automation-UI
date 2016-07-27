package project.selenium.actions;

/**
 * Created by shantonu on 4/28/16.
 */
public class MouseScroll {

  public void scrollToElement(WebElement element, JavascriptExecutor js) {
    
	  js.executeScript("arguments[0].scrollIntoView(true);", elem);
		
	}
	
}

package project.selenium.actions;

/**
 * Created by shantonu on 4/21/16.
 */
public class RightClick {
  
  /**
   * this function will perform right click to an elemetn
   */
   
  public void performRightClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.contextClick(element).build().perform(); /* this will perform right click */
}

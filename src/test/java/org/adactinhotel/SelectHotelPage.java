package org.adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy(id = "continue")
	private WebElement continuebutton;

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

}

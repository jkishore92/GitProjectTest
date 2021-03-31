package org.adactinhotel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirm extends BaseClass {
	public BookingConfirm() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//iframe[@frameborder='0']")
	private WebElement frame;
	@FindBy(id = "order_no")
	private WebElement order_no;

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getOrder_no() {
		return order_no;
	}

}

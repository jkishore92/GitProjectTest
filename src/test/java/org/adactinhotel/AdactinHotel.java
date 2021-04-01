package org.adactinhotel;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AdactinHotel extends BaseClass {
	@BeforeClass
	public static void beforeClass() {
		browserLaunch();
	}

	@AfterClass
	public static void afterClass() {
		// quitWindows();
	}
	

	@Before
	public void before() {
		System.out.println("-----");
		Date d = new Date();
		System.out.println(d);
	}

	@After
	public void after() {
		Date d = new Date();
		System.out.println(d);
		System.out.println("-----");

	}

	@Test
	public void test1() {
		launchUrl("https://adactinhotelapp.com/");
		LoginPage l = new LoginPage();
		fillTextBox(l.getUserName(), "jkishore92");
		fillTextBox(l.getPassword(), "1234567890");
		click(l.getButton());
		System.out.println("Test1");
		System.out.println("GIT Check");
	}

	@Test
	public void test2() {
		SearchHotel se = new SearchHotel();
		selectByValue(se.getLocation(), "Los Angeles");
		selectByValue(se.getHotels(), "Hotel Cornice");
		selectByValue(se.getRoom_type(), "Super Deluxe");
		selectByValue(se.getRoom_nos(), "1");
		clear(se.getDatepick_in());
		fillTextBox(se.getDatepick_in(), "15/03/2021");
		clear(se.getDatepick_out());
		fillTextBox(se.getDatepick_out(), "16/03/2021");
		selectByValue(se.getAdult_room(), "2");
		selectByValue(se.getChild_room(), "0");
		click(se.getSubmit());
		System.out.println("Test2");

	}

	@Test
	public void test3() {
		SelectHotelPage sel = new SelectHotelPage();
		click(sel.getRadiobutton_0());
		click(sel.getContinuebutton());
		System.out.println("Test3");

	}

	@Test
	public void test4() throws InterruptedException {
		BookHotel bk = new BookHotel();
		fillTextBox(bk.getFirst_name(), "kishore");
		fillTextBox(bk.getLast_name(), "jaganathan");
		fillTextBox(bk.getAddress(), "no.38,asdfgh,sdfghjkl,sdfghj-345643");
		fillTextBox(bk.getCc_num(), "1234567890123456");
		selectByValue(bk.getCc_type(), "AMEX");
		selectByValue(bk.getCc_exp_month(), "2");
		selectByValue(bk.getCc_exp_year(), "2022");
		fillTextBox(bk.getCc_cvv(), "321");
		click(bk.getBook_now());
		System.out.println("Test4");

	}

	
	@Test
	public void test5() throws Exception {
		BookingConfirm bkc = new BookingConfirm();
		
		Thread.sleep(10000);
        System.out.println("The Order ID is:");
		getAttribute(bkc.getOrder_no(), "value");

		screenShot(bkc.getOrder_no(), "./OrderId/orderid.png");
		System.out.println("Test5");

	}

}

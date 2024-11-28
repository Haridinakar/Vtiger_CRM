package com.crm.genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class Javautility {
	/**
	 * This method is used to generate system date and time
	 * 
	 * @return String
	 */
	public String getsystemtime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}

	/**
	 * This method generates random number within 1000
	 * @return Integer
	 */
	public int getRandomnum() {
		Random ran = new Random();
		return ran.nextInt(1000);
	}
}

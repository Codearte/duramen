package eu.codearte.duramen.test;

import eu.codearte.duramen.event.Event;

/**
 * Created by jkubrynski@gmail.com / 2014-02-10
 */
public class TestEvent extends Event {

	private String test;

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
}
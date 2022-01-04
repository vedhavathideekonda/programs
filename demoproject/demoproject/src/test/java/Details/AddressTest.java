package Details;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.objenesis.instantiator.basic.NewInstanceInstantiator;

class AddressTest {
AddressClass AddressTest;
	@Test
	void city() {
		String expected="hyd";
		String actual=AddressTest.getCity();
		assertEquals(expected,actual,"same or not");
		System.out.println("test pass");
	}

}

package com.booksimplementation.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.StatusAssertions;

@SpringBootTest
class SpringbootProjectApplicationTests {
	private Calculator c = new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void testSum() {

		//expected
		int expectedResult = 17;

		//actual
		int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expectedResult);

	}

	private StatusAssertions assertThat(int actualResult) {
		return null;
}

	@Test
	void testProduct() {
		//expected
		int expectedResult = 6;

		//actual
		int actualResult = c.doProduct(3, 2);

		assertThat(actualResult).isEqualTo(expectedResult);
	}
}
























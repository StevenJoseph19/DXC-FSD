package com.wiredbraincoffee.reward.section03;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByDiscountService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.*;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RewardByDiscountServiceTest {

	private RewardByDiscountService reward = null;

	RewardByDiscountServiceTest() {
		System.out.println("Constructor");
	}

	@BeforeAll
	// static void setUpAll() {
	// static keyword not required for PER_CLASS mode
	void setUpAll() {
		System.out.println("BeforeAll");
	}

	@BeforeEach
	void setUp() {
		reward = new RewardByDiscountService();
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() {
		System.out.println("AfterEach");
	}

	@AfterAll
	// static void tearDownAll() {
	// static keyword not required for PER_CLASS mode
	void tearDownAll() {
		System.out.println("AfterAll");
	}

	@Test
	void setNeededPoints() {
		System.out.println("Test setNeededPoints");
	

		reward.setNeededPoints(100);

		assertEquals(100, reward.getNeededPoints());
	}

	@Test
	void setPercentageForPoints() {
		System.out.println("Test setPercentageForPoints");
	

		reward.setPercentage(0.1);

		assertEquals(0.1, reward.getPercentage());
	}

	@Test
	void zeroCustomerPoints() {
		System.out.println("Test zeroCustomerPoints");
	
		Product smallDecaf = new Product(1, "Small Decaf", 1.99);
		List<Product> order = Collections.singletonList(smallDecaf);

		RewardInformation info = reward.applyReward(order, 0);

		assertEquals(0, info.getDiscount());
	}
}
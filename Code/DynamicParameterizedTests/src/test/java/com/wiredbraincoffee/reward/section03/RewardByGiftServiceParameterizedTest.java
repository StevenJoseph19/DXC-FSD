package com.wiredbraincoffee.reward.section03;

import com.wiredbraincoffee.reward.RewardByGiftService;
import com.wiredbraincoffee.reward.RewardInformation;
import com.wiredbraincoffee.product.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RewardByGiftServiceParameterizedTest {
	private RewardByGiftService reward = null;

	@BeforeEach
	void setUp(TestInfo testInfo) {
		reward = new RewardByGiftService();
		reward.setNeededPoints(100);
		System.out.println("BeforeEach: " + testInfo.getDisplayName());
	}

	@ParameterizedTest(name = "Test #{index}: productId={0}")
	@ValueSource(longs = { 1, 2, 3, 4 })
//	@ValueSource(longs = { 99, 2, 3, 4 })
	@DisplayName("Display name")
	void discountShouldBeApplied(long productId, TestInfo testInfo, TestReporter testReporter) {
		System.out.println("Display name: " + testInfo.getDisplayName());
		testReporter.publishEntry("Product Id", String.valueOf(productId));
		
		reward.setGiftProductId(productId);
		RewardInformation info = reward.applyReward(getSampleOrder(), 200);

		assertTrue(info.getDiscount() > 0);

	}

	private List<Product> getSampleOrder() {
		Product smallDecaf = new Product(1, "Small Decaf", 1.99);
		Product bigDecaf = new Product(2, "Big Decaf", 2.49);
		Product bigLatte = new Product(3, "Big Latte", 2.99);
		Product bigTea = new Product(4, "Big Tea", 2.99);
		Product espresso = new Product(5, "Espresso", 2.99);
		return Arrays.asList(smallDecaf, bigDecaf, bigLatte, bigTea, espresso);
	}
}
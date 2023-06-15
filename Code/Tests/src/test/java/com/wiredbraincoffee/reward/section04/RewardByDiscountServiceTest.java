package com.wiredbraincoffee.reward.section04;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByDiscountService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardByDiscountServiceTest {
	private RewardByDiscountService reward = null;
	private List<Product> smallOrder = null;
	private List<Product> bigOrder = null;

	@BeforeEach
	void setUp() {
		reward = new RewardByDiscountService();
		reward.setNeededPoints(100);
		reward.setPercentage(0.1);
		Product smallDecaf = new Product(1, "Small Decaf", 1.99);
		smallOrder = Collections.singletonList(smallDecaf);

		Product bigDecaf = new Product(2, "Big Decaf", 2.49);

		Product bigLatte = new Product(3, "Big Latte", 2.99);

		Product bigTea = new Product(4, "Big Tea", 2.99);

		Product espresso = new Product(5, "Espresso", 2.99);

		bigOrder = Arrays.asList(bigDecaf, bigLatte, bigTea, espresso);

	}

	@Test
	void setNeededPoints() {

		assertEquals(100, reward.getNeededPoints());
	}

	@Test
	void setPercentageForPoints() {

		assertEquals(0.1, reward.getPercentage());
	}

	@Test
	void zeroCustomerPoints() {

		RewardInformation info = reward.applyReward(smallOrder, 0);

		assertEquals(0, info.getDiscount());
		assertEquals(0, info.getPointsRedeemed());
	}

	@Test
	void enoughCustomerPointsForDiscountInBigOrder() {

		RewardInformation info = reward.applyReward(bigOrder, 200);

		assertEquals(1.14, info.getDiscount(), 0.01);
		assertEquals(100, info.getPointsRedeemed());
	}

}

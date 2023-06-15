package com.wiredbraincoffee.reward.section04;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardByDiscountService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Reward by Conversion \uD83D\uDE84")
public class RewardByDiscountServiceNestedTest {
	private RewardByDiscountService reward = null;

	@DisplayName("Given that 100 points are needed for $10")
	@BeforeEach
	void setUp() {
		reward = new RewardByDiscountService();
		reward.setPercentage(0.1);
		reward.setNeededPoints(100);
	}

	@DisplayName("Then 100 points should be  needed for 10% discount")
	@Test
	void checkPercentageAndNeededPoints() {
		assertEquals(0.1, reward.getPercentage());
		assertEquals(100, reward.getNeededPoints());
	}

	@DisplayName("Given there's a small order")
	@Nested
	class SmallOrder {
		private List<Product> smallOrder = null;

		@BeforeEach
		void setUp() {
			Product smallDecaf = new Product(1, "Small Decaf", 1.99);
			smallOrder = Collections.singletonList(smallDecaf);
		}

		@DisplayName("Given the customer has zero points")
		@Nested
		class ZeroPoints {
			private RewardInformation info = null;

			@DisplayName("When the reward is applied")
			@BeforeEach
			void setUp() {
				info = reward.applyReward(smallOrder, 0);
			}

			@DisplayName("Then discount should be zero")
			@Test
			void checkDiscount() {
				assertEquals(0, info.getDiscount());
			}

			@DisplayName("Then points redeemed should be zero")
			@Test
			void checkPointsRedeemed() {
				assertEquals(0, info.getPointsRedeemed());
			}
		}
	}

	@DisplayName("Given there's a big order")
	@Nested
	class BigOrder {
		private List<Product> bigOrder = null;

		@BeforeEach
		void setUp() {
			Product bigDecaf = new Product(2, "Big Decaf", 2.49);
			Product bigLatte = new Product(3, "Big Latte", 2.99);
			Product bigTea = new Product(4, "Big Tea", 2.99);
			Product espresso = new Product(5, "Espresso", 2.99);
			bigOrder = Arrays.asList(bigDecaf, bigLatte, bigTea, espresso);
		}

		@DisplayName("When customerhas enough points , then reward should be applied")
		@Test
		void enoughCustomerPointsForDiscountInBigOrder() {
			RewardInformation info = reward.applyReward(bigOrder, 200);

			assertEquals(1.14, info.getDiscount(), 0.01);
			assertEquals(100, info.getPointsRedeemed());
		}
	}
}

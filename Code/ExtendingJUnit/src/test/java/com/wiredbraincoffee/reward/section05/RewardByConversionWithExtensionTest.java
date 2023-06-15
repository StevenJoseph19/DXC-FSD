package com.wiredbraincoffee.reward.section05;

import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.Nested;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RewardByConversionWithExtensionTest {

	
	  @Nested class OneNestedClass {
	  
	  @TestWithErrorHandler void changeAmount(RewardByConversionService reward) {
	  reward.setAmount(-20);
	  
	  assertEquals(-20, reward.getAmount()); } }
	 

	@TestWithErrorHandler
	void changeAmount(RewardByConversionService reward) {
		reward.setAmount(-20);

		assertEquals(-20, reward.getAmount());
	}

	@TestWithErrorHandler
	void rewardNotAppliedEmptyOrder(RewardByConversionService reward) {
		RewardInformation info = reward.applyReward(new ArrayList<>(), 500);

		assertEquals(0, info.getPointsRedeemed());
		assertEquals(0, info.getDiscount());
	}
}

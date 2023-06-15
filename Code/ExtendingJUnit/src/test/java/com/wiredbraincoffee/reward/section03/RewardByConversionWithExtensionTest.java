package com.wiredbraincoffee.reward.section03;

import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardByConversionWithExtensionTest {
	@RegisterExtension
	RewardByConversionParameterResolver pr = new RewardByConversionParameterResolver();

	@Test
	void changeAmount(RewardByConversionService reward) {
		reward.setAmount(20);

		assertEquals(20, reward.getAmount());
	}

	@Test
	void rewardNotAppliedEmptyOrder(RewardByConversionService reward) {
		RewardInformation info = reward.applyReward(new ArrayList<>(), 500);

		assertEquals(0, info.getPointsRedeemed());
		assertEquals(0, info.getDiscount());
	}
}

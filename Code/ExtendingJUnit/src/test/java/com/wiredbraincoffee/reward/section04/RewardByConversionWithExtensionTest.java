package com.wiredbraincoffee.reward.section04;

import com.wiredbraincoffee.reward.RewardByConversionService;
import com.wiredbraincoffee.reward.RewardInformation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@TestWithErrorHandler
public class RewardByConversionWithExtensionTest {

	
//    @Test
	@TestWithErrorHandler
    void changeAmount(RewardByConversionService reward) {
//        reward.setAmount(20);
    	  reward.setAmount(-20);

        assertEquals(20, reward.getAmount());
    }

//    @Test
	@TestWithErrorHandler
    void rewardNotAppliedEmptyOrder(RewardByConversionService reward) {
        RewardInformation info = reward.applyReward(
                new ArrayList<>(),
                500
        );

        assertEquals(0, info.getPointsRedeemed());
        assertEquals(0, info.getDiscount());
    }
}

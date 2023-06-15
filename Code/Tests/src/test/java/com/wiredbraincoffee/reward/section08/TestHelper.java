package com.wiredbraincoffee.reward.section08;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.wiredbraincoffee.product.Product;
import com.wiredbraincoffee.reward.RewardService;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface TestHelper {

	List<Product> getSampleOrder();

	List<Product> getEmptyOrder();

	@Test
	@DisplayName("Correct points are set")
	default void correctPoints() {
		Assertions.assertEquals(100, getRewardService().getNeededPoints());
	}

	@BeforeEach
	default void beforeEach() {
		System.out.println("beforeEach defined in the interface");
	}

	@BeforeAll
//	static void beforeAll() {
	default void beforeAll() {
		System.out.println("Before all tests");
	}

	@AfterAll
//	static void afterAll() {
	default void afterAll() {
		System.out.println("After all tests");
	}

	RewardService getRewardService();;

}
package com.wiredbraincoffee.reward.section03;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;

import com.wiredbraincoffee.reward.RewardByConversionService;

public class RewardByConversionParameterResolver implements ParameterResolver {

	@Override
	public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {

		return parameterContext.getParameter().getType().equals(RewardByConversionService.class);
	}

	@Override
	public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext)
			throws ParameterResolutionException {

		RewardByConversionService reward = new RewardByConversionService();
		reward.setNeededPoints(100);
		reward.setAmount(10);
		return reward;
	}

}

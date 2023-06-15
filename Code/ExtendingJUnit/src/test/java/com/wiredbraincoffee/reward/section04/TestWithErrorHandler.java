package com.wiredbraincoffee.reward.section04;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.wiredbraincoffee.reward.section05.IllegalArgumentExceptionHandlerExtension;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(
		{
			IllegalArgumentExceptionHandlerExtension.class,
			RewardByConversionParameterResolver.class
		}
		)
@Test
public @interface TestWithErrorHandler {

}

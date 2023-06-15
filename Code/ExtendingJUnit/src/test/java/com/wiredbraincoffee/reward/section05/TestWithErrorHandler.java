package com.wiredbraincoffee.reward.section05;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Test
@ExtendWith({IllegalArgumentExceptionHandlerExtension.class, RewardByConversionParameterResolver.class, DisableTestsIfExceptionThrownExtension.class})
public @interface TestWithErrorHandler {
}
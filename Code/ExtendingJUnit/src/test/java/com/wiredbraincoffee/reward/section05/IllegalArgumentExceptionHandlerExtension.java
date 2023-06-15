package com.wiredbraincoffee.reward.section05;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import static com.wiredbraincoffee.reward.section05.ExtensionUtils.NAMESPACE;
import static com.wiredbraincoffee.reward.section05.ExtensionUtils.EXCEPTION_KEY;
import static com.wiredbraincoffee.reward.section05.ExtensionUtils.getEngineContext;

public class IllegalArgumentExceptionHandlerExtension implements TestExecutionExceptionHandler {
	@Override
	public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {
		if (throwable instanceof IllegalArgumentException) {
			ExtensionContext engineContext = getEngineContext(context);
			engineContext.getStore(NAMESPACE).put(EXCEPTION_KEY, throwable);
			return;
		}
		throw throwable;
	}
}

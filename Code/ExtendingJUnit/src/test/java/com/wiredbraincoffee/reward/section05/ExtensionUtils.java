package com.wiredbraincoffee.reward.section05;

import org.junit.jupiter.api.extension.ExtensionContext;

public class ExtensionUtils {
	
	public static final ExtensionContext.Namespace NAMESPACE = 
						ExtensionContext.Namespace.create(
								"My", "Custom", "Namespace", "for", "my", "extension");
								
	
	public static final  String EXCEPTION_KEY = "Exception";
	
	public static ExtensionContext getEngineContext(ExtensionContext contextParam) {
		return contextParam.getRoot();
	}
}

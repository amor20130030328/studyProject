package com.gy.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsConditional implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

		String osName = context.getEnvironment().getProperty("os.name");
		if(osName.contains("Window") || osName.contains("window")) {
			return true;
		}
		return false;
	}

}

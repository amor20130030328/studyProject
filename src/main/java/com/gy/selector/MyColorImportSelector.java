package com.gy.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyColorImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {

		
		String [] arr = new String[] {"com.gy.bean.Yellow","com.gy.bean.Green"};
		return arr;
	}

}

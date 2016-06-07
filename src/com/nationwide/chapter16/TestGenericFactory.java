package com.nationwide.chapter16;

import com.nationwide.chapter2.MyClass;

public class TestGenericFactory {

	/**
	 * @param args
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args) throws IllegalAccessException,
			InstantiationException {
		GenericFactory<MyClass> factory = new GenericFactory<MyClass>(
				MyClass.class);

		MyClass myClassInstance = factory.createInstance();

	}

}

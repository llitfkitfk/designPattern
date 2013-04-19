package org.context;

import org.service.Service;
import org.service.ServiceLocator;

public class ServiceLocatorPatternDemo {
	public static void main(String[] args) {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		
		service =ServiceLocator.getService("Service2");
		service.execute();
		
		service =ServiceLocator.getService("Service1");
		service.execute();

		service =ServiceLocator.getService("Service2");
		service.execute();

	}
}

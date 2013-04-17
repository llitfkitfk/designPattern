package org.image.demo;

import org.image.Image;
import org.image.proxy.ProxyImage;

public class ProxyPatternDemo {
	
	public static void main(String[] args) {
		Image image = new ProxyImage("realImage.jpg");
		
		image.display();
		
		System.out.println(" ");
		image.display();
	}
}

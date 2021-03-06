package com.llitfkitfk.cache;

import java.util.Hashtable;

import com.llitfkitfk.shap.Circle;
import com.llitfkitfk.shap.Rectangle;
import com.llitfkitfk.shap.Shape;
import com.llitfkitfk.shap.Square;

public class ShapeCache {
	
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId) {
		Shape cacheShape = shapeMap.get(shapeId);
		
		return (Shape) cacheShape.clone();
	}
	
	public static void loadCache() {
		
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
		
	}
}

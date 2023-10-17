package oop1;

public class Rectangle {
    private int length, width;
    
    // Constructor 
    public Rectangle(int l, int w) {
    	length = l;
    	width = w;
    }
    
    public int area() {
    	return  length * width; 
    }
    
    public void setLength(int l) {
    	length = l;
    }
    
    public void setWidth(int w) {
    	width = w;
    }
    
    public int getLength() {
    	return length;
    }
    
    public int getWidth() {
    	return width;
    }
}

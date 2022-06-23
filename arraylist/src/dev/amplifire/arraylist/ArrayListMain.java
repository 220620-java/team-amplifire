package dev.amplifire.arraylist;

public class ArrayListMain {
	
	public static void main(String[] args) {
		ArrayList arr = new ArrayList(16);
		for (int i=0; i<16; i++) {
			arr.append("Hello");
			arr.append("Goodbye");
		}
		System.out.println(arr.getSize());
	}
	
}

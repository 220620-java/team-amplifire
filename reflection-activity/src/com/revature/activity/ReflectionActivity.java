package com.revature.activity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import com.revature.exercise.SecretClass;

public class ReflectionActivity {

	/*
	 * Find all of the following:
	 * 1. What fields does the secret class have?
	 * 2. What methods does the secret class have?
	 * 3. What are the modifiers on the fields and the methods?
	 * 4. What happens when you call each of the methods?
	 * 5. What are the values of the fields?
	 * 6. What annotations are used in the secret class?
	 * 7. What fields do the annotations have?
	 * 8. Which fields in the secret class use the annotations?
	 * 9. What are the values of those annotations' fields on each class field?
	 * 10. What annotation(s) does the class itself have, and what are the values of 
	 *     the field(s) on them?
	 */
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		SecretClass secret = new SecretClass();
		// secret. reveals all the methods and what they return/intake
		printClassInfo(secret);
	}
	
	/**
	 * 1. The fields are an int id, String name, String message, and final passcode.
	 * 2. The methods are getMessage(), getStaticMessage(), wait(long, int), wait(), wait(long), equals(Object),
	 * toString(), hashCode(), getClass(), notify(), notifyAll().
	 * 3. int is private, name is private, message is prive, passcode is private final;
	 * getMessage() is public, getStaticMessage() is public static, wait() is final, wait() is final, wait() is final native, equals() is public,
	 * toString() is public, hashCode() is public native, getClass() is public final native, notify() is public final native, and notifyAll() is public final
	 * native.
	 * 4. getMessage() returns the runtime, getStaticMessage() returns nothing, wait(long, int) returns the runtime in milliseconds and nanoseconds, wait() does not return anything,
	 * wait(long) returns the runtime in milliseconds, equals(Object) returns a boolean, toString() returns a string, hashCode() returns a hashcode value, getClass() returns the class
	 * object, notify() returns nothing, and notifyAll() returns nothing.
	 * @throws InstantiationException 
	 * 
	 */
	public static void printClassInfo(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class objClass = obj.getClass();
		//System.out.println(objClass);
		
		Constructor[] constructors = objClass.getConstructors();
		//System.out.println(Arrays.toString(constructors));
		for(Constructor constructor : constructors) {
			Parameter[] params = constructor.getParameters();
			for(Parameter param : params) {
				System.out.println(param);
			}
		}
		
		
		
		
		Field[] fields = objClass.getDeclaredFields();
		// Finding the modifiers for the fields
		/*
		 * for(Field field : fields) { System.out.println("Modifiers: " +
		 * Modifier.toString(field.getModifiers())); }
		 */
		
		// Finds all the fields in Secret class
		/*
		 * for(Field field : fields) { System.out.println(field); }
		 */
		Method[] methods = objClass.getMethods();
		// Finds the modifiers for the methods
		/*
		 * for(Method method : methods) { System.out.println("Modifiers: " +
		 * Modifier.toString(method.getModifiers())); }
		 */
		 
		 
		// Finds all the methods in the Secret Class.
		/*
		 * for(int i = 0; i < methods.length; i++) {
		 * System.out.println("The methods are: " + methods[i].toString()); }
		 */
		 
		
	
	
	
	}

	/*
	 * Example using the class and annotation below:
	 * 
	 * 1. the fields are name and number
	 * 2. the method is getName
	 * 3. name is public, number is public/static, getName() is public
	 * 4. the method returns the value of the name field
	 * 5. the value of name is "Ash", the value of number is 30
	 * 6. the annotation is Hello
	 * 7. the Hello annotation has a "value" field
	 * 8. the number field uses the Hello annotation
	 * 9. the "value" field of Hello is "num" on the number field
	 * 10. the class has the Hello field and its value is the default, "world"
	 * 
	 * @Hello
	 * public class Example {
	 * 		private String name = "Ash";
	 * 		@Hello(value="num")
	 * 		private static int number = 30;
	 *		public String getName() {
	 *			return this.name;
	 *		}
	 * }
	 * 
	 * @interface Hello {
	 * 		String value() default "world";
	 * }
	 */
}

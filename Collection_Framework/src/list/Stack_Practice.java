package list;

import java.util.Stack;

public class Stack_Practice {
	public static void main(String[] args) {
	
	Stack<String> animals = new Stack<>();
	animals.push("Lion"); // pushing the animal name in stack 
	animals.push("Dog");
	animals.push("Horse");
	animals.push("Cat");
	
	System.out.println("Stack : "+ animals);
	
//	to check top element
		System.out.println(animals.peek());
		
//	to remove the element from the stack 
		animals.pop();
		System.out.println(animals);
		System.out.println(animals.peek()); // to check top one element
		
	
	}
}

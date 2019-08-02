package question1;

import java.util.ArrayList;
import java.util.List;

public class Stack {
	List<String> stack = new ArrayList<String>();
	int top = -1;

	protected void push(String element){
		top++;
		stack.add(element);
	}
	
	protected void pop(){
		if(isEmpty())
			throw new AssertionError("Stack empty");
		else
			top--;
	}
	protected String peek(){
		if(isEmpty())
			throw new AssertionError("Stack empty");
		else
			return stack.get(top);
		}
	protected boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	
	protected void print(){
		for(String s:stack){
			System.out.println(s);
		}
	}
}

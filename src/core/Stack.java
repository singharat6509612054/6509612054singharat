package core;

import java.util.ArrayList;

public class Stack implements iStack {

	private ArrayList<Object> stack;
	private int maxsize,count;
	private Object top;
	
	Stack(int s){
		
		stack = new ArrayList<>();
		maxsize =s;
		count=0;
	}
	@Override
	public boolean isEmpty() {
		if(count==0)
			return true;
		else
			return false;
	}

	@Override
	public int getSize() {
		
		return count;
	}
	
	@Override
	public boolean isFull() {
		if(count == maxsize)
			return true;
		else
			return false;
	}


	@Override
	public void push(Object n){
		
		if(count<maxsize) {
			stack.add(n);
			top = n;
			count++;
		}
		
		
	}

	@Override
	public Object top() {
	
		return top;
	}
	@Override
	public Object pop() {
		
		Object tmp;
		if(stack.size()==1) {
			tmp = stack.get(0);
			stack.remove(0);
			return tmp;
		}
		else {
			tmp = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
			top = stack.get(stack.size()-1);
			return tmp;
		}
		
		
	}

}

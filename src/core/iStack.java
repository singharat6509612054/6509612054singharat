package core;

public interface iStack {
	boolean isEmpty();
	boolean isFull();
	int getSize();
	void push(Object n);
	Object top();
	Object pop();
	

}
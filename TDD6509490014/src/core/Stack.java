package core;

import java.util.ArrayList;

public class Stack implements IStack {
	private ArrayList<Object> item;
	private ArrayList<Object> stack;
	
	public Stack() {
		stack =new ArrayList<Object>();
		}

	@Override
	public boolean isEmpty() {
		if(item.size() == 0)
			return true;
		else
			return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return item.size();
	}

	@Override
	public void push(int i) {
			item.add(i);
		
	}
	public Object Top() {
		return stack.get(stack.size()-1);
	}

	public Object pop() {
		if(isEmpty()) {
			return null;
		}
		return stack.remove(stack.size()-1);
	}

	@Override
	public void push(object elm) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}

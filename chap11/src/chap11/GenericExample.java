package chap11;

import chap11.*;

public class GenericExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup<Boricha> c = new Cup<>();
		
		c.setBeverage(new Boricha());
		Boricha b = c.getBeverage();
	}
}
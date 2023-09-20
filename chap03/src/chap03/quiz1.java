package chap03; //[퀴즈] 배열 만들기

public class quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//방법 3
		double[] score1 = { 3.45, 2.82, 3.85, 3.94 };
		
		//방법 2
		double[] score2 = new double[] { 3.45, 2.82, 3.85, 3.94 };
		
		//방법 1
		double[] score3 = new double[4];
		score3[0] = 3.45;
		score3[1] = 2.82;
		score3[2] = 3.85;
		score3[3] = 3.94;
	}

}

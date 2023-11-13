package Test05;

public class studentExample {

	public static void main(String[] args) {
		student alim = new student("한아림", 39, 59); 
		
		System.out.print(alim.name + " 학생의 과제 점수는 "+alim.score_Ass+"점이고, 시험 점수는 " + alim.score_Test + "점입니다.");
		System.out.println(" 따라서 " + alim.name + " 학생의 최종 성적은 " + alim.final_grade + "입니다.");
	}
	}

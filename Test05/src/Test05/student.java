package Test05;

public class student {
	
	int score_Ass;
	int score_Test;
	String name;
	String final_grade;
	
	student(){};
	
	student(String name, int score_Ass, int score_Test)
	{
		this.name = name;
		this.score_Ass = score_Ass;
		this.score_Test = score_Test;
		
		if(score_Ass+ score_Test >= 90)
		{
			this.final_grade = "A";
		}
		else if(score_Ass+ score_Test >= 80)
		{
			this.final_grade = "B";
		}
		else if(score_Ass+ score_Test >= 70)
		{
			this.final_grade = "C";
		}
		else if(score_Ass+ score_Test >= 60)
		{
			this.final_grade = "D";
		}
		else
		{
			this.final_grade = "F";
		}
	}
}

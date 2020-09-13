package alg.com.javaexample;

public class JavaExample10 {
	
	/*
	 * Assignment
	 * TODO: Convert the if else in getScore() method to switch statement
	 */
	
	public void calculateFinalGrade(String studName, String mathGrade, String phyGrade, String cheGrade){
		int math;
		int phy;
		int che;
		int totalScoreAvg;
		String finalGrade;
		
		math = getScore(mathGrade);
		phy = getScore(phyGrade);
		che = getScore(cheGrade);
		
		totalScoreAvg = (math + phy + che)/3;
		finalGrade = getFinalGrade(totalScoreAvg);
		
		System.out.println("The Final Grade of " + studName + " is " + finalGrade);
	}

	public int getScore(String grade){
		int score=0;
		
		if(grade.contentEquals("A")){
			score = 80;
		}else if(grade.contentEquals("B")){
			score =70;
		}else if(grade.contentEquals("C")){
			score =60;
		}
		
		return score;
	}
	
	public String getFinalGrade(int score){
		String finalGrade = "";
		if(score>=80){
			finalGrade = "A";
		}else if (score>=70 && score<=79){
			finalGrade = "B";
		}else{
			finalGrade = "C";
		}
		
		return finalGrade;
	}
	
	public static void main(String args[]){
		JavaExample10 stud = new JavaExample10();
		stud.calculateFinalGrade("William", "A", "B", "C");
		stud.calculateFinalGrade("Sandy", "A", "A", "C");
	}
}

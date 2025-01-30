package QuizProject;

import java.util.Scanner;

public class QuestionService extends Question{

//	Creating an array for Questionclass
   Question[] questions = new Question[3];
   String selection[] = new String[3];
   
   public QuestionService() {
//	   Create an obj and assign the values for the objet by calling parameterized constructor
	   questions[0] = new Question(1, "What is int size", "8", "4", "2", "4");
	   questions[1] = new Question(2, "What is char size", "8", "4", "2", "2");
	   questions[2] = new Question(3, "What is float size", "8", "4", "2", "4");
   }
   public void displayQuestions() {
	   
//	   Iterate through array and print the questions array
	   int i=0;
	   for(Question q : questions) {
	   System.out.println(q.getId()+"."+q.getQuestion()+"?");
	   
	   System.out.println("1."+q.getOpt1()+" "+"2."+q.getOpt2()+" "+"3."+q.getOpt3());
	   System.out.println();
	   Scanner sc = new Scanner(System.in);
	   selection[i++] = sc.nextLine();
	   }
	   System.out.println("User Selected Answers: ");
	   for(String s:selection)
	   System.out.print(s+" ");
	   System.out.println();
   }
   public void printScore() {
	   int score =0;
	   for(int i =0;i<questions.length;i++) {
		  
		   String actualAnswer = questions[i].getAnswer();
		   String userAnswer = selection[i];
		   if(actualAnswer.equals(userAnswer)) {
			   score++;
		   }
		}
	   System.out.println("You Scored "+score+" Out Of "+questions.length);
	   System.out.println("Well Done!!");
	   
	   
   }
}

package second;

import java.util.Iterator;
import java.util.Set;


public class Question1 {
private int questionid;
private String question;
private Set<String> answers;
public int getQuestionid() {
	return questionid;
}
public void setQuestionid(int questionid) {
	this.questionid = questionid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Set<String> getAnswers() {
	return answers;
}
public void setAnswers(Set<String> answers) {
	this.answers = answers;
}
public void display() {
	System.out.println(questionid+question+" ");
	System.out.println("answers are:");
	Iterator<String> it =answers.iterator();
	   while(it.hasNext())
	   {
		   String answer=(String)it.next();
		   System.out.println(answer);
	      }
}
}

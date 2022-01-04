package second;

import java.util.Iterator;
import java.util.List;

public class Question {
private int questionid;
private String question;
private List<String> answers;


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
public List<String> getAnswers() {
	return answers;
}
public void setAnswers(List<String> answers) {
	this.answers = answers;
}
public void display() {
	System.out.println(questionid+question+" ");
	System.out.println("answers are:");
	Iterator<String>itr=answers.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}

}

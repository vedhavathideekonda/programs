package second;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Question2 {
	
		private int questionid;
		private String question;
		private Map<Integer,String> answers;
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
		public Map<Integer, String> getAnswers() {
			return answers;
		}
		public void setAnswers(Map<Integer, String> answers) {
			this.answers = answers;
		}
		public void display() {
			System.out.println(questionid+question+" ");
			System.out.println("answers are:");
		Set<Entry<Integer,String>> entrySet=answers.entrySet();
        for(Entry<Integer,String>entry:entrySet){
        	 System.out.println(entry.getKey() + " :: " + entry.getValue());
        }
        }	
}

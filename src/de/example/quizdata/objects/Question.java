package de.example.quizdata.objects;

import java.util.ArrayList;
import java.util.List;

public class Question {
	
	private String text;
	private String info;
	private String subject;
	/*
	 * Aggregation (Sammlung) der Instanzen der Klasse Answer, bzw der Answer-Objekte.
	 */
	private List<Answer> answers;
	
	public Question(String text) {
		super();
		this.text = text;
	}
	
	public Question(String text, String info) {
		this.text = text;
		this.info = info;
	}
	
	public Question(String text, String info, String subject) {
		this.text = text;
		this.info = info;
		this.subject = subject;
	}
	public void addAnswer(Answer answer) {
		
		if(answers == null)
			answers = new ArrayList<Answer>();
		answers.add(answer);
		answer.setQuestion(this);
	}
	
	public void addAnswer(String text, boolean correct) {
		addAnswer(new Answer(text,correct));
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}


	
}

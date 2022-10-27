package org.map.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class AnswerOToM {
    @Id
    private int answerId;
    @ManyToOne
    private QuestionOToM questionOToM;
    private String answer;

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public QuestionOToM getQuestion() {
        return questionOToM;
    }

    public void setQuestion(QuestionOToM questionOToM) {
        this.questionOToM = questionOToM;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

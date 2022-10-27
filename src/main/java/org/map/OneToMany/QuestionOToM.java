package org.map.OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class QuestionOToM {
    @Id
    private int questionId;
    private String question;
    @OneToMany
    private List<AnswerOToM> answerOneToManies;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerOToM> getAnswers() {
        return answerOneToManies;
    }

    public void setAnswers(List<AnswerOToM> answerOneToManies) {
        this.answerOneToManies = answerOneToManies;
    }
}

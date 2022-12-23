package com.OneToManyMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class QuestionMany {
    @Id
    private int questionId;
    private String question;
    @OneToMany(mappedBy = "question")
    private List<AnswerMany> answerMany;

    public List<AnswerMany> getAnswer() {
        return answerMany;
    }

    public void setAnswer(List<AnswerMany> answerMany) {
        this.answerMany = answerMany;
    }

    public QuestionMany(int questionId, String question) {
        this.questionId = questionId;
        this.question = question;
    }

    public QuestionMany() {
    }

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
}

package com.OneToManyMap;

import com.OneToOneMap.Question;

import javax.persistence.*;

@Entity
public class AnswerMany {
    @Id
    private int id;
    private String answer;
    @ManyToOne
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public AnswerMany(int id, String answer) {
        this.id = id;
        this.answer = answer;
    }

    public AnswerMany() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

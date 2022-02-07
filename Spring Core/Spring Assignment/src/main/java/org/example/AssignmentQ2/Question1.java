package org.example.AssignmentQ2;

import java.util.List;

public class Question1 {
    private int questionId;
    private String question;
    private List<String> answers;

    public Question1() {
        super();
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

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question1: [" +
                "questionId=" + questionId + '\n' +
                ", question='" + question + '\n' +
                ", answers=" + answers + '\n' +
                ']';
    }
}

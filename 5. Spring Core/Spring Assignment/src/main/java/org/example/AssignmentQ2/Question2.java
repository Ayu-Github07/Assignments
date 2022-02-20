package org.example.AssignmentQ2;

import java.util.Set;

public class Question2 {
    private int questionId;
    private String question;
    private Set<String> answers;

    public Question2() {
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

    public Set<String> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question2: [" +
                "questionId=" + questionId + '\n' +
                ", question='" + question + '\n' +
                ", answers=" + answers + '\n' +
                ']';
    }
}

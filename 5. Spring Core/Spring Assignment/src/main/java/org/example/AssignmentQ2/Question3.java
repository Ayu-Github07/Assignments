package org.example.AssignmentQ2;

import java.util.Map;

public class Question3 {
    private int questionId;
    private String questionName;
    private Map<Integer,String> answers;

    public Question3() {
        super();
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Map<Integer, String> getAnswers() {
        return answers;
    }

    public void setAnswers(Map<Integer, String> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question3: [" +
                "questionId=" + questionId +'\n' +
                ", questionName='" + questionName + '\n' +
                ", answers=" + answers +'\n' +
                ']';
    }
}

package com.tencent.wxcloudrun.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private String question;
    private String questionType;
    private String answerType;
    private List<String> options;
    private String answerExample;
    private Integer taskId;

    public Question(String question, String questionType, String answerType, List<String> options, String answerExample) {
        this.question = question;
        this.questionType = questionType;
        this.answerType = answerType;
        this.options = options;
        this.answerExample = answerExample;
    }

}

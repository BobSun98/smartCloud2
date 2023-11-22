package com.tencent.wxcloudrun.dto;

import com.tencent.wxcloudrun.model.Question;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeworkDTO {
    private String name;
    private String status;
    private String creator;
    private List<Question> questions;
    private String deadLine;
}

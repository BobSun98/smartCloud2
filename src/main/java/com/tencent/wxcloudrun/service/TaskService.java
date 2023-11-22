package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Question;
import com.tencent.wxcloudrun.model.Task;

import java.util.List;

public interface TaskService {
   public void saveTaskAndQuestions(Task task, List<Question> questions);
}

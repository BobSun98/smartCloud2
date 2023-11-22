package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dao.QuestionMapper;
import com.tencent.wxcloudrun.dao.TaskMapper;
import com.tencent.wxcloudrun.model.Question;
import com.tencent.wxcloudrun.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService{
    @Autowired
    private TaskMapper taskMapper;

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public void saveTaskAndQuestions(Task task, List<Question> questions) {
        // 保存到 task中
        System.out.println( task );
        taskMapper.saveTask(task);
        
        int taskId = task.getTaskId();
        
        // 遍历 Quesion 列表
        for (Question question : questions) {
            question.setTaskId( taskId);
            questionMapper.saveQuestion(question);
        }

    }
}

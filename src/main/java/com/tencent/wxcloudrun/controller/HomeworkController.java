package com.tencent.wxcloudrun.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dao.TaskMapper;
import com.tencent.wxcloudrun.dto.HomeworkDTO;
import com.tencent.wxcloudrun.model.Homework;
import com.tencent.wxcloudrun.model.Question;
import com.tencent.wxcloudrun.model.Task;
import com.tencent.wxcloudrun.service.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
@RequestMapping("/task")
public class HomeworkController {

    @Autowired
    private TaskServiceImpl taskService;
    static int taskId = 1;

    @PostMapping("/create")
    public ApiResponse createHomework(@RequestBody HomeworkDTO homework) throws  ParseException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        objectMapper.writeValueAsString(homework)
        String name = homework.getName();
        String status = homework.getStatus();
        String creator = homework.getCreator();
        Date deadLine = new SimpleDateFormat("yyyy-MM-dd").parse(homework.getDeadLine());
        Task task = new Task( name, status, creator, deadLine,taskId++);
        taskService.saveTaskAndQuestions(task, homework.getQuestions());

        return ApiResponse.ok(1);
    }

    // 问题：
    //  1.  主键的问题
    //  2.
}

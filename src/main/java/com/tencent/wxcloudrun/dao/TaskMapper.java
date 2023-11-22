package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Task;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface TaskMapper {
    public void saveTask(Task task);
}

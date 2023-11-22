package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Question;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QuestionMapper {
    public void saveQuestion(Question question);
}

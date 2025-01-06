package com.example.demo.mapper;

import com.example.demo.model.TbQuestion;
import com.example.demo.model.TbQuestionExample;
import java.util.List;

import com.example.demo.model.vo.QuestionVo;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionMapper {
    int countByExample(TbQuestionExample example);

    int deleteByPrimaryKey(String id);

    int insert(TbQuestion record);

    int insertSelective(TbQuestion record);

    List<TbQuestion> selectByExample(TbQuestionExample example);

    TbQuestion selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TbQuestion record, @Param("example") TbQuestionExample example);

    int updateByExample(@Param("record") TbQuestion record, @Param("example") TbQuestionExample example);

    int updateByPrimaryKeySelective(TbQuestion record);

    int updateByPrimaryKey(TbQuestion record);

    QuestionVo queryQuestion(String title);
}
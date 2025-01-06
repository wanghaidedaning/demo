package com.example.demo.mapper;

import com.example.demo.model.TbUserVisitedQuestion;
import com.example.demo.model.TbUserVisitedQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserVisitedQuestionMapper {
    int countByExample(TbUserVisitedQuestionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbUserVisitedQuestion record);

    int insertSelective(TbUserVisitedQuestion record);

    List<TbUserVisitedQuestion> selectByExample(TbUserVisitedQuestionExample example);

    TbUserVisitedQuestion selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbUserVisitedQuestion record, @Param("example") TbUserVisitedQuestionExample example);

    int updateByExample(@Param("record") TbUserVisitedQuestion record, @Param("example") TbUserVisitedQuestionExample example);

    int updateByPrimaryKeySelective(TbUserVisitedQuestion record);

    int updateByPrimaryKey(TbUserVisitedQuestion record);
}
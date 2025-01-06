package com.example.demo.mapper;

import com.example.demo.model.TbUserCollectedQuestion;
import com.example.demo.model.TbUserCollectedQuestionExample;
import com.example.demo.model.TbUserCollectedQuestionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCollectedQuestionMapper {
    int countByExample(TbUserCollectedQuestionExample example);

    int deleteByPrimaryKey(TbUserCollectedQuestionKey key);

    int insert(TbUserCollectedQuestion record);

    int insertSelective(TbUserCollectedQuestion record);

    List<TbUserCollectedQuestion> selectByExample(TbUserCollectedQuestionExample example);

    TbUserCollectedQuestion selectByPrimaryKey(TbUserCollectedQuestionKey key);

    int updateByExampleSelective(@Param("record") TbUserCollectedQuestion record, @Param("example") TbUserCollectedQuestionExample example);

    int updateByExample(@Param("record") TbUserCollectedQuestion record, @Param("example") TbUserCollectedQuestionExample example);

    int updateByPrimaryKeySelective(TbUserCollectedQuestion record);

    int updateByPrimaryKey(TbUserCollectedQuestion record);
}
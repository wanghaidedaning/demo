package com.example.demo.mapper;

import com.example.demo.model.TbQuestionTagExample;
import com.example.demo.model.TbQuestionTagKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionTagMapper {
    int countByExample(TbQuestionTagExample example);

    int deleteByPrimaryKey(TbQuestionTagKey key);

    int insert(TbQuestionTagKey record);

    int insertSelective(TbQuestionTagKey record);

    List<TbQuestionTagKey> selectByExample(TbQuestionTagExample example);

    int updateByExampleSelective(@Param("record") TbQuestionTagKey record, @Param("example") TbQuestionTagExample example);

    int updateByExample(@Param("record") TbQuestionTagKey record, @Param("example") TbQuestionTagExample example);
}
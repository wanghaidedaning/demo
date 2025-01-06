package com.example.demo.mapper;

import com.example.demo.model.TbUserLikedQuestionExample;
import com.example.demo.model.TbUserLikedQuestionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserLikedQuestionMapper {
    int countByExample(TbUserLikedQuestionExample example);

    int deleteByPrimaryKey(TbUserLikedQuestionKey key);

    int insert(TbUserLikedQuestionKey record);

    int insertSelective(TbUserLikedQuestionKey record);

    List<TbUserLikedQuestionKey> selectByExample(TbUserLikedQuestionExample example);

    int updateByExampleSelective(@Param("record") TbUserLikedQuestionKey record, @Param("example") TbUserLikedQuestionExample example);

    int updateByExample(@Param("record") TbUserLikedQuestionKey record, @Param("example") TbUserLikedQuestionExample example);
}
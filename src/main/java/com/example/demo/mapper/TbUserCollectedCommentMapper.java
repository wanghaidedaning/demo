package com.example.demo.mapper;

import com.example.demo.model.TbUserCollectedCommentExample;
import com.example.demo.model.TbUserCollectedCommentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserCollectedCommentMapper {
    int countByExample(TbUserCollectedCommentExample example);

    int deleteByPrimaryKey(TbUserCollectedCommentKey key);

    int insert(TbUserCollectedCommentKey record);

    int insertSelective(TbUserCollectedCommentKey record);

    List<TbUserCollectedCommentKey> selectByExample(TbUserCollectedCommentExample example);

    int updateByExampleSelective(@Param("record") TbUserCollectedCommentKey record, @Param("example") TbUserCollectedCommentExample example);

    int updateByExample(@Param("record") TbUserCollectedCommentKey record, @Param("example") TbUserCollectedCommentExample example);
}
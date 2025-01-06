package com.example.demo.mapper;

import com.example.demo.model.TbUserLikedCommentExample;
import com.example.demo.model.TbUserLikedCommentKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbUserLikedCommentMapper {
    int countByExample(TbUserLikedCommentExample example);

    int deleteByPrimaryKey(TbUserLikedCommentKey key);

    int insert(TbUserLikedCommentKey record);

    int insertSelective(TbUserLikedCommentKey record);

    List<TbUserLikedCommentKey> selectByExample(TbUserLikedCommentExample example);

    int updateByExampleSelective(@Param("record") TbUserLikedCommentKey record, @Param("example") TbUserLikedCommentExample example);

    int updateByExample(@Param("record") TbUserLikedCommentKey record, @Param("example") TbUserLikedCommentExample example);
}
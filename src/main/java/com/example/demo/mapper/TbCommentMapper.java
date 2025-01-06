package com.example.demo.mapper;

import com.example.demo.model.TbComment;
import com.example.demo.model.TbCommentExample;
import java.util.List;

import com.example.demo.model.vo.CommentDetailVo;
import com.example.demo.model.vo.TbCommentVo;
import org.apache.ibatis.annotations.Param;

public interface TbCommentMapper {
    int countByExample(TbCommentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbComment record);

    int insertSelective(TbComment record);

    List<TbComment> selectByExample(TbCommentExample example);

    TbComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbComment record, @Param("example") TbCommentExample example);

    int updateByExample(@Param("record") TbComment record, @Param("example") TbCommentExample example);

    int updateByPrimaryKeySelective(TbComment record);

    int updateByPrimaryKey(TbComment record);

    List<CommentDetailVo> queryCommentList(String questionId);
}
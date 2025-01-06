package com.example.demo.service.impl;

import com.example.demo.mapper.TbCommentMapper;
import com.example.demo.mapper.TbQuestionMapper;
import com.example.demo.model.TbQuestion;
import com.example.demo.model.vo.CommentDetailVo;
import com.example.demo.model.vo.QuestionVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private TbQuestionMapper tbQuestionMapper;
    @Autowired
    private TbCommentMapper tbCommentMapper;

    @Override
    public TbQuestion test(String title) {
        return tbQuestionMapper.selectByPrimaryKey(title);
    }
    @Override
    public QuestionVo queryQuestion(String title) {
        return tbQuestionMapper.queryQuestion(title);
    }
    @Override
    public CommentDetailVo queryCommentDetail(String questionId) {
        CommentDetailVo vo = new CommentDetailVo();
        List<CommentDetailVo> commentVos =  tbCommentMapper.queryCommentList(questionId);
        Optional<CommentDetailVo> first = commentVos.stream().filter(t -> "0".equals(t.getReplyId())).findFirst();
        if(first.isPresent()){
            BeanUtils.copyProperties(first.get(),vo);
            this.setChildren(vo.getId(),commentVos,vo);
        }
        return vo;
    }

    /**
     * 递归设置子集评论
     * @param replyId
     * @param commentVos
     * @param vo
     */
 private void setChildren(Integer replyId,List<CommentDetailVo> commentVos,CommentDetailVo vo){
     List<CommentDetailVo> childrenList=  commentVos.stream().filter(t->t.getReplyId().equals(replyId.toString())).collect(Collectors.toList());
     if(!CollectionUtils.isEmpty(childrenList)){
         vo.setChildren(childrenList);
         for (CommentDetailVo commentDetailVo : childrenList) {
             this.setChildren(commentDetailVo.getId(),commentVos,commentDetailVo);
         }
     }
 };

}


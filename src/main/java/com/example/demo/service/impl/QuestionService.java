package com.example.demo.service.impl;

import com.example.demo.model.TbQuestion;
import com.example.demo.model.vo.CommentDetailVo;
import com.example.demo.model.vo.QuestionVo;

public interface QuestionService {
    TbQuestion test(String title);
    QuestionVo queryQuestion(String title);
    CommentDetailVo queryCommentDetail(String topic);


}

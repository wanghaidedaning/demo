package com.example.demo.model.vo;

import lombok.Data;

import java.util.List;


@Data
public class CommentDetailVo {
    private Integer id;
    private String comment;
    private String questionId;
    private String replyId;
    private String createTime;
    private String createUser;
    private int likedCount;
    private int collectedCount;
    private int repliedCount;
    private boolean likedFlag;
    private boolean collectedFlag;
    private List<CommentDetailVo> children;
}

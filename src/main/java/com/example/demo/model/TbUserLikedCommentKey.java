package com.example.demo.model;

import java.io.Serializable;

public class TbUserLikedCommentKey implements Serializable {
    private String username;

    private Integer commentId;

    private static final long serialVersionUID = 1L;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }
}
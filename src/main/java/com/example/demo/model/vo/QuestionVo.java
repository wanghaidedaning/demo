package com.example.demo.model.vo;

import com.example.demo.model.TbQuestion;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionVo extends TbQuestion {
    private String html;
    private String raw;
}

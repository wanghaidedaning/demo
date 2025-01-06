package com.example.demo.mapper;

import com.example.demo.model.TbTag;
import com.example.demo.model.TbTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTagMapper {
    int countByExample(TbTagExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbTag record);

    int insertSelective(TbTag record);

    List<TbTag> selectByExample(TbTagExample example);

    TbTag selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbTag record, @Param("example") TbTagExample example);

    int updateByExample(@Param("record") TbTag record, @Param("example") TbTagExample example);

    int updateByPrimaryKeySelective(TbTag record);

    int updateByPrimaryKey(TbTag record);
}
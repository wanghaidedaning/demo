package com.example.demo.mapper;

import com.example.demo.model.TbEditorData;
import com.example.demo.model.TbEditorDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbEditorDataMapper {
    int countByExample(TbEditorDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbEditorData record);

    int insertSelective(TbEditorData record);

    List<TbEditorData> selectByExampleWithBLOBs(TbEditorDataExample example);

    List<TbEditorData> selectByExample(TbEditorDataExample example);

    TbEditorData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbEditorData record, @Param("example") TbEditorDataExample example);

    int updateByExampleWithBLOBs(@Param("record") TbEditorData record, @Param("example") TbEditorDataExample example);

    int updateByExample(@Param("record") TbEditorData record, @Param("example") TbEditorDataExample example);

    int updateByPrimaryKeySelective(TbEditorData record);

    int updateByPrimaryKeyWithBLOBs(TbEditorData record);
}
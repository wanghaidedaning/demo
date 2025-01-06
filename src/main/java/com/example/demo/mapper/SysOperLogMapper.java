package com.example.demo.mapper;

import com.example.demo.model.SysOperLog;
import com.example.demo.model.SysOperLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOperLogMapper {
    int countByExample(SysOperLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysOperLog record);

    int insertSelective(SysOperLog record);

    List<SysOperLog> selectByExample(SysOperLogExample example);

    SysOperLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysOperLog record, @Param("example") SysOperLogExample example);

    int updateByExample(@Param("record") SysOperLog record, @Param("example") SysOperLogExample example);

    int updateByPrimaryKeySelective(SysOperLog record);

    int updateByPrimaryKey(SysOperLog record);
}
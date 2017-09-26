package com.lqm.home.mapper;

import com.lqm.home.po.Public;
import com.lqm.home.po.PublicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicMapper {
    int countByExample(PublicExample example);

    int deleteByExample(PublicExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Public record);

    int insertSelective(Public record);

    List<Public> selectByExample(PublicExample example);

    Public selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByExample(@Param("record") Public record, @Param("example") PublicExample example);

    int updateByPrimaryKeySelective(Public record);

    int updateByPrimaryKey(Public record);
}
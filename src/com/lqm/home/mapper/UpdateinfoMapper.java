package com.lqm.home.mapper;

import com.lqm.home.po.Updateinfo;
import com.lqm.home.po.UpdateinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpdateinfoMapper {
    int countByExample(UpdateinfoExample example);

    int deleteByExample(UpdateinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Updateinfo record);

    int insertSelective(Updateinfo record);

    List<Updateinfo> selectByExample(UpdateinfoExample example);

    Updateinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Updateinfo record, @Param("example") UpdateinfoExample example);

    int updateByExample(@Param("record") Updateinfo record, @Param("example") UpdateinfoExample example);

    int updateByPrimaryKeySelective(Updateinfo record);

    int updateByPrimaryKey(Updateinfo record);
}
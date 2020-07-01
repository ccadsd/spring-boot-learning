package com.ssm.springmvc.db.mapper;

import com.ssm.springmvc.db.entity.CmsHelpCategory;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CmsHelpCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CmsHelpCategory record);

    int insertSelective(CmsHelpCategory record);

    CmsHelpCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CmsHelpCategory record);

    int updateByPrimaryKey(CmsHelpCategory record);

    @Select("select * from cms_help_category where id=#{id}")
    @Results(id = "selectCategory",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "icon",property = "icon")
    })
    CmsHelpCategory selectCategory(Long id);
}
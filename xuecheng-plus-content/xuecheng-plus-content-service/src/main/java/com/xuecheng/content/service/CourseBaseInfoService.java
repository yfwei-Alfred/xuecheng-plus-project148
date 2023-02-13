package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author yfWei
 * @version 1.0
 * @description 课程基本信息管理业务接口
 * @date 2023/2/11 19:54
 */
public interface CourseBaseInfoService {
    PageResult<CourseBase> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     * @param companyId 机构id
     * @param dto 新增课程的信息
     * @return  新增后课程的信息：基本信息+营销信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto dto);
}

package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @author yfWei
 * @version 1.0
 * @description 该Dto类用于存放孩子节点
 * @date 2023/2/13 14:50
 */

@Data
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}

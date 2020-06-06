package com.example.demomybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 学生表
 * </p>
 *
 * @author 王小甜
 * @since 2020-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Student对象", description="学生表")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生id")
    @TableId(value = "s_id", type = IdType.AUTO)
    private Integer sId;

    @ApiModelProperty(value = "学生姓名")
    private String sName;

    @ApiModelProperty(value = "班级id")
    private Integer classId;


}

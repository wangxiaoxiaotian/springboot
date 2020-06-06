package com.example.demomybatisplus.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 王小甜
 * @since 2020-06-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Orders对象", description="")
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "下单用户id")
    private Integer userId;

    @ApiModelProperty(value = "订单号")
    private String number;

    @ApiModelProperty(value = "创建订单时间")
    private LocalDateTime createtime;

    @ApiModelProperty(value = "备注")
    private String note;


}

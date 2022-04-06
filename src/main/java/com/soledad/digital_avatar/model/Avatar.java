package com.soledad.digital_avatar.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("avatar")
public class Avatar implements Serializable {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id; // 化身ID
    private String name; // 化身名
    private String url; // 化身链接
    private String details; // 化身详情
    private String describe; // 化身备注
}

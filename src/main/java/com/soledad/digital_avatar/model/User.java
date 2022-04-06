package com.soledad.digital_avatar.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("user")
public class User implements Serializable {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id; // 用户ID
    private String name; // 昵称
    private String password; // 密码
    private Boolean gender; // 性别
    private String email; // 电子邮箱
    private String telephone; // 电话号码
    private String avatar; // 头像链接
}

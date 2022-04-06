package com.soledad.digital_avatar.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("photo")
public class Photo implements Serializable {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id; // 照片ID
    private String name; // 照片名
    private String url; // 照片链接
    private String describe; // 照片备注
}

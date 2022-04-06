package com.soledad.digital_avatar.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("photo_avatar")
public class Photo_avatar {
    @TableId(value = "photo_id", type = IdType.ASSIGN_ID)
    private Long photo_id; // 照片ID
    @TableId(value = "avatar_id", type = IdType.ASSIGN_ID)
    private Long avatar_id; // 化身ID
    private Timestamp create_time; // 创建时间
}

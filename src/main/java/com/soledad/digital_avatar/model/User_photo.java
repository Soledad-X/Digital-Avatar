package com.soledad.digital_avatar.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
@TableName("user_photo")
public class User_photo implements Serializable {
    @TableId(value = "user_id", type = IdType.ASSIGN_ID)
    private Long user_id; // 用户ID
    @TableId(value = "photo_id", type = IdType.ASSIGN_ID)
    private Long photo_id; // 照片ID
    private Timestamp upload_time; // 上传时间
    private Timestamp delete_time; // 删除时间
    private Boolean deleted; // 删除位
    private Boolean collected; // 收藏位
}

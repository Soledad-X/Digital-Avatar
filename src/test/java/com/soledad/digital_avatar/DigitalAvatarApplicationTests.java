package com.soledad.digital_avatar;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.soledad.digital_avatar.mapper.UserMapper;
import com.soledad.digital_avatar.model.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DigitalAvatarApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("Soledad-X");
        user.setPassword("123456");
        user.setEmail("286773916@qq.com");
        user.setTelephone("19921260737");
        int result = userMapper.insert(user);
        System.out.println(user);
    }
}

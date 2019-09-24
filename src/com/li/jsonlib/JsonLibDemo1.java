package com.li.jsonlib;

/**
 * @author 黎坤源
 * @description
 * @create 2019/9/24
 */

import com.li.entity.Student;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;

/**
 * jsonlib:解析器
 */
public class JsonLibDemo1 {
    /**
     * 解析简单的字符串
     */
    @Test
    public void test1() throws JSONException {
        String json = "{name:'小明',age:12}";

        JSONObject jsonObject = new JSONObject(json);
        String name = jsonObject.getString("name");
        int age = jsonObject.getInt("age");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        //封装成对象
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        System.out.println(stu);

    }
}

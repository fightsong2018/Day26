package com.li.fastjson;

/**
 * @author 黎坤源
 * @description
 * @create 2019/9/24
 */

import com.alibaba.fastjson.JSON;
import com.li.entity.Score;
import com.li.entity.Student;
import org.junit.Test;

import java.util.List;

/**
 * 将字符串解析成json对象
 */

public class FastJsonDemo1 {
    /**
     * 简单形式的json字符串
     */
    @Test
    public void test1(){
        String json = "{name:'小明',age:12}";
        Student student = JSON.parseObject(json, Student.class);
        System.out.println(student);
    }
    /**
     * 复杂形式的json格式字符串,解析成java对象
     */
    @Test
    public void test2(){
        //对象里面嵌套对象
        String json = "{name:'小明',age:12,score:{englishScore:23,mathScore:45}}";
        Student student = JSON.parseObject(json, Student.class);

        System.out.println(student);

    }
    /**
     * 数组格式json字符串转对象
     */
    @Test
    public  void test3(){
        //数组形式的json字符串
        String json = "[{englishScore:23,mathScore:45},{englishScore:100,mathScore:100}]";
        List<Score> scores = JSON.parseArray(json, Score.class);
       
    }
}

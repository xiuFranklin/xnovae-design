package com.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eeexi on 2019/7/30.
 */
public class TeamLeader {

    public void checkNumber() {
        // 老板获取到所有的课程
        List<Course> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Course());
        }
        System.out.println("在线课程数量是：" + list.size());
    }
}

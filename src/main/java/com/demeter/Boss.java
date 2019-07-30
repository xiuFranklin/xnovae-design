package com.demeter;

/**
 * Created by eeexi on 2019/7/30.
 *
 * 场景：老板给小组长下达指令，查询在线课程数量
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader) {
        // 对小组长下达检查指令
        teamLeader.checkNumber();
    }
}

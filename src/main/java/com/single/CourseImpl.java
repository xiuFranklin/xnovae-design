package com.single;

/**
 * Created by eeexi on 2019/7/29.
 *
 * 由具体的实现选择来组合实现哪些功能（也可以只实现其中一个），

 在接口级别上两个接口的职责是清晰的，隔离的。
 复杂度也降低了，可读性也变高了
 降低变更引起的风险，可维护性变高了
 一个接口的修改不影响另一个接口的功能
 */
public class CourseImpl implements ICourseContent, ICourseManager{
    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourrse() {

    }

    @Override
    public void refundCourse() {

    }
}

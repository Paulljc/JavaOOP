package model;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("王帅", "男", 21, 9527);
        System.out.println("姓名：" + student.getName() + " " + "性别：" + student.getSex() + " "
                + "年龄：" + student.getAge() + " " + "学号：" + student.getStuId());
    }
}

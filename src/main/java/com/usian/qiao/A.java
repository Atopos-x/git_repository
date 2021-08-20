package com.usian.qiao;

public class A {
    private Integer id;
    private String name;
    private String age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                ", name='" + "张三" + '\'' +
                ", age='" + "12" + '\'' +
                '}';
    }
}

package com.bjpowernode.domain;

public class Student {
    private String stuname;
    private String straddress;

    public Student(String stuname, String straddress) {
        this.stuname = stuname;
        this.straddress = straddress;
    }

    public Student() {
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public String getStraddress() {
        return straddress;
    }

    public void setStraddress(String straddress) {
        this.straddress = straddress;
    }
}

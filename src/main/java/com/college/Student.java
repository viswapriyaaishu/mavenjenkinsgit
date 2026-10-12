// Jenkins Poll SCM test

package com.college;

import org.apache.commons.lang3.StringUtils;

public class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return StringUtils.capitalize(name);
    }

    public String getSearchInfo() {
    return "Student search feature";
}
}
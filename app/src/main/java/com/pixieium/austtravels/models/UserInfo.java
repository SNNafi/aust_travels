package com.pixieium.austtravels.models;

import android.net.Uri;

import org.jetbrains.annotations.Nullable;

public class UserInfo {
    private String email;
    private String name;
    private String semester;
    private String department;
    private String universityId;
    private String userImage;

    public UserInfo() {
    }

    public UserInfo(String email, String name, String semester, String department, String universityId, String userImage) {
        this.email = email;
        this.name = name;
        this.semester = semester;
        this.department = department;
        this.universityId = universityId;
        this.userImage = userImage;
    }

    public UserInfo(String email, String userImage) {
        this.email = email;
        this.userImage = userImage;

    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
}

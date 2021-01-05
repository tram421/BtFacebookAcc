package com.tram.builderfacebook;

import android.os.Build;

public class AccFacbook {
    private String name, phone; //required
    private String  email, address, area;
    private Integer age;

    public AccFacbook(String name, String phone, String email, String address, String area, Integer age) {
        this.name = name; //required
        this.phone = phone;//required
        this.email = email;
        this.address = address;
        this.area = area;
        this.age = age;
    }

    public AccFacbook() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    static class Builder implements AccBuild{
        private String name, phone; //required
        private String  email, address, area;
        private Integer age;

        public Builder(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        @Override
        public AccBuild withEmail(String email) {
            this.email=email;
            return this;
        }

        @Override
        public AccBuild withAddress(String address) {
            this.address=address;
            return this;
        }

        @Override
        public AccBuild withAge(Integer age) {
            this.age=age;
            return this;
        }

        @Override
        public AccBuild withArea(String area) {
            this.area=area;
            return this;
        }

        @Override
        public AccFacbook Build() {
            return new AccFacbook(name,phone,email,address,area,age);
        }
    }
}

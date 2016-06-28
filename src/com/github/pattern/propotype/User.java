package com.github.pattern.propotype;

/**
 * 用户实体类
 * Created by JC on 2016-06-28.
 */
public class User implements Cloneable{


    public int age;
    public String name;
    public String phoneNum;
    public Address address;

    @Override
    protected Object clone(){
        User user = null;

        try {
            user = (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public String toString() {
        return "User: [ age = " + age + ", name = " + name + ", phoneNum = " + phoneNum + ", address = " + address + "]";
    }

    public static class Address {

        /**
         * 城市
         */
        public String city;
        /**
         * 区
         */
        public String district;
        /**
         * 街道
         */
        public String street;

        public Address(String city, String district, String street) {
            this.city = city;
            this.district = district;
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address [city = " + city + ", district = " + district + ", street = " + street + "]";
        }
    }

}



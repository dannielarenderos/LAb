package com.example.labo3_ejercicio.utils;

import android.os.Parcel;
import android.os.Parcelable;

public class info implements Parcelable {
    private static   String user,pass,email,gender;

    public info(String user, String pass ,String email,String gender) {
        this.user = user;
        this.pass = pass;
        this.email = email;
        this.gender = gender;

    }

    public static void setUser(String user) {
        info.user = user;
    }

    public static String getUser() {
        return user;
    }

    public static String getPass() {
        return pass;
    }

    public static void setPass(String pass) {
        info.pass = pass;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        info.email = email;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        info.gender = gender;
    }

    public static Creator<info> getCREATOR() {
        return CREATOR;
    }

    public info(Parcel in) {
        user = in.readString();
        pass = in.readString();
        email = in.readString();
        gender = in.readString();
    }


    public info (){

    }



    public static final Creator<info> CREATOR = new Creator<info>() {
        @Override
        public info createFromParcel(Parcel in) {
            return new info(in);
        }

        @Override
        public info[] newArray(int size) {
            return new info[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(user);
        dest.writeString(pass);
        dest.writeString(email);
        dest.writeString(gender);
    }
}

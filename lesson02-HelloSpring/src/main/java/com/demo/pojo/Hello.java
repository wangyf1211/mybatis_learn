package com.demo.pojo;

public class Hello {
    private String str;
    private String version;

    public Hello() {
    }

    public Hello(String str, String version) {
        this.str = str;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}

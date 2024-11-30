package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Integer> feesStructure;
    private Properties prop;

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Integer> getFeesStructure() {
        return feesStructure;
    }

    public void setFeesStructure(Map<String, Integer> feesStructure) {
        this.feesStructure = feesStructure;
    }

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feesStructure=" + feesStructure +
                ", prop=" + prop +
                '}';
    }
}

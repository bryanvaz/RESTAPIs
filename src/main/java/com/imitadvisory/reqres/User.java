package com.imitadvisory.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {
    @JsonProperty("id") private int id;
    @JsonProperty("first_name") private String first_name;
    @JsonProperty("last_name") private String last_name;
    @JsonProperty("avatar") private String avatar;

    // does not map to anything
    @JsonIgnore private boolean loaded = true;

    public int getID() {
        return id;
    }

    public void setName(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return first_name;
    }
    public String getLastName() {
        return last_name;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }
    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return first_name + " " + last_name + " (id: " + id + ")";
    }
}

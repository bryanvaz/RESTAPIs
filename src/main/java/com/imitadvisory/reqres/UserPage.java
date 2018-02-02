package com.imitadvisory.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserPage {
    @JsonProperty("page") private int page;
    @JsonProperty("per_page") private int per_page;
    @JsonProperty("total") private int total;
    @JsonProperty("total_pages") private int total_pages;
    @JsonProperty("data") private User data[];

    public int getPage() {
        return page;
    }
    public int getPerPage() {
        return per_page;
    }
    public int getTotal() {
        return total;
    }
    public int getTotalPages() {
        return total_pages;
    }

    public User[] getUsers() {
        return data;
    }

    @Override
    public String toString() {
        String heldUsers = "";
        for(int i = 0; i< data.length; i++) {
            heldUsers += "\n" + data[i].toString();
        }
        return page + " out of " + total_pages + " pages - displaying " + per_page + " per page" + heldUsers;
    }

}

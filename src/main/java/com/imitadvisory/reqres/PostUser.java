package com.imitadvisory.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUser {
    @JsonProperty("name") public String name;
    @JsonProperty("job") public String job;

    @Override
    public String toString(){
        return name + " (job: " + job + ")";
    }
}

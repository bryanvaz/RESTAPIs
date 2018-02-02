package com.imitadvisory.reqres;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostUserResponse {
    @JsonProperty("name") public String name;
    @JsonProperty("job") public String job;
    @JsonProperty("id") public int id;
    @JsonProperty("createdAt") public String createdAt;

    @Override
    public String toString(){
        return "Response - name " + " (job: " + job + ") - id: " + id + " created at: " + createdAt;
    }
}

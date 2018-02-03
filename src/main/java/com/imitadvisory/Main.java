package com.imitadvisory;

import com.imitadvisory.reqres.PostUser;
import com.imitadvisory.reqres.PostUserResponse;
import com.imitadvisory.reqres.UserPage;

public class Main {

    public static void main(String[] args) {

        String target_url = "https://reqres.in/api/users";

        UserPage page = Consumer.getUserPage(target_url);
        System.out.println(page);

        System.out.println("----------------------------------");

        PostUser pu = new PostUser();
        pu.name = "google";
        pu.job = "hunter";

        PostUserResponse pur = Consumer.createUser(pu,target_url);

        System.out.println(pur);
    }
}

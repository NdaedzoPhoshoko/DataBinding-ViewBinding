package com.example.databindingtester;

public class Client { //this class offers data for binding, its treated as a normal class

    String client_name;
    String client_age;

    public Client(String client_name, String client_age) {
        this.client_name = client_name;
        this.client_age = client_age;
    }

    public String getClient_name() {
        return client_name;
    }

    public void setClient_name(String client_name) {
        this.client_name = client_name;
    }

    public String getClient_age() {
        return client_age;
    }

    public void setClient_age(String client_age) {
        this.client_age = client_age;
    }
    //sinc we cannot bind integers, we will bind string representing the integer
}

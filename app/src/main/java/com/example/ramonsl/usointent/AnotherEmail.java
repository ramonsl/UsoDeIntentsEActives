package com.example.ramonsl.usointent;

import java.io.Serializable;

/**
 * Created by ramonsl on 21/03/2018.
 */

public class AnotherEmail implements Serializable {

    public String send;
    public String msg;
    public String assunto;

    public AnotherEmail(String send, String msg, String assunto) {
        this.send = send;
        this.msg = msg;
        this.assunto = assunto;
    }


    @Override
    public String toString() {
        return "AnotherEmail{" +
                "send='" + send + '\'' +
                ", msg='" + msg + '\'' +
                ", assunto='" + assunto + '\'' +
                '}';
    }
}

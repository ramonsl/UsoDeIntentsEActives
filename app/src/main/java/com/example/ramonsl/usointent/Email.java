package com.example.ramonsl.usointent;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ramonsl on 21/03/2018.
 */

public class Email implements Parcelable {
    public String send;
    public String msg;
    public String assunto;

    public Email(String send, String msg, String assunto) {
        this.send = send;
        this.msg = msg;
        this.assunto = assunto;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(send);
        dest.writeString(msg);
        dest.writeString(assunto);
        //dest.writeInt(assunto);

    }

    private Email(Parcel from) {
        this.send = from.readString();
        this.msg = from.readString();
        this.assunto = from.readString();
        //  this.assunto = from.readInt();
    }

    public static final Parcelable.Creator<Email> CREATOR = new Parcelable.Creator<Email>() {
        public Email createFromParcel(Parcel in) {
            return new Email(in);
        }

        public Email[] newArray(int size) {
            return new Email[size];
        }

    };

    @Override
    public String toString() {
        return "Email{" +
                "send='" + send + '\'' +
                ", msg='" + msg + '\'' +
                ", assunto='" + assunto + '\'' +
                '}';
    }
}

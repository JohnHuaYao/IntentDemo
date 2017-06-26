package com.yao.john.intentdemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2017-06-26.
 */

public class Book implements Parcelable {
    private String bookName;
    private String author;
    private int publishTime;

    protected Book(Parcel in) {
        bookName = in.readString();
        author = in.readString();
        publishTime = in.readInt();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(int publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(bookName);
        dest.writeString(author);
        dest.writeInt(publishTime);
    }
}

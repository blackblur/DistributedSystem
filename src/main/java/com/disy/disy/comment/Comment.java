package com.disy.disy.comment;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Kamui on 30.12.2017.
 */
@Entity
public class Comment {

    @Id
    @GeneratedValue
    private int id;
    private String text;

    public Comment(String text) {
        super();
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

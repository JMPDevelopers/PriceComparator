package com.jmpdev.pojo;

/**
 * Created by HP on 2016-01-29.
 */
public final class ErrorCodes {

    public static final int WRONG_EMAIL_PASSWORD_ERROR = 400;

    private ErrorCodes() {
        throw new IllegalAccessError();
    }
}
package com.jmpdev.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.security.core.userdetails.User;

/**
 * Created by HP on 2016-01-29.
 */
public class Response {
    public static final int CODE_SUCCESS = 200;
    public static final String STATUS_FAIL = "FAIL";
    public static final String STATUS_SUCCESS = "OK";

    @JsonProperty
    private String status;
    @JsonProperty
    private int statusCode;
    @JsonProperty
    private Object data;
    @JsonProperty
    private String errorMessage;

    public static Response newSuccessResponse() {
        return newSuccessResponse(null);
    }

    public static Response newSuccessResponse(Object data) {
        Response response = new Response();
        response.data = data;
        response.status = STATUS_SUCCESS;
        response.statusCode = CODE_SUCCESS;

        return response;
    }

    public static Response newErrorResponse(int code, String message) {
        Response response = new Response();
        response.data = null;
        response.status = STATUS_FAIL;
        response.statusCode = code;
        response.errorMessage = message;

        return response;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", statusCode=" + statusCode +
                ", data=" + data +
                ", message='" + errorMessage + '\'' +
                '}';
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

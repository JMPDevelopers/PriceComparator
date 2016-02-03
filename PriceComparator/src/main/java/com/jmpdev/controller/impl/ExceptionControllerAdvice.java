package com.jmpdev.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.ControllerAdvice;

/**
 * Created by HP on 2016-01-31.
 */
@ControllerAdvice
public class ExceptionControllerAdvice {

    @Autowired
    private MessageSource errorMessageSource;

//    @ResponseStatus(HttpStatus.OK)
//    @ExceptionHandler(EmailVerificationException.class)
//    @ResponseBody
//    public Response handleEmailVerificationException(Exception e) {
//        return Response.newErrorResponse(ErrorCodes.EMAIL_VERIFICATION_ERROR, e.getMessage());
//    }

}

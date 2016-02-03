package com.jmpdev.controller.impl;

import com.jmpdev.controller.ControllerBase;
import com.jmpdev.domain.User;
import com.jmpdev.pojo.Response;
import com.jmpdev.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jacek on 10.01.16.
 */
@RestController
public class AuthenticationController implements ControllerBase {

    //private final Logger LOGGER = LogManager.getLogger(AuthenticationController.class);

    @Autowired
    private AuthService authService;

    @RequestMapping(value = ControllerBase.MAPPING_AUTH,
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response handleAuthentication(@RequestBody User user) {
        authService.register(user);
        return Response.newSuccessResponse();
    }

    @RequestMapping(value = ControllerBase.MAPPING_SIGNUP,
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response handleRegistration(@RequestBody User user) {
        authService.register(user);
        return Response.newSuccessResponse();
    }

    @RequestMapping(value = ControllerBase.MAPPING_LOGIN,
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response handleLogin(@RequestBody User user) {

        return Response.newSuccessResponse();
    }

}


package com.jmpdev.controller;

/**
 * Created by HP on 2016-01-27.
 */
public interface ControllerBase {
    //Authentication
    String MAPPING_AUTH = "/auth";
    String MAPPING_SIGNUP = MAPPING_AUTH + "/signup";
    String MAPPING_LOGIN = MAPPING_AUTH + "/login";
    String MAPPING_LOGOUT = MAPPING_AUTH + "/logout";

    String MAPPING_AUTH_ALL = MAPPING_AUTH + "/*";

    //User management
    String MAPPING_USER = "/user";
    String MAPPING_USER_ADD = MAPPING_USER + "/add";
    String MAPPING_USER_UPDATE = MAPPING_USER + "/update";
    String MAPPING_USER_ENABLE = MAPPING_USER + "/enable";
    String MAPPING_USER_DISABLE = MAPPING_USER + "/disable";

}

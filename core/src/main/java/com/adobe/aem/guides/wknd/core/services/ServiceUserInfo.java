package com.adobe.aem.guides.wknd.core.services;
public interface ServiceUserInfo {
    String addUser(String fname, String lname, String password, String confpassword) throws Exception;
}

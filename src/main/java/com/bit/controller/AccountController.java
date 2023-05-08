package com.bit.controller;

import com.bit.service.AccountSelectServiceImpl;
import com.bit.service.MultiSelectServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Hashtable;

public class AccountController implements ProcessController {

    private String path;
    private boolean redirect;

    public AccountController(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    @Override
    public ForWardController execute(HttpServletRequest request, HttpServletResponse response) {

        String userId = request.getParameter("userId");
        String userPw = request.getParameter("userPw");

        Hashtable<String, Object> map=new Hashtable<String, Object>();
        map.put("userId", userId);
        map.put("userPw", userPw);

        request.setAttribute("userDetail",
                AccountSelectServiceImpl
                        .getAccountSelectService()
                        .selectBitMemberByIdAndPw(map));

        return new ForWardController(path, redirect);
    }
}
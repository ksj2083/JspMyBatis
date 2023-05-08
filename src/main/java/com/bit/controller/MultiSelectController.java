package com.bit.controller;

import com.bit.service.MultiSelectService;
import com.bit.service.MultiSelectServiceImp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Hashtable;

public class MultiSelectController implements ProcessController {

    private String path;
    private boolean redirect;

    public MultiSelectController(String path, boolean redirect) {
        this.path = path;
        this.redirect = redirect;
    }

    @Override
    public ForWardController execute(HttpServletRequest request, HttpServletResponse response) {
        // TODO Auto-generated method stub
        String table=request.getParameter("t");
        Hashtable<String, Object> map=new Hashtable<String, Object>();
        map.put("table", table);

        request.setAttribute("list", MultiSelectServiceImp.getMultiSelectService().selectEmp(map));

        return new ForWardController(path, redirect);
    }
}
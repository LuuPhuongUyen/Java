/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author PC
 */
public class HelloActionSupport extends ActionSupport {

    public HelloActionSupport() {
    }

    @Override
    public String execute() throws Exception {
        return "success";
    }

    public String hienthi() {
        return "success";
    }
}

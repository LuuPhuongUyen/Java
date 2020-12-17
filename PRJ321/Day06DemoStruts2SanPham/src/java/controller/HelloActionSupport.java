/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;

/**
 *
 * @author PC
 */
public class HelloActionSupport extends ActionSupport {

    private SanPham sp = new SanPham();
    private List<SanPham> ls = new ArrayList<>();

    public SanPham getSp() {
        return sp;
    }

    public void setSp(SanPham sp) {
        this.sp = sp;
    }

    public List<SanPham> getLs() {
        return ls;
    }

    public void setLs(List<SanPham> ls) {
        this.ls = ls;
    }

    public HelloActionSupport() {
    }

    @Override
    public String execute() throws Exception {
        this.sp = new SanPham("S001", "San pham 1", 1000);
        return "success";
    }

    public String hienthi() {
        this.ls.add(new SanPham("S001", "San pham 1", 1000));
        this.ls.add(new SanPham("S002", "San pham 2", 2000));
        this.ls.add(new SanPham("S003", "San pham 3", 3000));
        return "success";
    }
}

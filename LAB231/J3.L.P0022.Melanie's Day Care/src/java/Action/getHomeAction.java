/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.HomeDAO;
import DAO.InfoDAO;
import Model.Home;
import Model.Info;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getHomeAction {

    Home h;
    private int id;
    private String title;
    private String content;
    private ArrayList<Info> lsInfo = new ArrayList<>();

    public getHomeAction() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Home getH() {
        return h;
    }

    public void setH(Home h) {
        this.h = h;
    }

    public ArrayList<Info> getLsInfo() {
        return lsInfo;
    }

    public void setLsInfo(ArrayList<Info> lsInfo) {
        this.lsInfo = lsInfo;
    }

    public String execute() throws Exception {
        HomeDAO hdao = new HomeDAO();
        h = hdao.getHome();
        InfoDAO idao = new InfoDAO();
        lsInfo = idao.getInfo();
        return "success";
    }

}

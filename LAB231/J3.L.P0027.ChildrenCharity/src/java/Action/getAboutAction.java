/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.AboutDAO;
import Model.About;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getAboutAction {

    private String title;
    private String content;
    private String imgSrc;
    private ArrayList<About> lsInfo = new ArrayList<>();

    public getAboutAction() {
    }

    public getAboutAction(String title, String content, String imgSrc) {
        this.title = title;
        this.content = content;
        this.imgSrc = imgSrc;
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

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public ArrayList<About> getLsInfo() {
        return lsInfo;
    }

    public void setLsInfo(ArrayList<About> lsInfo) {
        this.lsInfo = lsInfo;
    }

    public String execute() throws Exception {
        AboutDAO adao = new AboutDAO();
        lsInfo = adao.getAboutPage();
        return "success";
    }

}

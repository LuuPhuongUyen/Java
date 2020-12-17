/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.HelpDAO;
import Model.Help;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getHelpAction {
    private String title;
    private String content;
    private String imgSrc;
    private ArrayList<Help> lsInfo = new  ArrayList<>();
    public getHelpAction() {
    }

    public getHelpAction(String title, String content, String imgSrc) {
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

    public ArrayList<Help> getLsInfo() {
        return lsInfo;
    }

    public void setLsInfo(ArrayList<Help> lsInfo) {
        this.lsInfo = lsInfo;
    }
    
    public String execute() throws Exception {
        HelpDAO hdao = new HelpDAO();
        lsInfo = hdao.getHelpPage();
        return "success";
    }
    
}

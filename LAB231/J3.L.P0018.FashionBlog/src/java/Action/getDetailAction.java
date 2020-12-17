/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.entity.Home;
import com.model.HomeModel;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getDetailAction {
     private int id;
    private String type;
    private String title;
    private String imgLink;
    private String content;
    private String createDate;
    private Home home ;
    public getDetailAction() {
    }

    public getDetailAction(int id, String type, String title, String imgLink, String content, String createDate, Home home) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.imgLink = imgLink;
        this.content = content;
        this.createDate = createDate;
        this.home = home;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }
    
    public String execute() throws Exception {
        HomeModel hmodel = new HomeModel();
        home = hmodel.getDetailsPost(id);
        return"success";
        
    }
    
}

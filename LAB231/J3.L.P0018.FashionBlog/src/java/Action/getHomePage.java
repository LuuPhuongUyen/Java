/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.entity.Home;
import com.model.HomeModel;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getHomePage {

    ArrayList<Home> lsHome = new ArrayList<>();
    private int id;
    private String type;
    private String title;
    private String imgLink;
    private String content;
    private String createDate;
    private int like;
    private int comment;
    private String titleGroup;

    public getHomePage(int id, String type, String title, String imgLink, String content, String createDate, int like, int comment, String titleGroup) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.imgLink = imgLink;
        this.content = content;
        this.createDate = createDate;
        this.like = like;
        this.comment = comment;
        this.titleGroup = titleGroup;
    }
    
    public getHomePage() {
    }

    public getHomePage(int id, String type, String title, String imgLink, String content, String createDate) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.imgLink = imgLink;
        this.content = content;
        this.createDate = createDate;
    }

    public ArrayList<Home> getLsHome() {
        return lsHome;
    }

    public void setLsHome(ArrayList<Home> lsHome) {
        this.lsHome = lsHome;
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

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public String getTitleGroup() {
        return titleGroup;
    }

    public void setTitleGroup(String titleGroup) {
        this.titleGroup = titleGroup;
    }

    public String execute() throws Exception {
       HomeModel home = new HomeModel();
       lsHome = home.getPost(1, 4);
       return "success";
    }

}

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
public class getOverviewAction {
    private int id;
    private String title;
    private String createDate;
    private int like;
    private int comment;
    private String titleGroup;
    ArrayList<Home> lsOverview = new ArrayList<>();
    public getOverviewAction() {
    }

    public getOverviewAction(int id, String title, String createDate, int like, int comment, String titleGroup) {
        this.id = id;
        this.title = title;
        this.createDate = createDate;
        this.like = like;
        this.comment = comment;
        this.titleGroup = titleGroup;
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

    public ArrayList<Home> getLsOverview() {
        return lsOverview;
    }

    public void setLsOverview(ArrayList<Home> lsOverview) {
        this.lsOverview = lsOverview;
    }
    
    public String execute() throws Exception {
        HomeModel model = new HomeModel();
        lsOverview = model.getPost(1, 4);
        return "success";
    }
    
}

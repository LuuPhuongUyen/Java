/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Blog;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class WeddingBlogAction {

    public ArrayList<Blog> listAllBlog;
    private int id;
    private String title;
    private String content;
    private String imgSource;
    private Date dateAdded;
    private int type;

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

    public String getImgSource() {
        return imgSource;
    }

    public void setImgSource(String imgSource) {
        this.imgSource = imgSource;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public WeddingBlogAction() {
    }

    public ArrayList<Blog> getListAllBlog() {
        return listAllBlog;
    }

    public void setListAllBlog(ArrayList<Blog> listAllBlog) {
        this.listAllBlog = listAllBlog;
    }

    public String execute() throws Exception {
        Blog b = new Blog();
        listAllBlog = b.getAllBlog();
        return "success";
    }
}

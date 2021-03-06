/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Luu Phuong Uyen
 */
public class Home {

    private int id;
    private String title;
    private String content;
    private String imgSrc;


    public Home() {
    }
     public Home(int id, String title, String content, String imgSrc) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imgSrc = imgSrc;
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

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Override
    public String toString() {
        return "Home{" + "id=" + id + ", title=" + title + ", content=" + content + ", imgSrc=" + imgSrc + '}';
    }
    
    
}

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
public class About {

    private String title;
    private String content;
    private String imgSrc;

    public About() {
    }

    public About(String title, String content, String imgSrc) {
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

    @Override
    public String toString() {
        return "About{" + "title=" + title + ", content=" + content + ", imgSrc=" + imgSrc + '}';
    }
    
}

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

    private String content;
    private String imgSrc;

    public Home() {
    }

    public Home(String content, String imgSrc) {
        this.content = content;
        this.imgSrc = imgSrc;
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
        return "Home{"+"content=" + content + ", imgSrc=" + imgSrc + '}';
    }
}

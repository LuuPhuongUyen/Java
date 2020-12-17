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
public class PhotoAlbum {

    private int id;
    private String imgSrc;

    public PhotoAlbum() {
    }

    public PhotoAlbum(int id, String imgSrc) {
        this.id = id;
        this.imgSrc = imgSrc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    @Override
    public String toString() {
        return "PhotoAlbum{" + "id=" + id + ", imgSrc=" + imgSrc + '}';
    }
}

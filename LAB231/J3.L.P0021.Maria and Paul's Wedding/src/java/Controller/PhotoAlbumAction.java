/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Photos;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class PhotoAlbumAction {
    
    private ArrayList<Photos> lsPhotos = new ArrayList<>();
    private String photo;

    public PhotoAlbumAction() {
    }

    public ArrayList<Photos> getLsPhotos() {
        return lsPhotos;
    }

    public void setLsPhotos(ArrayList<Photos> lsPhotos) {
        this.lsPhotos = lsPhotos;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public String execute() throws Exception {
        Photos pt = new Photos();
        lsPhotos = pt.getAllPhoto();
        System.out.println(lsPhotos);
        return "success";
    }
}

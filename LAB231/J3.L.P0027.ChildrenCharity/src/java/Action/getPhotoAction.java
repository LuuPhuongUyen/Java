/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.AlbumDAO;
import Model.PhotoAlbum;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getPhotoAction {

    private int id;
    private String imgSrc;
    private ArrayList<PhotoAlbum> lsPhoto = new ArrayList<>();

    public getPhotoAction() {
    }

    public getPhotoAction(int id, String imgSrc) {
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

    public ArrayList<PhotoAlbum> getLsPhoto() {
        return lsPhoto;
    }

    public void setLsPhoto(ArrayList<PhotoAlbum> lsPhoto) {
        this.lsPhoto = lsPhoto;
    }

    public String execute() throws Exception {
        AlbumDAO dao = new AlbumDAO();
        lsPhoto = dao.getImgSrc();
        return "success";
    }

}

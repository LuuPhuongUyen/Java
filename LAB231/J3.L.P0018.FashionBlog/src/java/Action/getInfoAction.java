/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import com.entity.Information;
import com.model.InfoModel;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getInfoAction {

    private int id;
    private String name;
    private int age;
    private String imgLink;
    private String content;
    private ArrayList<Information> infoList = new ArrayList<>();

    public getInfoAction() {
    }

    public getInfoAction(int id, String name, int age, String imgLink, String content) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.imgLink = imgLink;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public ArrayList<Information> getInfoList() {
        return infoList;
    }

    public void setInfoList(ArrayList<Information> infoList) {
        this.infoList = infoList;
    }
    
    public String execute() throws Exception {
       InfoModel in = new InfoModel();
       infoList = in.getInfoPage();
       return "success";
    }

}

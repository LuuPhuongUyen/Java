/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Action;

import DAO.HomeDAO;
import Model.Home;
import Model.LatestNews;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Luu Phuong Uyen
 */
public class getHomeAction {

    private int id;
    private String title;
    private String content;
    private String imgSrc;
    //== News
    private int idNews;
    private String titNews;
    private Date dateAdd;
    private String contentNews;
    
    private ArrayList<Home> lsHome = new ArrayList<>();
    private ArrayList<LatestNews> lsNews = new ArrayList<>();

    public getHomeAction() {
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

    public int getIdNews() {
        return idNews;
    }

    public void setIdNews(int idNews) {
        this.idNews = idNews;
    }

    public String getTitNews() {
        return titNews;
    }

    public void setTitNews(String titNews) {
        this.titNews = titNews;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public String getContentNews() {
        return contentNews;
    }

    public void setContentNews(String contentNews) {
        this.contentNews = contentNews;
    }

    public ArrayList<Home> getLsHome() {
        return lsHome;
    }

    public void setLsHome(ArrayList<Home> lsHome) {
        this.lsHome = lsHome;
    }

    public ArrayList<LatestNews> getLsNews() {
        return lsNews;
    }

    public void setLsNews(ArrayList<LatestNews> lsNews) {
        this.lsNews = lsNews;
    }

    public getHomeAction(int id, String title, String content, String imgSrc) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.imgSrc = imgSrc;
    }


    public String execute() throws Exception {
        HomeDAO hdao = new HomeDAO();
        lsNews = hdao.getNews();
        lsHome = hdao.getHome();
        return "success";
    }

}

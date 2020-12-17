/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Luu Phuong Uyen
 */
public class LatestNews {

    private int idNews;
    private String titNews;
    private Date dateAdd;
    private String contentNews;

    public LatestNews(int idNews, String titNews, Date dateAdd, String contentNews) {
        this.idNews = idNews;
        this.titNews = titNews;
        this.dateAdd = dateAdd;
        this.contentNews = contentNews;
    }

    public LatestNews() {
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

    @Override
    public String toString() {
        return "LatestNews{" + "idNews=" + idNews + ", titNews=" + titNews + ", dateAdd=" + dateAdd + ", contentNews=" + contentNews + '}';
    }

    

}

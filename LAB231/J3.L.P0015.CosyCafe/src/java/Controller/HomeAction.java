/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import model.Article;
import model.ArticleDB;

/**
 *
 * @author Luu Phuong Uyen
 */
public class HomeAction {

    ArrayList<Article> aList = new ArrayList<>();
    Article article;

    public ArrayList<Article> getaList() {
        return aList;
    }

    public void setaList(ArrayList<Article> aList) {
        this.aList = aList;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public HomeAction() {
    }

    public String execute() throws Exception {
        ArticleDB aDAO = new ArticleDB();
        aList = aDAO.getArticle(2, 2);
        article = aDAO.getArticleById(1);
        return "success";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import model.Article;
import model.ArticleDB;

/**
 *
 * @author Luu Phuong Uyen
 */
public class AboutAction {

    Article article;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public AboutAction() {
    }

    public String execute() throws Exception {
        ArticleDB aDB = new ArticleDB();
        article = aDB.getArticleById(5);
        System.out.println("Title: " + article.getTitle());
        return "success";
    }
}

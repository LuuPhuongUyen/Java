/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fud.struts2;

import com.opensymphony.xwork2.ActionSupport;
import edu.fud.DAO.bookDAO;
import edu.fud.model.Book;
import java.util.List;

/**
 *
 * @author PC
 */
public class AddNewBookAction extends ActionSupport {

    private String BookID;
    private String Title;
    private String Author;
    private String Publisher;
    private String Year;
    private String Category;
    private String Language;
    private String Preview;
    private String Picture;
    private String Content;
    private List<Book> bList;
    private String error;

    public AddNewBookAction() {
    }

    public String execute() throws Exception {
//        System.out.println(BookID + " " + Title + " " + Author + " " + Publisher + " " + Year + " " + Category + " " + Language + " " + Preview + " " + Picture + " " + Content);
        Book b = new Book(BookID, Title, Author, Publisher, Year, Category, Language, Preview, Picture, Content);
        bookDAO bDao = new bookDAO();
        if (bookDAO.getBook(BookID) != null) {
            error = "BookID existed!";
        }
//        String eYear = "Year must be numerical";
//        String eString = " Not empty.";
//       if (!Validation.checkYear(Year)) {
//            if (error != null) {
//                error += eYear;
//            } else {
//                error = eYear;
//            }
//        }
//        if (!Validation.checkString(BookID) || !Validation.checkString(Title) || !Validation.checkString(Author)
//                || !Validation.checkString(Year) || !Validation.checkString(Category) || !Validation.checkString(Language)
//                || !Validation.checkString(Preview) || !Validation.checkString(Picture) || !Validation.checkString(Content)) {
//            if (error != null) {
//                error += eString;
//            } else {
//                error = eString;
//            }
//        }
//        if (error != null) {
//            return "error";
//        }
        if (bDao.addNewBook(b)) {
            bList = bDao.getAllBook();
            return "success";
        }
        return "fail";
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getPreview() {
        return Preview;
    }

    public void setPreview(String Preview) {
        this.Preview = Preview;
    }

    public String getPicture() {
        return Picture;
    }

    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public List<Book> getbList() {
        return bList;
    }

    public void setbList(List<Book> bList) {
        this.bList = bList;
    }

    @Override
    public void validate() {
        String err = "Please enter all required field";
      
        if (!this.BookID.matches("B[0-9]{3}")) {
            addFieldError("BookID", "Wrong format BookID: B000");
        }
        if (bookDAO.getBook(BookID) != null) {
            addFieldError("BookID", "BookID existed!");
        }
        if (this.Title.length() == 0) {
            addFieldError("Title", err);
        }
        if (this.Author.length() == 0) {
            addFieldError("Author", err);
        }
        if (this.Publisher.length() == 0) {
            addFieldError("Publisher", err);
        }     
        if (!this.Year.matches("[0-9]{4}")) {
            addFieldError("Year", "Year must be numberical");
        }
        if (this.Category.length() == 0) {
            addFieldError("Category", err);
        }
         if (this.Language.length() == 0) {
            addFieldError("Language", err);
        }
        if (this.Preview.length() == 0) {
            addFieldError("Preview", err);
        }
        if (this.Picture.length() == 0) {
            addFieldError("Picture", err);
        }
        if (this.Content.length() == 0) {
            addFieldError("Content", err);
        }
    }
}

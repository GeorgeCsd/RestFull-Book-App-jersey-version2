package org.example;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
//@Table(name = "bookstbl")
@XmlRootElement//(name="book")
@NamedQuery(name=Book.FIND_ALL,query = "SELECT b FROM Book b")
public class Book {
    public static final String FIND_ALL="Book.findAll";

    @Id
    @GeneratedValue
    private String id;

    @Column(name="TITLE")
    private String title;

    @Column(name = "PRICE")
    private Float price;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "NBOFPAGE")
    private Integer nbOfPage;
    @Column(name = "ILLUSTRATIONS")
    private Boolean illustrations;
    public Book(){}
    public Book(String id) {
        this.id = id;
    }

    public Book(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Book(String id, String title, Float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public Book(String id, String title, Float price, String description) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public Book(String id, String title, Float price, String description, String isbn) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.isbn = isbn;
    }
    public Book(String id, String title, Float price, String description, Integer nbOfPage, Boolean illustrations) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }
    public Book(String id, String title, Float price, String description, String isbn, Integer nbOfPage, Boolean illustrations) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.isbn = isbn;
        this.nbOfPage = nbOfPage;
        this.illustrations = illustrations;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getIsbn() {
        return isbn;
    }

    public Integer getNbOfPage() {
        return nbOfPage;
    }

    public Boolean getIllustrations() {
        return illustrations;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNbOfPage(Integer nbOfPage) {
        this.nbOfPage = nbOfPage;
    }

    public void setIllustrations(Boolean illustrations) {
        this.illustrations = illustrations;
    }

    public String toString(){
        return "\n"+"Book has "+ " id:"+this.id+" description: "+this.description+" price:"+this.price+" illustrations:"+this.illustrations+" nbOfpage:"+this.nbOfPage+" isbn:"+this.isbn+"\n";
    }


}

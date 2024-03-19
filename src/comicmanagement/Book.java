/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comicmanagement;

/**
 *
 * @author Tam Pham
 */
public class Book {
    private int ID;
    private String Title;
    private Double Price;
    private int Volume;
    private String info;

    public Book() {
    }

    public Book(int ID, String Title, Double Price, int Volume, String info) {
        this.ID = ID;
        this.Title = Title;
        this.Price = Price;
        this.Volume = Volume;
        this.info = info;
    }
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
    @Override
    public String toString(){
        return "\n";
    }
}

import javafx.collections.ObservableList;

import java.util.Observable;

public interface rentABook {

    public void showRentals(String username);


    public void book(String title, String author);


    public void setTitle(String title);

    public void getTitle();

    public void setAuthor(String author);

    public void getAuthor();

    public void user(String userName, String password);


    public void setUserName(String username);

    public void setPassword(String password);

    public void getPassword();


    public void rentedBook(ObservableList rentedBook, String Username);

    public void setRentedBook(ObservableList rentedBook);

    public void getRentedBook(ObservableList rentedBook, String userName);
}

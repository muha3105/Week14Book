import javafx.collections.ObservableList;

import java.util.Observable;

public interface rentABook {

    void booksToRent(ObservableList allBooks, String userName, String password );

    public void addBookToRentList ();

}

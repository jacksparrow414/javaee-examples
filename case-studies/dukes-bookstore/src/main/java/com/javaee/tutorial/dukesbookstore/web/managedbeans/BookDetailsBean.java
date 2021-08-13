

package com.javaee.tutorial.dukesbookstore.web.managedbeans;

import java.io.Serializable;

import com.javaee.tutorial.dukesbookstore.entity.Book;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 * <p>Backing bean for the <code>/bookdetails.xhtml</code> page.</p>
 */
@Named("details")
@SessionScoped
public class BookDetailsBean extends AbstractBean implements Serializable {

    private static final long serialVersionUID = 2209748452115843974L;

    /**
     * <p>Add the displayed item to our shopping cart.</p>
     * @return the navigation page
     */
    public String add() {
        Book book = (Book) context().getExternalContext()
                .getSessionMap().get("selected");
        cart.add(book.getBookId(), book);
        message(null, "ConfirmAdd", new Object[]{book.getTitle()});

        return ("bookcatalog");
    }
}

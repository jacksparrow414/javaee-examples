package com.javaee.tutorial.addressbook.ejb;

import com.javaee.tutorial.addressbook.entity.Contact;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * 
 */
@Stateless
public class ContactFacade extends AbstractFacade<Contact> {
    /**
     * 加载持久层的EntityManager
     * 名字为persistence.xml中的name
     */
    @PersistenceContext(unitName = "address-bookPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ContactFacade() {
        super(Contact.class);
    }

}

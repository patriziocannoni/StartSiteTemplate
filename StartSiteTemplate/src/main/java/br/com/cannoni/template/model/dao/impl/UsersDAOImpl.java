package br.com.cannoni.template.model.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.cannoni.template.model.dao.UsersDAO;
import br.com.cannoni.template.model.entity.User;

/**
 * @author patrizio
 * @since 30/08/2017
 *
 */
@Repository("usersDAO")
@Transactional
public class UsersDAOImpl implements UsersDAO {
    
    private static final long serialVersionUID = 885201753370926650L;
    
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getUsers() {
        return sessionFactory.getCurrentSession().createQuery("from User u order by u.id").list();
    }
    
    @Override
    public void insertUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

}

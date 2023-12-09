/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.VendasBjf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author 
 */
public class VendasDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
}

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
     public void delete(Object object) {
       session.beginTransaction();
       session.flush();
       session.clear();
       session.delete(object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasBjf.class);
        criteria.add(Restrictions.eq("idusuariosBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
        
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VendasBjf.class);
         List lista = criteria.list();

        session.getTransaction().commit();        
        return lista;
        
        
    }
    public List listNome(String nome) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasBjf.class);
    criteria.createAlias("clienteBjf", "cliente"); 
    criteria.add(Restrictions.like("cliente.nomeBjf", "%" + nome + "%"));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

public List listValor(double valor) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasBjf.class);
    criteria.add(Restrictions.eq("valorTotalBjf", valor));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

public List listNomeValor(String nome, double valor) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(VendasBjf.class);
    criteria.createAlias("clienteBjf", "cliente");
    criteria.add(Restrictions.like("cliente.nomeBjf", "%" + nome + "%"));
    criteria.add(Restrictions.eq("valorTotalBjf", valor));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
    }
}


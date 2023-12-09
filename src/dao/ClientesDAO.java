/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import bean.ClienteBjf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author 
 * 
 */
public class ClientesDAO extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(ClienteBjf.class);
        criteria.add(Restrictions.eq("idClientesBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
        
    }

    @Override
     public ArrayList listAll() {
   session.beginTransaction();
    Criteria criteria = session.createCriteria(ClienteBjf.class);
    List lista = criteria.list();
    session.getTransaction().commit();
return (ArrayList) lista;
        
    }
    public List listNome(String nome){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteBjf.class);
        criteria.add(Restrictions.like("nomeBjf", nome, MatchMode.ANYWHERE));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listRg(String rg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteBjf.class);
        criteria.add(Restrictions.like("cpfBjf", "%" + rg + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeRg(String nome, String rg) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ClienteBjf.class);
        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpfBjf", "%" + rg + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
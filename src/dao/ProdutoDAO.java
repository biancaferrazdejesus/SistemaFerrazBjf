
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FuncionarioBjf;
import bean.ProdutoBjf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author duals
 */
public class ProdutoDAO extends DAO_Abstract{
    
     @Override
     public void insert(Object objeto) {
      session.beginTransaction();
      session.save(objeto);
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
        Criteria criteria = session.createCriteria(ProdutoBjf.class);
        criteria.add(Restrictions.eq("idprodutoBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0); 
    }
     @Override
     public ArrayList listAll() {
     session.beginTransaction();
     Criteria criteria = session.createCriteria(ProdutoBjf.class);
     List lista = criteria.list();
     session.getTransaction().commit();
     return (ArrayList) lista;
}
    public List listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoBjf.class);
        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listPreco(double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoBjf.class);
        criteria.add(Restrictions.eq("precoBjf", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
}
    public List listNomePreco(String nome, double preco) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoBjf.class);
        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
        criteria.add(Restrictions.eq("precoBjf", preco));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
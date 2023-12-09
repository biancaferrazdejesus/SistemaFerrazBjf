/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoVendasBjf;
import bean.VendasBjf;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author duals
 */
public class VendasProdutoDAO  extends DAO_Abstract{
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
        Criteria criteria = session.createCriteria(ProdutoVendasBjf.class);
        criteria.add(Restrictions.eq("idProdutovendasBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }

    @Override
    public List listAll() {
         session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoVendasBjf.class);
//        List lista = criteria.list();
        session.getTransaction().commit();  
        List lista = new ArrayList();
        return lista;
        
//        public List<VendasBjf> listAll() {
//    session.beginTransaction();
//    Criteria criteria = session.createCriteria(VendasBjf.class);
//    List<VendasBjf> lista = criteria.list();
//    session.getTransaction().commit(); 
//    return lista;
}
     public List listProduto(ProdutoVendasBjf produtovendasbjf){
       session.beginTransaction();
        Criteria criteria = session.createCriteria(ProdutoVendasBjf.class);
        criteria.add( Restrictions.eq("vendasBjf", produtovendasbjf));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     
}
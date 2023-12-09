/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.FuncionarioBjf;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author duals
 */
public class FuncionarioDAO extends DAO_Abstract{
    
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
        Criteria criteria = session.createCriteria(FuncionarioBjf.class);
        criteria.add(Restrictions.eq("idfuncionarioBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0); 
    }
     @Override
     public ArrayList listAll() {
     session.beginTransaction();
     Criteria criteria = session.createCriteria(FuncionarioBjf.class);
     List lista = criteria.list();
     session.getTransaction().commit();
     return (ArrayList) lista;
}
    
//    public List listNome(String nome) {
//        session.beginTransaction();
//        Criteria criteria = session.createCriteria(FuncionarioBjf.class);
//        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
//        List lista = criteria.list();
//        session.getTransaction().commit();
//        return lista;
//    }
//    public List listSalario(double salario) {
//        session.beginTransaction();
//        Criteria criteria = session.createCriteria(FuncionarioBjf.class);
//        criteria.add(Restrictions.eq("salarioBjf", salario));
//        List lista = criteria.list();
//        session.getTransaction().commit();
//        return lista;
//}
//    public List listNomeSalario(String nome, double salario) {
//        session.beginTransaction();
//        Criteria criteria = session.createCriteria(FuncionarioBjf.class);
//        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
//        criteria.add(Restrictions.eq("salarioBjf", salario));
//        List lista = criteria.list();
//        session.getTransaction().commit();
//        return lista;
//}
public List listarTodos() {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioBjf.class);
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

public List listNome(String nome) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioBjf.class);
    criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

//public List listSalario(double salario) {
//    session.beginTransaction();
//    Criteria criteria = session.createCriteria(FuncionarioBjf.class);
//    criteria.add(Restrictions.eq("salarioBjf", salario));
//    List lista = criteria.list();
//    session.getTransaction().commit();
//    return lista;
   public List listSalario(double salario) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioBjf.class);
    criteria.add(Restrictions.gt("salarioBjf", salario)); 
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}
public List listNomeSalario(String nome, double salario) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(FuncionarioBjf.class);
    if (nome.isEmpty()) {
        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
    }
    if (salario > 100) {
        criteria.add(Restrictions.eq("salarioBjf", salario));
    }
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

    public static void main(String[] args) {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        List lista = funcionarioDAO.listNome("nome que você está procurando");
        for (Object funcionarioBjf : lista) {
            System.out.println("nomeBjf:" + ((FuncionarioBjf)funcionarioBjf).getNomeBjf());
        }
    }
}

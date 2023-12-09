/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuariosBjf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10840155107
 */
public class UsuariosDAOBjf extends DAO_Abstract{

    @Override
     public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
         
//    try {
//        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        
//        session.save(objeto);
//        
//        transaction.commit();
//        session.close();
//    } catch (HibernateException ex) {
//        // Trate a exceção de acordo com suas necessidades
//        ex.printStackTrace();
//    }


}

//    try {
//        session.beginTransaction();
//        session.save(objeto);
//        session.getTransaction().commit();
//    } catch (HibernateException ex) {
//        session.getTransaction().rollback();
//        ex.printStackTrace(); // Trate a exceção de acordo com sua necessidade
//    } finally {
//        session.close();
//    }
//}

         
         
         
//      session.beginTransaction();
//      session.save(objeto);
//      session.getTransaction().commit();
//    try {
//        session.beginTransaction();
//        session.save(objeto);
//        session.getTransaction().commit();
//    } catch (HibernateException ex) {
//        session.getTransaction().rollback();
////        ex.printStackTrace(); // Trate a exceção de acordo com sua necessidade
//    } finally {
//        session.close();
//    
//}
     
//    UsuariosBjf usuariosBjf = (UsuariosBjf)object;
//        String url, user, password;
//         url = "jdbc:mysql://10.7.0.51:33062/db_bianca_ferraz";
//        user = "bianca_ferraz";
//        password = "bianca_ferraz";
////        url = "jdbc:mysql://127.0.0.1:3306/db_bianca_ferraz";
////          user = "root";
////        password = "";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection cnt;
////            cnt = DriverManager.getConnection(url, user, password);
//            Statement stm;
//            stm = cnt.createStatement();
//            String sql = "insert into usuario values(?, ?, ?, ?, ?, ?, ?, ?)";
//            //stm.executeUpdate(sql);
//            PreparedStatement pstm = cnt.prepareStatement(sql);
//            pstm.setInt(1, usuariosBjf.getIdusuariosBjf());
//            pstm.setString(2, usuariosBjf.getNomeBjf());
//            pstm.setString(3, usuariosBjf.getEmailBjf()t());
//            pstm.setString(4, usuariosBjf.getCpfBjf());
//            pstm.setDate(5, (java.sql.Date) new Date(2021, 1, 1));
//            pstm.setString(6, usuariosBjf.getSenhaBjf());
//            pstm.setInt(7, usuariosBjf.getSexoBjf());
//            pstm.setString(8, usuariosBjf.getAtivoBjf());
//            pstm.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Usuario_DAO.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Usuario_DAO.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    
     
     

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
        Criteria criteria = session.createCriteria(UsuariosBjf.class);
        criteria.add(Restrictions.eq("idusuariosBjf", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0); 
    }

    @Override
    public ArrayList listAll() {
   session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosBjf.class);
    List lista = criteria.list();
    session.getTransaction().commit();
return (ArrayList) lista;
}
    public List listNome(String nome){
    session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosBjf.class);
    criteria.add(Restrictions.like("nomeBjf", nome, MatchMode.ANYWHERE));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}
 
    public List listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosBjf.class);
        criteria.add(Restrictions.like("cpfBjf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(UsuariosBjf.class);
        criteria.add(Restrictions.like("nomeBjf", "%" + nome + "%"));
        criteria.add(Restrictions.like("cpfBjf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public static void main(String[] args) {
        UsuariosDAOBjf usuariosDAOBjf = new UsuariosDAOBjf();
        List lista = usuariosDAOBjf.listNome("nome que você está procurando");
        for (Object usuariosBjf : lista) {
            System.out.println("nome:" + ((UsuariosBjf)usuariosBjf).getNomeBjf());
        }
    }
    public UsuariosBjf login(String usuario, String senha) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(UsuariosBjf.class);
    criteria.add(Restrictions.eq("nomeBjf", usuario));
    criteria.add(Restrictions.eq("senhaBjf", senha));
    UsuariosBjf usuarioAutenticado = (UsuariosBjf) criteria.uniqueResult();
    session.getTransaction().commit();
    return usuarioAutenticado;
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entities.Data;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author martin
 */
public class DataModel {
    
    public Data getDtx(int id) {

        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Data dtx = new Data();

        try {
            s.beginTransaction();
            dtx = (Data) s.get(Data.class, id);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
            s.getTransaction().rollback();
        }

        return dtx;
    }
    
    @RequestMapping()
    public List<Data> getAll() {
        List<Data> lst = new ArrayList<Data>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Data.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lst;
    }
}

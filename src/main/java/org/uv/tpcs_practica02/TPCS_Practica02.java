/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.tpcs_practica02;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author anton
 */
public class TPCS_Practica02 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
        
        Empleado emp = new Empleado();
        emp.setNombre("Pepe");
        emp.setDireccion("Av 3");
        emp.setTelefono("3333");
        
        Session session=sessionFactory.openSession();
        Transaction t=session.beginTransaction();
        
        session.save(emp);
        
        t.commit();
        session.close();
    }
}

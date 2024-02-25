package config;

import entity.Customer;
import entity.Item;
import entity.Order;
import entity.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {

    private static SessionFactoryConfig factoryConfig;

    private final SessionFactory sessionFactory;

    private SessionFactoryConfig() {
        // 3. Create a Session Factory
        sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(OrderDetail.class)
                .buildSessionFactory();
    }


    public static SessionFactoryConfig getInstance() {
        return (null == factoryConfig)
                ? factoryConfig = new SessionFactoryConfig()
                : factoryConfig;
    }

    public Session getSession() {
        // Creates and open the session
        return sessionFactory.openSession();
    }

}

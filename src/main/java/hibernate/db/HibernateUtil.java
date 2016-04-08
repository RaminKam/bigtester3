package hibernate.db;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;
 
public class HibernateUtil {
    private static final SessionFactory sessionFactory 
                                = configureSessionFactory();
    private static ServiceRegistry serviceRegistry;
 
    /**
     * �������� �������
     * @return {@link SessionFactory}
     * @throws HibernateException
     */
    private static SessionFactory configureSessionFactory()
            throws HibernateException {
    	SessionFactory sf =null;
    	try{
    	File file = new File("C:\\MavenProjects\\bigtester3\\hibernate.cfg.xml");
    	Configuration configuration = new Configuration().configure(file);
    	sf = configuration.buildSessionFactory();
    	
    	}catch(Exception ex){
    		System.out.println(ex);
    		System.exit(0);
    	}
    	return sf;
    }
 
    /**
     * �������� ������� ������
     * @return {@link SessionFactory}
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
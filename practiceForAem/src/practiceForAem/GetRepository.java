package practiceForAem;

import javax.jcr.AccessDeniedException;
import javax.jcr.InvalidItemStateException;
import javax.jcr.ItemExistsException;
import javax.jcr.ReferentialIntegrityException;
import javax.jcr.Repository;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import javax.jcr.lock.LockException;
import javax.jcr.nodetype.ConstraintViolationException;
import javax.jcr.nodetype.NoSuchNodeTypeException;
import javax.jcr.version.VersionException;

import org.apache.jackrabbit.commons.JcrUtils;

public class GetRepository{
	private static Session session;
	public static Session getRepository(String url,String id, String password){
		try{
			//Create a connection to the CQ repository running on local host 
		    Repository repository = JcrUtils.getRepository(url);
		   
		   //Create a Session
		   session = repository.login( new SimpleCredentials(id, password.toCharArray())); 
		   System.out.println("############session start!!############");
		}catch(Exception e){
			e.printStackTrace();
		}
		return session;
	}
	public static void sessionOut(Session session){
		
			//session.save();
		session.logout();
		System.out.println("############session out!!############");
	}
	
	
}

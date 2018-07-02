package practiceForAem;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

import org.apache.poi.util.SystemOutLogger;

public class NodeAction {
	
	public void insertNode(Session session, String path){
		System.out.println("############insertNode Start!!############");
		try {
			Node root = session.getRootNode();
			String[] pathArray = path.split("/");
			String aPath = "";
			for(int i = 0; i<pathArray.length; i++){
				aPath += pathArray[i]+"/";
				System.out.println(aPath);
				if(!root.hasNode(aPath)){
					root.addNode(aPath);					
					System.out.println(aPath+" node has been added!!!");
				}else{
					System.out.println(aPath+" node exist already!!");
				}
			}
			session.save();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("############insertNode end!!############");
	}
	
	public void insertNode(Session session, String path, String primaryType){
		System.out.println("############insertNode Start!!############");
		try {
			Node root = session.getRootNode();
			String[] pathArray = path.split("/");
			String aPath = "";
			for(int i = 0; i<pathArray.length; i++){
				aPath += pathArray[i]+"/";
				System.out.println(aPath);
				if(!root.hasNode(aPath)){
					root.addNode(aPath, primaryType);					
					System.out.println(aPath+" node has been added!!!");
				}else{
					System.out.println(aPath+" node exist already!!");
				}
			}
			session.save();
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("############insertNode end!!############");
	}
	
}

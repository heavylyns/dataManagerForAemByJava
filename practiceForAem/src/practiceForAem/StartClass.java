package practiceForAem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.query.Query;
import javax.jcr.query.QueryManager;


public class StartClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Session session = GetRepository.getRepository("http://localhost:4502/crx/server", "admin", "admin");
		
		//nodeadd
//		NodeAction node = new NodeAction();
////		node.insertNode(session, "testRootNode/componentNode");
//		node.insertNode(session, "testRootNode/componentNode2", "cq:Component");
		
//		//node list
//		getNodeInfo nodeInfo = new getNodeInfo();
//		List<String> nodeList = nodeInfo.getNodeList(session, "adobe");
//	    for(int i = 0; i < nodeList.size(); i++){
//	    	String nodeName = nodeList.get(i);
//	    	System.out.println(nodeName);
//	    }
		
		
//		GetRepository.sessionOut(session);
		for(int i = 0; i< 10; i++){
			SimpleDateFormat sdfDate = new SimpleDateFormat("yyMMddHHmmss.SSS");//dd/MM/yyyy
		    Date now = new Date();
		    String strDate = sdfDate.format(now);
		    
		    	
		    
		    System.out.println(strDate);
		}
	}


}

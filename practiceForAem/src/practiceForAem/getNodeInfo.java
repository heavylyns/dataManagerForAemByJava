package practiceForAem;

import java.util.ArrayList;
import java.util.List;

import javax.jcr.Node;
import javax.jcr.NodeIterator;
import javax.jcr.RepositoryException;
import javax.jcr.Session;

public class getNodeInfo {
	public List<String> getNodeList(Session session, String path){
		List<String> nodeList = new ArrayList<>();
		try {
			Node root = session.getRootNode();
			Node pathNode = root.getNode(path);
			NodeIterator nodeIterator = pathNode.getNodes();
			while (nodeIterator.hasNext()) {
				Node node = (Node) nodeIterator.next();
				String nodePath = node.getName();
				nodeList.add(nodePath);
			}
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nodeList;
	}
}

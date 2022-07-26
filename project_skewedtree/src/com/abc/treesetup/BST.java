package com.abc.treesetup;

import java.util.List;

import com.abc.node.*;

public class BST 
{
	public Node insert(Node node, int val) 
	{
	    if(node == null) 
	         {
	          return createNewNode(val);
	         }
	    
	    if(val < node.data) 
	        {
	      node.left = insert(node.left, val);
	        } else if((val > node.data)) 
	        {
	      node.right = insert(node.right, val);
	        }
	    
	    return node;
	 }
	  
	  public Node createNewNode(int k) 
	  {
	    Node a = new Node();
	    a.data = k;
	    a.left = null;
	    a.right = null;
	    return a;
	  }
	  
	  public void inorder(Node node, List<Integer> sortedlist)
	  {
		    if(node == null) 
		    {
		      return;
		    }
		    
		    inorder(node.left, sortedlist);
		    
		    sortedlist.add(node.data);
		    
		    inorder(node.right, sortedlist);
	  }
		  


}

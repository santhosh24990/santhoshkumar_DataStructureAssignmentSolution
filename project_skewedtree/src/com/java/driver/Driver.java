package com.java.driver;
import java.util.ArrayList;
import java.util.List;

import com.abc.node.*;
import com.abc.treesetup.*;
import com.abc.display.*;


public class Driver 
{

	  public static void main(String[] args) 
	  {
	    BST createtree = new BST();
	    Node root = null;
	    
	    root = createtree.insert(root, 50);
	    root = createtree.insert(root, 30);
	    root = createtree.insert(root, 60);
	    root = createtree.insert(root, 10);
	    root = createtree.insert(root, 55);
       List<Integer> sortedlist = new ArrayList<>();
	    
       createtree.inorder(root, sortedlist);
	  
	    root= null;
	         for(int i=0;i<sortedlist.size();i++)
	      {
		      root=createtree.insert(root,sortedlist.get(i));
	      }
	  Display dispayobject = new Display();
	  System.out.println("the right skewed tree");
	  dispayobject.traverseRightSkewed(root);
	  }
 }
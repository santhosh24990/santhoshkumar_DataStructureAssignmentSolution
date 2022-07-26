package com.abc.display;
import com.abc.node.*;
public class Display
{
	  public static void traverseRightSkewed(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        System.out.print(root.data + " ");
	        traverseRightSkewed(root.right);       
	    }
	   

}

package com.eimacs.imgprocessor;

import com.eimacs.digest.UserInfoDialog;

/**
 *
 * @author IMACS Curriculum Development Group
 * @version 2.0 March 05, 2015
 */
public class Lab06Runner {
	public static int checkIndex = 2;

	public static void main(String[] args) { 
		Picture pix = new Picture("beach.jpg"); 
		pix.explore();
	}
}

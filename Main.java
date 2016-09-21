package net.ukr.geka3;

import java.io.File;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class [] blackList = {Scanner.class, File.class, Double.class};
		
		BlackList classBlackList = new BlackList(blackList);
		
		
		
		Steak st = new Steak(classBlackList);
		st.putObject(new File("hi.txt"));
		st.putObject(new Integer(15));
		st.putObject(new Steak());
		
		Object temp;
		System.out.println();
		
		for (;(temp = st.getDelObject()) != null;){
			System.out.println("class in Steak " + temp.getClass().getName());
		}
		
		
		st.putObject(new BlackList());
		
		for (;(temp = st.getDelObject()) != null;){
			System.out.println("class in Steak " + temp.getClass().getName());
		}
		
	}
	

}

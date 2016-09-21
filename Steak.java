package net.ukr.geka3;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Steak {
	private Object[] array = new Object[0];
	private int count = 0;
	
	BlackList classBlackList = new BlackList();

	public Steak() {
		super();
	}

	
	
	public Steak(BlackList classBlackList) {
		super();
		this.classBlackList = classBlackList;
	}



	

	public int getCount() {
		return count;
	}

	public void putObject(Object o) {
		if (o == null) {
			System.out.println("you try put no class but null");
			return;
		}

		if (classBlackList.check(o.getClass())) {
			System.out.println("Class " + o.getClass().getName() + " is in black list");
			return;
		}

		if (count == array.length) {
			resizeArray();

		}
		array[count] = o;
		count++;

	}

	public Object getDelObject() {
		if (count > 0) {
			count--;
			return array[count];
		} else {
			return null;
		}

	}

	public Object getObject() {
		if (count > 0) {

			return array[count - 1];
		} else {
			return null;
		}

	}

	private void resizeArray() {
		Object[] temp = new Object[array.length + 1];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}
}

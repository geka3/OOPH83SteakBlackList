package net.ukr.geka3;

public class BlackList {
	Class[] blackList = new Class[0];
	int count = 0;

	
	
	
	public BlackList() {
		super();
	}

	public BlackList(Class[] blackList) {
		super();
		this.blackList = blackList;
	}

	public void addBlackList(Class cl) {
		if (cl == null) {
			System.out.println("you try put no class but null");
			return;
		}

		for (Class bl : blackList) {

			if (bl == cl) {
				System.out.println("class " + cl.getName() + " is in black list");
				return;
			}
		}

		if (count == blackList.length) {
			resizeArray();

		}
		blackList[count] = cl;
		count++;
	}

	private void resizeArray() {
		Class[] temp = new Class[blackList.length + 1];
		System.arraycopy(blackList, 0, temp, 0, blackList.length);
		blackList = temp;
	}

	public boolean check(Class cl) {
		for (Class blClass : blackList) {
			if (blClass == cl) {
				return true;
			}

		}
		return false;
	}

}

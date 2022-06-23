package dev.amplifire.arraylist;

public class ArrayList implements List {
		
		private int size = 0;
		private int pos = 0;
		private Object[] arr;
		
	public ArrayList (int size) {
		if (size > 0) {
			this.size = size;
			arr = new Object[size];
		}
	}
	
	private Object[] expandArray() {
		// Double size of the current array.
		int newSize = this.size * 2;
		Object[] newArr = new Object[newSize];
		
		for (int i = 0; i < size; i++) {
			newArr[i] = this.arr[i];
		}
		this.size = newSize;
		this.arr = newArr;
		
		return this.arr;
	}
	
	public int getSize() {
		return this.size;
	}
	
	@Override
	public void append(Object obj) {
		// TODO Auto-generated method stub
		if (this.pos < this.size) {
			this.arr[pos] = obj;
			this.pos++;
		} else {
			expandArray();
			this.arr[pos] = obj;
		}
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if (index < this.size) {
			return this.arr[index];
		} else {
			return null;
		}
	}

	@Override
	public Object deleteAt(int index) {
		// TODO Auto-generated method stub
		if (index < size) {
			Object deletedItem = this.arr[index];
			this.arr[index] = null;
			for (int i = index+1; i < this.size; i++) {
				this.arr[i--] = this.arr[i];
			}
			return deletedItem;
		} else {
			return null;
		}
	}

}

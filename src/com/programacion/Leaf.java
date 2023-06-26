package com.programacion;

public final class Leaf<T> implements BinTree<T> {
	
	protected Leaf() {

	}
	
	@Override
	public T seed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinTree<T> left() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BinTree<T> right() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean isEmpyt() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Leaf";
	}

}
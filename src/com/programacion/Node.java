package com.programacion;

public final class Node<T> implements BinTree<T> {
	private final T seed;
	private final BinTree<T> left;
	private final BinTree<T> right;
	
	
	public Node(T seed,BinTree<T> left, BinTree<T> right) {
		this.seed = seed;
		this.left = left;
		this.right = right;
	}
	
	public Node(T seed) {
		this.seed = seed;
		this.left = LEAF;
		this.right = LEAF;
	}

	@Override
	public BinTree<T> left() {
		// TODO Auto-generated method stub
		return left;
	}

	@Override
	public BinTree<T> right() {
		// TODO Auto-generated method stub
		return right;
	}

	@Override
	public T seed() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpyt() {
		// TODO Auto-generated method stub
		
		return false;
	}
	public String toString() {
		return String.format("BinTree(%s,%s,%s)", seed == null ? "null" : seed.toString(),
				left == null ? "null" : this.left.toString(), right == null ? "null" : this.right.toString());
	}

	
	
 
}
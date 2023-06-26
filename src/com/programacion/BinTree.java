package com.programacion;

public sealed interface BinTree<T> permits Leaf,Node {

	BinTree LEAF = new Leaf<>();

	T seed();

	BinTree<T> left();

	BinTree<T> right();

	boolean isEmpyt();

	static <T> BinTree<T> of(T seed, BinTree<T> left, BinTree<T> right) {
		return new Node(seed, left, right);
	}

	static <T> BinTree<T> of(T seed) {
		return new Node(seed);
	}

	default int size() {

		if (isEmpyt()) {

			return 0;
		} else {

			return 1 + left().size() + right().size();
		}

	}

}

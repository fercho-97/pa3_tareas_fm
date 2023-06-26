package com.programacion;

public class Main {

	static Lista NIL = new Nil();
	static BinTree Leaf = new Leaf();

	static <T> BinTree<T> buildTree(Lista<T> ls) {

		if (ls.isEmpty()) {

			return Leaf;

		} else {

			T h = ls.head();
			// System.out.println("h= " +h);

			Lista<T> t = ls.tail();

			int n = t == NIL ? 0 : t.size() / 2;
			// System.out.println("k= " + n);

			var left = t.take(n);

			// System.out.println("l= " + left);
			var right = t.drop(n);
			// System.out.println("r= " + right);

			return BinTree.of(h, buildTree(left), buildTree(right));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista<Integer> list = Lista.of(1, 2, 3, 4, 5, 6, 7, 8);

		var l1 = list.drop(4);

		var l2 = list.take(4);

		System.out.println("Drop= "+l1);

		System.out.println("Take= "+l2);

		var n = list.size();

		System.out.println("tamaño lista= "+n);

		BinTree<Integer> a1 = BinTree.of(1, BinTree.of(2), BinTree.of(2));

		System.out.println("Arbol: " + a1);
		
		System.out.println("Tamaño arbol= "+ a1.size());

		
		BinTree<Integer> a2 = buildTree(list);
		System.out.println("Arbol con listas: " + a2);
		
		System.out.println("Tamaño arbol de listas= "+ a2.size());

		

	

	}

}

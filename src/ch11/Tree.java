package ch11;
/*
 * 树
 */
public class Tree {
	//根节点
	public Node root;
	
	/**
	 * 插入节点
	 * @param value
	 */
	public void insert(long value,String sValue) {
		//插入的新节点
		Node newNode = new Node(value,sValue);
		//当前节点，从根开始
		Node current = root;
		//新节点的父节点引用
		Node parent;
		//没有节点时
		if(root == null) {
			root = newNode;
			return;
		} else {
			while(true) {
				//父节点
				parent = current;
				//判断往左还是往右
				if(current.data > value) {
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
	
	/**
	 * 查找
	 * @param value
	 */
	public Node find(long value) {
		//要查找的节点引用
		Node current = root;
		while(current.data != value) {
			if(current.data > value) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			//没有子节点时说明不存在该节点
			if(current == null) {
				return null;
			}
		}
		return current;
	}
	
	/**
	 * 删除
	 * @param value
	 */
	public void delte(long value) {
		
	}
	
}

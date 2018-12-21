package ch11;
/*
 * 节点类
 */
public class Node {
	//值，索引
	public long data;
	//字符值
	public String sData;
	//左节点
	public Node leftChild;
	//右节点
	public Node rightChild;
	
	/**
	 * 构造
	 * @param data
	 */
	public Node(long data,String sData) {
		this.data = data;
		this.sData = sData;
	}
	
}

package org.gome.search.test;

/**
 * 
 * @author doujintong
 *
 * @param <T>
 */
public class Node<T> {
	private String ip;// IP
	private String name;// 名称

	public Node(String ip, String name) {
		this.ip = ip;
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 复写toString方法，使用节点IP当做hash的KEY
	 */
	@Override
	public String toString() {
		return ip;
	}
}
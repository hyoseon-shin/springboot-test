package com.springboot.dao;

public class Board {

	private int seq;
	private String title;
	private String content;
	private String writer;
	private String passwd;
	private int parent_seq;

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getParentSeq() {
		return parent_seq;
	}
	public void setParentSeq(int parent_seq) {
		this.parent_seq = parent_seq;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("title : ").append(this.title).append("\n");
		sb.append("content : ").append(this.content).append("\n");
		sb.append("wirter : ").append(this.writer).append("\n");
		sb.append("passwd : ").append(this.passwd).append("\n");
		sb.append("parent_seq : ").append(this.parent_seq).append("\n");

		return sb.toString();
	}
}

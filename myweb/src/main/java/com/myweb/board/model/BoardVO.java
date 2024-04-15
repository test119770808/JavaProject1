package com.myweb.board.model;

import java.sql.Timestamp;

public class BoardVO {
	
	private int num;
	private String writer;
	private String title;
	private String content;
	private Timestamp regdate;
	private int hit;
	
	public BoardVO() {}

	public BoardVO(int num, String writer, String title, String content, Timestamp regdate, int hit) {
		this.num = num;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
	}

	public int getNum() {
		return num;
	}

	public String getWriter() {
		return writer;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public int getHit() {
		return hit;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", writer=" + writer + ", title=" + title + ", content=" + content + ", regdate="
				+ regdate + ", hit=" + hit + "]";
	}
	

}

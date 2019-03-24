package com.xxh.json;

import java.util.List;

public class FileData {
	
	public String page;
	public List<RowData> data;
	public Font font;
	
	public FileData() {
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public List<RowData> getRowlist() {
		return data;
	}
	public void setRowlist(List<RowData> rowlist) {
		this.data = rowlist;
	}
	public Font getFont() {
		return font;
	}
	public void setFont(Font font) {
		this.font = font;
	}
	@Override
	public String toString() {
		return "FileData [page=" + page + ", rowlist=" + data + ", font=" + font + "]";
	}
	
	
	

}

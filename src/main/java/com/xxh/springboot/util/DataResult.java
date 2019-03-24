package com.xxh.springboot.util;

public class DataResult {
	
	public Object data;
	
	public Integer status;
	
	public String msg;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "DataResult [data=" + data + ", status=" + status + ", msg=" + msg + "]";
	}
	
	

}

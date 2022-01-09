package com.calculator.RestCalculator;

public class Response {
	private int x;
	private int y;

	private int result;

	public Response(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getResult() {
		return result;
	}




}

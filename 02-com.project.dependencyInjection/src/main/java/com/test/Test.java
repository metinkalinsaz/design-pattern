package com.test;

import com.client.Client;

public class Test {

	public static void main(String[] args) {

		Client client = new Client();
		client.clientRequest("civic");
		client.clientRequest("corolla");

	}
}

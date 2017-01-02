package com.rest.vaibhav.document.Database;

import java.util.HashMap;
import java.util.Map;

import com.rest.vaibhav.document.Model.Document;

public class Database {
	
	private static Map<String,Document> documents = new HashMap<>();

	public static Map<String, Document> getDocuments() {
		return documents;
	}
	
	
	

}

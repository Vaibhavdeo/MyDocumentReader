package com.rest.vaibhav.document.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.vaibhav.document.Database.Database;
import com.rest.vaibhav.document.Model.Document;

public class DocumentService {
	
	private Map<String,Document> documents = Database.getDocuments();
	
	public DocumentService(){
		
		documents.put("Aadhar", new Document(1l,"1234", "Aadhar"));
		documents.put("PAN", new Document(2l,"4567", "PAN"));
		
	}
	
	public List<Document> getAllDocuments(){
		
		return new ArrayList<>(documents.values());
		
	}
	
    public Document getDocument(String documentName){
		
		return documents.get(documentName);
		
	}
    
    public Document addDocument(Document document){
		
    	document.setId(documents.size()+1);
	    documents.put(document.getDocumentName(),document);
	    return document;
		
	}
    
    public Document updateDocument(Document document){
    	if(document.getDocumentName().equals(null)){
    		return null;
    	}
	   documents.put(document.getDocumentName(), document);
	   return document;
    	
    }
    
    public void removeDocument(String documentname){
    	
    	documents.remove(documentname);
    	
    }
    

}

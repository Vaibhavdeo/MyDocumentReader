package com.rest.vaibhav.document.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.vaibhav.document.Database.Database;
import com.rest.vaibhav.document.Model.Document;

public class DocumentService {
	
	private Map<String,Document> documents = Database.getDocuments();
	
	public DocumentService(){
		
		documents.put("Aadhar", new Document(1l,"223955959279", "Aadhar"));
		documents.put("PAN", new Document(2l,"BDOPD", "PAN"));
		documents.put("UAN", new Document(3l,"100671453580", "UAN"));
		documents.put("PF", new Document(3l,"PU/PUN/1376740/165", "PF"));
		
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

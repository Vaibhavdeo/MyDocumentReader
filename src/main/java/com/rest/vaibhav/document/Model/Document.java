package com.rest.vaibhav.document.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Document {
	
	private long id;
	private String documentNumber;
	private String documentName;
	
	public Document(){
		
	}
	
	public Document(long id, String documentNumber, String documentName) {
		super();
		this.id = id;
		this.documentNumber = documentNumber;
		this.documentName = documentName;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}



	@Override
	public String toString() {
		return "Document [id=" + id + ", documentNumber=" + documentNumber + ", documentName=" + documentName + "]";
	}

	
	

}

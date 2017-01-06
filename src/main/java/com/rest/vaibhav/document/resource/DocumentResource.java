package com.rest.vaibhav.document.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.vaibhav.document.service.DocumentService;
import com.rest.vaibhav.document.Model.Document;

@Path("documents")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_XML)

public class DocumentResource {

	private DocumentService documentService = new DocumentService();
	
	@GET
	public List<Document> getAllDocument(){
		
		return documentService.getAllDocuments();
		
	}
	

	
	@GET
	@Path("/{documentName}")
	public Document getDocument(@PathParam("documentName") String documentName){
		
		return documentService.getDocument(documentName);
	}
	
	@POST
	public Document addDocument(Document document){
		
		return documentService.addDocument(document);
			
	}
	
	@PUT
	@Path("/{documentName}")
	public Document updateDocument(@PathParam("documentName") String documentName,Document document){
		
		document.setDocumentName(documentName);
		documentService.updateDocument(document);
		return document;
	}
	
	
	@DELETE
	@Path("/{documentName}")
	public void deletedocument(@PathParam("documentName") String documentName){
		documentService.removeDocument(documentName);
		
	}
	
}

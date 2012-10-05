package com.jsanfil.photoshare.rest;

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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsanfil.photoshare.model.Photo;
import com.jsanfil.photoshare.persistence.PhotoMapper;


@Component
@Path("/photos")
public class PhotoResource {

	@Autowired
	PhotoMapper photoMapper;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public List<Photo> findAll() {
		System.out.println("findAll");
		return photoMapper.selectAll();
	}

/***
	@GET @Path("search/{query}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<Photo> findByName(@PathParam("query") String query) {
		System.out.println("findByName: " + query);
		return photoMapper.findByName(query);
	}
***/

	@GET @Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON})
	// TODO change return value back to Photo
	public Photo findById(@PathParam("id") String id) {
		System.out.println("findById " + id);
		Photo output = photoMapper.selectByPrimaryKey(Integer.valueOf(id));
		return output;
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Photo create(Photo photo) {
		System.out.println("creating Photo");
		int id = photoMapper.insert(photo);
		photo.setId(id);
		return photo;
	}

	@PUT @Path("{id}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Photo update(Photo Photo) {
		System.out.println("Updating Photo: " + Photo.getTitle());
		photoMapper.updateByPrimaryKey(Photo);
		return Photo;
	}
	
	@DELETE @Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("id") String id) {
		photoMapper.deleteByPrimaryKey(Integer.valueOf(id));
	}

}

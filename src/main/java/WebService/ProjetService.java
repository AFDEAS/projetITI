package WebService;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.ProjetManager;
import hei.iti.projet.model.Projet;

@Path("/projet")
public class ProjetService {

	
	
	@GET
	@Path("/titre")
	public Response listerProjet(){
		
		Gson gson = new Gson();
		String laReponseJson= gson.toJson(ProjetManager.getInstance().listerProjets());
		System.out.println("La liste des articles est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
		
	}
	
	@GET
	@Path("/image")
	public Response listerImage(){
		
		Gson gson = new Gson();
		List<Projet> projet = ProjetManager.getInstance().listerProjets();
		List images = new ArrayList();
		for(int i=0; i<projet.size(); i++){
			
			images.add(PhotoManager.getInstance().recupererPhoto(projet.get(i).getNom()));
			
			
			
		}
		
		String laReponseJson= gson.toJson(images);
		System.out.println("La liste des articles est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
		
	}
	
}

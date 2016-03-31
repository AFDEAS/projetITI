package WebService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import hei.iti.projet.managers.VillageVitrineManager;

@Path("/carte")
public class CarteService {

	
	
	@GET
	@Path("/point")
	public Response listerProjet(){
		
		Gson gson = new Gson();
		String laReponseJson= gson.toJson(VillageVitrineManager.getInstance().recupererVillages());
		System.out.println("La liste des points est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
		
	}
	
	
	
	
	
	
	
}

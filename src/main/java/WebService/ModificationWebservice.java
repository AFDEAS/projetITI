package WebService;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import hei.iti.projet.managers.PageManager;

@Path("/modifier")
public class ModificationWebservice {


	
	@POST
	@Path("/{page}")
	public Response ModifierArticle(@FormParam("nvtexte") String nvtexte, @PathParam("page") String page) throws NumberFormatException, Exception{
		
		System.out.println(nvtexte);
		Gson gson = new Gson();
		String laReponseJson= gson.toJson(PageManager.getInstance().modifierTexte(page, nvtexte));
		System.out.println("La liste du POST est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
		
		
	}
	
	
	
	
	
}

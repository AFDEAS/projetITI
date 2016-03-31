package WebService;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import hei.iti.projet.managers.PhotoManager;
import hei.iti.projet.managers.ProduitManager;
import hei.iti.projet.model.Photo;
import hei.iti.projet.model.Produit;

@Path("/commande")
public class CommandeService {

	
	
	@GET
	@Path("/menu")
	public Response listerCategorie(){
		
		Gson gson = new Gson();
		String laReponseJson= gson.toJson(ProduitManager.getInstance().listerCategorie());
		
		
		System.out.println("La liste des points est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
	}
	
	@POST
	@Path("/{categorie}")
	public Response ListerProduits(@PathParam("categorie") String categorie) throws NumberFormatException, Exception{
		
		String laReponseJson = null;
		Gson gson = new Gson();
		
		
		if(categorie.equals("Tout")){
			laReponseJson= gson.toJson(ProduitManager.getInstance().listerProduits());
		}
		else{
		laReponseJson= gson.toJson(ProduitManager.getInstance().listerProduits(categorie));
		}
		
		System.out.println("La liste des points est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
	}
	
	
	@POST
	@Path("/img/{categorie}")
	public Response ListerImage(@PathParam("categorie") String categorie) throws NumberFormatException, Exception{
		
		String laReponseJson = null;
		Gson gson = new Gson();
		List<Photo> listephoto = new ArrayList<>();
		
		
		if(categorie.equals("Tout")){
			
			for(int i = 0 ; i<ProduitManager.getInstance().listerProduits().size(); i++){
				
				listephoto =  PhotoManager.getInstance().recupererPhoto(""+ProduitManager.getInstance().listerProduits().get(i).getId());
				
			}
					
					
			
			laReponseJson= gson.toJson(listephoto);
		}
		else{
			for(int i = 0 ; i<ProduitManager.getInstance().listerProduits(categorie).size(); i++){
				
				listephoto =  PhotoManager.getInstance().recupererPhoto(""+ProduitManager.getInstance().listerProduits(categorie).get(i).getId());
				
			}
					
		List truc = new ArrayList();
		
		truc.add(listephoto);
		truc.add(ProduitManager.getInstance().listerProduits(categorie));
			
			laReponseJson= gson.toJson(truc);
		}
		
		System.out.println("La liste des points est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
	}
	
	
	
	
	
	@POST
	@Path("/imgrech/{rech}")
	public Response ListerImageRech(@PathParam("rech") String rech) throws NumberFormatException, Exception{
		
		String laReponseJson = null;
		Gson gson = new Gson();
		List<Photo> listephoto = new ArrayList<Photo>();
		
	
					
					
			
		
			for(int i = 0 ; i<ProduitManager.getInstance().rechercherProduits(rech).size(); i++){
				
				
				System.out.println("Ce qui sort est "+PhotoManager.getInstance().recupererPhoto(""+ProduitManager.getInstance().rechercherProduits(rech).get(i).getId()));
				
				listephoto=PhotoManager.getInstance().recupererPhoto(""+ProduitManager.getInstance().rechercherProduits(rech).get(i).getId());
				
			
					
	
				
			
			
		}
		
			
			laReponseJson= gson.toJson(listephoto);
		System.out.println("La liste des points est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
	}
	
	
	
	
	
	
	@POST
	@Path("/rech/{rech}")
	public Response ListerRech(@PathParam("rech") String rech) throws NumberFormatException, Exception{
		
		String laReponseJson = null;
		Gson gson = new Gson();
		List<Produit> listeproduit = new ArrayList<Produit>();
		
	
					
					
			
		
			for(int i = 0 ; i<ProduitManager.getInstance().rechercherProduits(rech).size(); i++){
				
				listeproduit= ProduitManager.getInstance().rechercherProduits(rech);
				
			
					
	
				
			
			
		}
		
			
			laReponseJson= gson.toJson(listeproduit);
		System.out.println("La liste des points est "+laReponseJson);
		return Response.status(200).entity(laReponseJson).build();
	}
	
	
	
	
	
	
	
	}
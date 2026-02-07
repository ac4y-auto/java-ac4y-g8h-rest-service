package ac4y.guid8humanid.service.restful;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBException;

import ac4y.guid8humanid.service.object.Ac4yGUID8HumanIdObjectService;
import ac4y.guid8humanid.service.object.get.*;
import ac4y.guid8humanid.service.object.set.SetByHumanIdsRequest;

import ac4y.guid8humanid.service.object.set.SetTemplateByHumanIdRequest;

import java.util.UUID;


@Path("")
public class Ac4yGUID8HumanIdRestfulService {
	
	public Ac4yGUID8HumanIdRestfulService() {
	}

	@POST
	@Path("/setByRndHumanIds")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response setByRndHumanIds(String request) throws JAXBException {

		SetByHumanIdsRequest patchedRequest = (SetByHumanIdsRequest) new SetByHumanIdsRequest().getFromJson(request);
		patchedRequest.setTemplateHumanId(java.util.UUID.randomUUID().toString());
		patchedRequest.setHumanId(UUID.randomUUID().toString());

		return
				Response
						.status(200)
						.entity(

								new Ac4yGUID8HumanIdObjectService().setByHumanIds(patchedRequest).getAsJson()

						)
						.build();

	} // setByRndHumanIds

	@POST
	@Path("/setByHumanIds")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response setByHumanIds(String request) throws JAXBException {

		return
				Response
						.status(200)
						//.entity("{}")
						/**/
						.entity(

								new Ac4yGUID8HumanIdObjectService().setByHumanIds(
										(SetByHumanIdsRequest) new SetByHumanIdsRequest().getFromJson(request)
								).getAsJson()

						)
						/**/
						.build();

	} // setByHumanIds

	@POST
	@Path("/onlyHttp")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response onlyHttp(String request) throws JAXBException {

		return
				Response
						.status(200)
						.entity("{}")
						.build();

	} // onlyHttp

	@POST
	@Path("/setTemplateByHumanId")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response setTemplateByHumanId(String request) throws JAXBException {

		return
			Response
			   .status(200)
			   .entity(

					new Ac4yGUID8HumanIdObjectService().setTemplateByHumanId(
					   		(SetTemplateByHumanIdRequest) new SetTemplateByHumanIdRequest().getFromJson(request)
					).getAsJson()

			   )
			   .build();
		
	} // setTemplateByHumanId

	@GET
	@Path("/getGUIDByHumanIds")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response getGUIDByHumanIds(String request) throws JAXBException {

		//System.out.println(new SetByHumanIdsResponse().getAsJson());
//		System.out.println(new GetGUIDByHumanIdsResponse().getAsXml());
		//System.out.println(new GetGUIDByHumanIdsResponse().getAsJson());

		return
			Response
			   .status(200)
					//.entity("{}")
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getGUIDByHumanIds(
							   (GetGUIDByHumanIdsRequest) new GetGUIDByHumanIdsRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )

			   .build();
		
	} // getGUIDByHumanIds

	@GET
	@Path("/getTemplateGUID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getTemplateGUID(String request){

		return 
			Response
			   .status(200)
			   .entity(
					   new Ac4yGUID8HumanIdObjectService().getTemplateGUID(
							   (GetTemplateGUIDRequest) new GetTemplateGUIDRequest().getFromJson(request)
							  ).getAsJson()
			   )
			   .build();
		
	} // getTemplateGUID

	@GET
	@Path("/isExistByGUID")
	@Produces(MediaType.APPLICATION_JSON)
	public Response isExistByGUID(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().isExistByGUID(
							   (IsExistByGUIDRequest) new IsExistByGUIDRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // isExistByGUID

	@GET
	@Path("/isExistByHumanIds")
	@Produces(MediaType.APPLICATION_JSON)
	public Response isExistByHumanIds(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().isExistByHumanIds(
							   (IsExistByHumanIdsRequest) new IsExistByHumanIdsRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // isExistByGUID

	@GET
	@Path("/getByGUID")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)

	public Response getByGUID(String request) {

		System.out.println(request);
		System.out.println((GetByGUIDRequest) new GetByGUIDRequest().getFromJson(request));

		return 
			Response
			   .status(200)
					.entity("{}")
					/*
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getByGUID(
							   (GetByGUIDRequest) new GetByGUIDRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )*/
			   .build();
		
	} // getByGUID

	@GET
	@Path("/getByHumanIds")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByHumanIds(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getByHumanIds(
							   (GetByHumanIdsRequest) new GetByHumanIdsRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getByHumanIds

	@GET
	@Path("/getList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getList(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getList(
							   (GetListRequest) new GetListRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getList

	@GET
	@Path("/getInstanceList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getInstanceList(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getList(
							   (GetListRequest) new GetListRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getList

	@GET
	@Path("/getGUIDList")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGUIDList(@QueryParam("request") String request) {
		
		return 
			Response
			   .status(200)
			   .entity(
					   
					   new Ac4yGUID8HumanIdObjectService().getGUIDList(
							   (GetGUIDListRequest) new GetGUIDListRequest().getFromJson(request)
							  ).getAsJson()
					   
			   )
			   .build();
		
	} // getList

} // Ac4yGUID8HumanIdRestfulService
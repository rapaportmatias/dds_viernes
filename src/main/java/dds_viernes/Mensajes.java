package dds_viernes;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

public class Mensajes {

    private static final String RESOURCE = "http://notitas.herokuapp.com";
    private static final String STUDENT_PATH = "student";
    private static final String ASSIGNMENTS_PATH = "student/assignments";

	public ClientResponse getStudent(String token){
		return Client.create()
				.resource(RESOURCE)
				.path(STUDENT_PATH)
				.header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
    }
	
	public ClientResponse getStudentAssignments(String token){
		return Client.create()
				.resource(RESOURCE)
				.path(ASSIGNMENTS_PATH)
				.header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON)
                .get(ClientResponse.class);
	}
	
	public ClientResponse putStudent(String token){
		return Client.create()
				.resource(RESOURCE)
				.path(ASSIGNMENTS_PATH)
				.header("Authorization", "Bearer " + token)
                .accept(MediaType.APPLICATION_JSON)
                .put(ClientResponse.class);
	}
}

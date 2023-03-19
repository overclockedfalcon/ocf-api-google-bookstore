package ocf.api.google.bookstore.service;

import org.springframework.stereotype.Component;

import ocf.api.google.bookstore.request.entity.GoogleBookstoreRequest;
import ocf.api.google.bookstore.response.entity.GoogleBookstoreResponse;
import ocf.library.core.interfaces.TService;

@Component
public class GoogleBookstoreService implements TService<GoogleBookstoreRequest, GoogleBookstoreResponse> {

	@Override
	public GoogleBookstoreResponse execute(GoogleBookstoreRequest request) {
		GoogleBookstoreResponse googleBookstoreResponse = new GoogleBookstoreResponse();
		googleBookstoreResponse.setMessage("Hi " + request.getUser());
		return googleBookstoreResponse;
	}
}

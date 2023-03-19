package ocf.api.google.bookstore.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ocf.api.google.bookstore.request.entity.GoogleBookstoreRequest;
import ocf.api.google.bookstore.response.entity.GoogleBookstoreResponse;
import ocf.library.core.interfaces.TRequestHandler;
import ocf.library.core.interfaces.TService;

@Component
public class GoogleBookstoreRequestHandler implements TRequestHandler<GoogleBookstoreRequest, GoogleBookstoreResponse> {
	@Autowired
	private TService<GoogleBookstoreRequest, GoogleBookstoreResponse> service;

	@Override
	public GoogleBookstoreResponse handle(GoogleBookstoreRequest request) {
		return service.execute(request);
	}

}

package ocf.api.google.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ocf.api.google.bookstore.request.entity.GoogleBookstoreRequest;
import ocf.api.google.bookstore.response.entity.GoogleBookstoreResponse;
import ocf.library.core.interfaces.TController;
import ocf.library.core.interfaces.TRequestHandler;

@RestController
@RequestMapping("v1")
public class GoogleBookstoreController implements TController {

	@Autowired
	private TRequestHandler<GoogleBookstoreRequest, GoogleBookstoreResponse> requestHandler;

	@PostMapping("welcome")
	public ResponseEntity<GoogleBookstoreResponse> greet(@RequestBody GoogleBookstoreRequest googleBookstoreRequest) {
		return new ResponseEntity<GoogleBookstoreResponse>(requestHandler.handle(googleBookstoreRequest),
				HttpStatus.OK);

	}

}

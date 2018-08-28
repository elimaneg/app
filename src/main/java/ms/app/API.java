package ege.ms.app;

import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Value;

@RestController
public class API {

	
	private static final Logger logger = LoggerFactory.getLogger(API.class);
	private static int counter = 0;
	@GetMapping("")
	public String testApp() {
		counter ++;
		logger.debug("Incoming call request no : ", counter);
		String response = "Pong";
		try {
			response = "[" + System.currentTimeMillis() + "] "+ InetAddress.getLocalHost().getHostName() + "Request ID : " + java.util.UUID.randomUUID().toString();
			logger.info(response);
		} catch (UnknownHostException e) {
			logger.error(e.getMessage(),e);
		}
		return response;
	}
}

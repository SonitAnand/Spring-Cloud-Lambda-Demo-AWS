package com.aws.lambda;

import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class MethodHandler implements Function<String, String> {

	@Autowired
	RestTemplate restTemplate;
	
	@Override public String apply(String input) {
	  String result = restTemplate.getForObject("http://headers.jsontest.com/",String.class); 
	  return input + " Batman " + result; 
	}
	 

	/*
	 * @Override public APIGatewayProxyResponseEvent
	 * apply(APIGatewayProxyRequestEvent input) {
	 * 
	 * APIGatewayProxyResponseEvent responseEvent = new
	 * APIGatewayProxyResponseEvent(); responseEvent.setStatusCode(200);
	 * responseEvent.setBody("Hello! Reached the Spring Cloud Function : " +
	 * input.getBody()); return responseEvent; }
	 */
	 
}

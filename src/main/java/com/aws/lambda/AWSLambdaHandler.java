package com.aws.lambda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class AWSLambdaHandler extends SpringBootRequestHandler<String, String>{

}

//APIGatewayProxyRequestEvent
//APIGatewayProxyResponseEvent
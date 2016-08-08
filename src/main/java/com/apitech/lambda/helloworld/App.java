package com.apitech.lambda.helloworld;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.Context;


/**
 * Hello world!
 *
 */
public class App implements RequestHandler<Request, Response>
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public Response handleRequest(Request request, Context context) {

        LambdaLogger.log("asdfsf");
        return new Response (context.toString());
    }
}

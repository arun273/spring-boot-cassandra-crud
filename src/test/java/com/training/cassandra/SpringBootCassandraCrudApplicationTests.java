package com.training.cassandra;


import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

class SpringBootCassandraCrudApplicationTests {

    public static Future<Response> getAsyncHttp(final String url) {
        return ClientBuilder.newClient().target(url).request().async().get();
    }

    public static void main(String... args) throws InterruptedException, ExecutionException {
        Future<Response> response = getAsyncHttp("http://www.nofrag.com");
        while (!response.isDone()) {
            System.out.println("Still waiting...");
            Thread.sleep(10);
        }
        System.out.println(response.get().readEntity(String.class));
    }

}

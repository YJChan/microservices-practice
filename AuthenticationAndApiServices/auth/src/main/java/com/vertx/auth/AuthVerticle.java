package com.vertx.auth;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;

public class AuthVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    vertx.createHttpServer().requestHandler(req -> {
      req.response()
        .putHeader("content-type", "text/plain")
        .end("Hello from Vert.x!");
    }).listen(8889, http -> {
      if (http.succeeded()) {
        startPromise.complete();
        System.out.println("HTTP server started on port 8889");
      } else {
        startPromise.fail(http.cause());
      }
    });
  }
}

package org.folio.rest.impl;

import io.vertx.core.AsyncResult;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.json.JsonObject;
import org.folio.rest.jaxrs.resource.ServiceResource;

import javax.ws.rs.core.Response;
import java.util.Map;

/**
 * TODO try to use Raml Builder version 20.0.0
 * TODO try to use response classes from ServiceResource
 */
public class ServiceResourceImpl implements ServiceResource {

  private static final String HEADER_CONTENT_TYPE = "Content-Type";
  private static final String APPLICATION_JSON = "application/json";
  private static final String TEXT_PLAIN = "text/plain";

  @Override
  public void getService(Map<String, String> okapiHeaders, Handler<AsyncResult<Response>> asyncResultHandler, Context vertxContext) throws Exception {
    String responseBody = "Module1 GET service has been successfully received your request";
    asyncResultHandler.handle(
      Future.succeededFuture(Response.ok(responseBody).header(HEADER_CONTENT_TYPE, TEXT_PLAIN).build())
    );
  }

  @Override
  public void postService(Map<String, String> okapiHeaders, Handler<AsyncResult<Response>> asyncResultHandler, Context vertxContext) throws Exception {
    String responseResult = "Module1 POST service has been successfully received your request";
    JsonObject responseBody = new JsonObject().put("result", responseResult);
    asyncResultHandler.handle(
      Future.succeededFuture(Response.ok(responseBody).header(HEADER_CONTENT_TYPE, APPLICATION_JSON).build())
    );
  }
}

package io.borlandfcsd.template.controller.exceptionProvider;



import org.glassfish.jersey.server.spi.ResponseErrorMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MethodArgumentNotValidExceptionHandler implements ExceptionMapper<Throwable>, ResponseErrorMapper {
    @Override
    public Response toResponse(Throwable e) {
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}

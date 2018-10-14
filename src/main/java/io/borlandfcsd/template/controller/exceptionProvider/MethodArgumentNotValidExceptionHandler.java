package io.borlandfcsd.template.controller.exceptionProvider;

import org.springframework.web.bind.MethodArgumentNotValidException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class MethodArgumentNotValidExceptionHandler implements ExceptionMapper<MethodArgumentNotValidException> {
    @Override
    public Response toResponse(MethodArgumentNotValidException e) {
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}

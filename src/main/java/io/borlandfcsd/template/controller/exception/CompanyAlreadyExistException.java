package io.borlandfcsd.template.controller.exception;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class CompanyAlreadyExistException extends WebApplicationException {

    public CompanyAlreadyExistException(String name) {
        super(Response.status(Response.Status.CONFLICT)
                .entity("Company with name:" + name + " already created")
                .type("text/plain")
                .build());
    }
}

package io.borlandfcsd.template.controller;

import io.borlandfcsd.template.controller.exception.CompanyAlreadyExistException;
import io.borlandfcsd.template.entity.Company;
import io.borlandfcsd.template.service.CompanyService;


import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import java.util.List;


@Path("/companies")
@Produces(MediaType.APPLICATION_JSON)
public class CompanyResource {
    private CompanyService companyService;

    public CompanyResource(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GET
    public List<Company> getCompanies(){
        return companyService.findAll();
    }

    @POST
    public Response saveCompany(@Valid Company company, @Context UriInfo info) {
        Company savedCompany = companyService.findByName(company.getName());
        if(savedCompany != null) {
            throw new CompanyAlreadyExistException(savedCompany.getName());
        }
        savedCompany = companyService.save(company);
        return Response.status(Response.Status.CREATED.getStatusCode())
                .header("Location",String.format("%s/%s",info.getAbsolutePath().toString(),
                        savedCompany.getId())).build();
    }
}

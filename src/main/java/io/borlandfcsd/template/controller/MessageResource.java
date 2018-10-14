package io.borlandfcsd.template.controller;

import io.borlandfcsd.template.entity.Message;
import io.borlandfcsd.template.entity.dto.MessageDto;
import io.borlandfcsd.template.entity.dto.transformer.MessageTransformer;
import io.borlandfcsd.template.service.MessageService;


import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {
    private MessageService messageService;

    public MessageResource(MessageService messageService) {
        this.messageService = messageService;
    }

    @GET
    public List<Message> findAll(@QueryParam("companyId") Long companyId){
        if(companyId != null){
          return messageService.findMessageByRecipientId(companyId);
        }
        return messageService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(@Valid MessageDto dto, @Context UriInfo uriInfo){
        Message savedMessage = messageService.save(MessageTransformer.convertToMessage(dto));

        return Response.status(Response.Status.CREATED.getStatusCode())
                .header(
                        "Location",
                        String.format("%s/%s",uriInfo.getAbsolutePath().toString(),
                                savedMessage.getId())).build();
    }
}

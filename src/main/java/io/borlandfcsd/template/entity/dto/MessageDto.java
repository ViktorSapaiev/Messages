package io.borlandfcsd.template.entity.dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import io.borlandfcsd.template.validator.ContactNumberConstraint;

@Data
@NotNull
public class MessageDto {
    @NotEmpty
    @ContactNumberConstraint
    private String sender;
    @NotNull
    private Long recipient;
    @NotEmpty
    private String message;
}

package io.borlandfcsd.template.entity.dto;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NotNull
public class MessageDto {
    @NotEmpty
    private String sender;
    @NotNull
    private Long recipient;
    @NotEmpty
    private String message;
}

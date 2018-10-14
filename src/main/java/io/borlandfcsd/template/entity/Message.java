package io.borlandfcsd.template.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "date_time")
    private LocalDateTime dateTime;
    @Column(name = "phone_number")
    @NotEmpty
    private String sender;
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company recipient;
    @Column
    @NotEmpty
    private String message;


}

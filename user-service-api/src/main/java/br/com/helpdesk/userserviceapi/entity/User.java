package br.com.helpdesk.userserviceapi.entity;

import lombok.*;
import models.enums.ProfileEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Set;

@With //no permite atualiza um único registro.
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "users")
public class User implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private Set<ProfileEnum> profileEnum;


}

package com.banco.banco.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "persona")
public class Cliente {

    @Id
    private String id;
    private String codigo;
    private String nombres;
    private String apellidos;
    private String dni;
    private Integer edad;
}

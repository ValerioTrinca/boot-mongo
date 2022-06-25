package it.valeriotrinca.bootmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("covers")
public class Cover {

    @Id
    private String id;

    @Field("book_id")
    private Integer bookId;

    @Field("ratingcount")
    private Integer ratingCount;

    @Field("ratingval")
    private Float ratingVal;
}

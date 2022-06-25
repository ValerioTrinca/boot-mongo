package it.valeriotrinca.bootmongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Data
@Document("city_inspections")
public class CityInspection {

    @Id
    private String id;

    @Field("id")
    private String customId;

    @Field("certificate_number")
    private Integer certificateNumber;

    @Field("business_name")
    private String businessName;

    @Field("date")
    private LocalDateTime date;

    @Field("result")
    private String result;

    @Field("sector")
    private String sector;

    @Field("address")
    private Address address;
}

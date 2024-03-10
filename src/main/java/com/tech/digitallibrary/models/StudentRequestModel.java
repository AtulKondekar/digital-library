package com.tech.digitallibrary.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentRequestModel {
    private Long id;
    private int age;
    private String name;
    private String country;
    private String email;
    private Long phoneNumber;
    private Date CreatedOn;
    private Date UpdatedOn;
    private CardRequestModel card;
    private String cardId;
}

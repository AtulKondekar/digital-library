package com.tech.digitallibrary.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.tech.digitallibrary.models.EnumType.StatusType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@JsonIgnoreProperties({"id"})
public class CardRequestModel {
    private StatusType status;
    private String email;
    private Date validUpto;
}

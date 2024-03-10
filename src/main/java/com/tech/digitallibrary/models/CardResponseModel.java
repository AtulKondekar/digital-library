package com.tech.digitallibrary.models;

import com.tech.digitallibrary.models.EnumType.StatusType;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CardResponseModel {
    private Long id;
    private StatusType status;
    private String email;
    private Date validUpto;
    private Date createdOn;
    private Date updatedOn;
}

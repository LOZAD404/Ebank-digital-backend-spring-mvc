package org.sid.ebankingbackend.dtos;


import lombok.Data;
import org.sid.ebankingbackend.entities.enums.OperationType;

import javax.persistence.*;
import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}

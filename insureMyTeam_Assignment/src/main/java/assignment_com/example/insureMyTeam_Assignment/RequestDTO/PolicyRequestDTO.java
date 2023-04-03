package assignment_com.example.insureMyTeam_Assignment.RequestDTO;

import assignment_com.example.insureMyTeam_Assignment.Models.policyType;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;

@Data
public class PolicyRequestDTO {
    @Column(unique = true)
    private int policyNo;

    @Enumerated(value = EnumType.STRING)
    private policyType policyType;
    private int coverageAmount;
    private int premium;
    private Date endDate;
    private int clientId;
}

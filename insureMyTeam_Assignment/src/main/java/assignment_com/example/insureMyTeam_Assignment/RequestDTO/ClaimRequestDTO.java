package assignment_com.example.insureMyTeam_Assignment.RequestDTO;

import assignment_com.example.insureMyTeam_Assignment.Models.claimStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class ClaimRequestDTO {
    private int claimNumber;
    private String description;
    @Enumerated(EnumType.STRING)
    private claimStatus claimStatus;
    private int insurancePolicyId;

}

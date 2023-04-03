package assignment_com.example.insureMyTeam_Assignment.Convertors;

import assignment_com.example.insureMyTeam_Assignment.Models.InsurancePolicy;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.PolicyRequestDTO;

public class PolicyConvertor {
    public static InsurancePolicy convertDtoToEntity(PolicyRequestDTO policyRequestDTO){
        InsurancePolicy IP = InsurancePolicy.builder().policyNo(policyRequestDTO.getPolicyNo())
                .policyType(policyRequestDTO.getPolicyType())
                .premium(policyRequestDTO.getPremium())
                .coverageAmount(policyRequestDTO.getCoverageAmount())
                .endDate(policyRequestDTO.getEndDate()).build();
        return IP;
    }
}

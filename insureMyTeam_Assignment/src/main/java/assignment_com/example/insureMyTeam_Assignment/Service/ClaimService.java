package assignment_com.example.insureMyTeam_Assignment.Service;

import assignment_com.example.insureMyTeam_Assignment.Models.Claim;
import assignment_com.example.insureMyTeam_Assignment.Models.InsurancePolicy;
import assignment_com.example.insureMyTeam_Assignment.Repository.ClaimRepository;
import assignment_com.example.insureMyTeam_Assignment.Repository.InsurancePolicyRepository;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.ClaimRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ClaimService {
    @Autowired
    ClaimRepository claimRepository;
    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;
    public void addClaim(ClaimRequestDTO claimRequestDTO){
        Claim claim = Claim.builder().claimNumber(claimRequestDTO.getClaimNumber())
                .description(claimRequestDTO.getDescription())
                .claimStatus(claimRequestDTO.getClaimStatus()).build();
        int policyId = claimRequestDTO.getInsurancePolicyId();
        InsurancePolicy insurancePolicy = insurancePolicyRepository.findById(policyId).get();
        claim.setInsurancePolicy(insurancePolicy);
        claimRepository.save(claim);
        return;
    }
    public Claim getClaimById(int id){
        Claim claim = claimRepository.findById(id).get();
        return claim;
    }
    public List<Claim> getAllClaims(){
        List<Claim> list = new ArrayList<>();
        list = claimRepository.findAll();
        return list;
    }
    public void deleteClaim(int id){
        claimRepository.deleteById(id);
        return;
    }

}

package assignment_com.example.insureMyTeam_Assignment.Controllers;

import assignment_com.example.insureMyTeam_Assignment.Models.InsurancePolicy;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.PolicyRequestDTO;
import assignment_com.example.insureMyTeam_Assignment.Service.InsurancePolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InsurancePolicyController {
    @Autowired
    InsurancePolicyService insurancePolicyService;
    @PostMapping("/api/policies")
    public ResponseEntity<String> addPolicy(@RequestBody()PolicyRequestDTO policyRequestDTO){
        insurancePolicyService.addPolicy(policyRequestDTO);
        return new ResponseEntity<>("Policy successfully added", HttpStatus.CREATED);
    }
    @GetMapping("/api/policies/{id}")
    public ResponseEntity<InsurancePolicy> getPolicyById(@RequestParam("id") int id){
        InsurancePolicy ip = insurancePolicyService.getPolicyById(id);
        return new ResponseEntity<>(ip,HttpStatus.CREATED);
    }
    @GetMapping("/api/policies")
    public ResponseEntity<List<InsurancePolicy>> getAllPolicies(){
        List<InsurancePolicy> list = new ArrayList<>();
        list=insurancePolicyService.getAllPolicies();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
    @DeleteMapping("/api/policies/{id}")
    public ResponseEntity<String> deletePolicyById(@RequestParam("id") int id){
        insurancePolicyService.deletePolicyById(id);
        return new ResponseEntity<>("Policy deleted successfully",HttpStatus.OK);
    }

}

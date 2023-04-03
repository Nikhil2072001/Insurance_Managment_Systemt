package assignment_com.example.insureMyTeam_Assignment.Controllers;

import assignment_com.example.insureMyTeam_Assignment.Models.Claim;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.ClaimRequestDTO;
import assignment_com.example.insureMyTeam_Assignment.Service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClaimController {
    @Autowired
    ClaimService claimService;

    @PostMapping("/api/claims")
    public ResponseEntity<String> addClaim(@RequestBody()ClaimRequestDTO claimRequestDTO){
        claimService.addClaim(claimRequestDTO);
        return new ResponseEntity<>("claimed", HttpStatus.OK);
    }
    @GetMapping("/api/claims/{id}")
    public ResponseEntity<Claim> getClaimById(@RequestParam("id") int id){
        Claim claim = claimService.getClaimById(id);
        return new ResponseEntity<>(claim,HttpStatus.OK);
    }
    @GetMapping("/api/claims")
    public ResponseEntity<List<Claim>> getAllClaims(){
        List<Claim> list = new ArrayList<>();
        list = claimService.getAllClaims();
        return new ResponseEntity<>(list,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/api/claims/{id}")
    public ResponseEntity<String> deleteClaim(@RequestParam("id") int id){
        claimService.deleteClaim(id);
        return new ResponseEntity<>("Claim deleted successfully",HttpStatus.OK);
    }
}

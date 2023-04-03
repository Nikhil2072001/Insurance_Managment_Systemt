package assignment_com.example.insureMyTeam_Assignment.Repository;

import assignment_com.example.insureMyTeam_Assignment.Models.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepository extends JpaRepository<Claim,Integer> {
}

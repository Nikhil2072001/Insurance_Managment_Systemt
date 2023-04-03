package assignment_com.example.insureMyTeam_Assignment.Repository;

import assignment_com.example.insureMyTeam_Assignment.Models.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy,Integer> {
}

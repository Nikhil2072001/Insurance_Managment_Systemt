package assignment_com.example.insureMyTeam_Assignment.Repository;

import assignment_com.example.insureMyTeam_Assignment.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Integer> {
}

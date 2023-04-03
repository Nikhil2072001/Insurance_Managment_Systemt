package assignment_com.example.insureMyTeam_Assignment;

import assignment_com.example.insureMyTeam_Assignment.Repository.ClaimRepository;
import assignment_com.example.insureMyTeam_Assignment.Repository.ClientRepository;
import assignment_com.example.insureMyTeam_Assignment.Repository.InsurancePolicyRepository;
import assignment_com.example.insureMyTeam_Assignment.Service.ClaimService;
import assignment_com.example.insureMyTeam_Assignment.Service.ClientService;
import assignment_com.example.insureMyTeam_Assignment.Service.InsurancePolicyService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class InsureMyTeamAssignmentApplicationTests {
@Autowired
	ClientService clientService;
@Autowired
	InsurancePolicyService insurancePolicyService;
@Autowired
	ClaimService claimService;
@MockBean
	ClientRepository clientRepository;
@MockBean
	InsurancePolicyRepository insurancePolicyRepository;
@MockBean
	ClaimRepository claimRepository;

	@Test
	void contextLoads() {
	}

}

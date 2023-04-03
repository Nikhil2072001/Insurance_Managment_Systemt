package assignment_com.example.insureMyTeam_Assignment.Service;

import assignment_com.example.insureMyTeam_Assignment.Convertors.PolicyConvertor;
import assignment_com.example.insureMyTeam_Assignment.Models.Client;
import assignment_com.example.insureMyTeam_Assignment.Models.InsurancePolicy;
import assignment_com.example.insureMyTeam_Assignment.Repository.ClientRepository;
import assignment_com.example.insureMyTeam_Assignment.Repository.InsurancePolicyRepository;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.PolicyRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@Service
public class InsurancePolicyService {
    @Autowired
    InsurancePolicyRepository insurancePolicyRepository;
    @Autowired
    ClientRepository clientRepository;
    public void addPolicy(PolicyRequestDTO policyRequestDTO){
        InsurancePolicy ip = PolicyConvertor.convertDtoToEntity(policyRequestDTO);
        int  clientId = policyRequestDTO.getClientId();
        Client client = clientRepository.findById(clientId).get();
        ip.setClient(client);

        insurancePolicyRepository.save(ip);
        return;
    }
    public InsurancePolicy getPolicyById(int id){
        InsurancePolicy ip=null;
        try{
            ip=insurancePolicyRepository.findById(id).get();

        }catch (Exception e){

            log.info("deleteClient has caused an error");
        }
        return ip;
    }
    public List<InsurancePolicy> getAllPolicies(){
        List<InsurancePolicy> list = new ArrayList<>();
        list=insurancePolicyRepository.findAll();
        return list;
    }
    public void deletePolicyById(int id){
        insurancePolicyRepository.deleteById(id);
        return;
    }
}

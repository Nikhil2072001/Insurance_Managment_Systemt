package assignment_com.example.insureMyTeam_Assignment.Service;

import assignment_com.example.insureMyTeam_Assignment.Convertors.ClientConvertor;
import assignment_com.example.insureMyTeam_Assignment.Models.Client;
import assignment_com.example.insureMyTeam_Assignment.Repository.ClientRepository;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.ClientRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ClientService {
    @Autowired
    ClientRepository clientRepository;
    public String createClient(ClientRequestDTO clientRequestDTO){
        try {
            Client client = ClientConvertor.convertDtoToEntity(clientRequestDTO);
            clientRepository.save(client);
        }catch (Exception e){
            log.info("createClient has caused an error");
            return "Create client didnt work";
        }
        return "Client created successfully";
    }
    public Client findClientById(int id){
        Client c=null;
        try{
            c = clientRepository.findById(id).get();
            return c;
        }catch (Exception e){
            log.info("getClient has caused an error");
        }
        return c;
    }
    public List<Client> findAllClients(){
        List<Client> clientList = new ArrayList<>();
        clientList=clientRepository.findAll();
        return clientList;
    }
    public String deleteClient(int id){
        try{
            clientRepository.deleteById(id);
        }catch (Exception e){
            log.info("deleteClient has caused an error");
            return "client not found";
        }
        return "client deleted successfully";
    }
}

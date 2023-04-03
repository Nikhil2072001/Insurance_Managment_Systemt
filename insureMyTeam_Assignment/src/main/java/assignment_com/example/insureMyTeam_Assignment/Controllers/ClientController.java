package assignment_com.example.insureMyTeam_Assignment.Controllers;

import assignment_com.example.insureMyTeam_Assignment.Models.Client;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.ClientRequestDTO;
import assignment_com.example.insureMyTeam_Assignment.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService clientService;

    @PostMapping("/api/clients")
    public ResponseEntity<String> createClient(@RequestBody() ClientRequestDTO clientRequestDTO) {
        String s = clientService.createClient(clientRequestDTO);
        return new ResponseEntity<>(s, HttpStatus.CREATED);

    }

    @GetMapping("/api/clients/{id}")
    public ResponseEntity<Client> findClientById(@RequestParam("id") int id) {
        Client c = clientService.findClientById(id);
        return new ResponseEntity<>(c, HttpStatus.ACCEPTED);
    }
    @GetMapping("/api/clients")
    public ResponseEntity<List<Client>> findAllClients() {
        List<Client> clientList = new ArrayList<>();
        clientList = clientService.findAllClients();
        return new ResponseEntity<>(clientList, HttpStatus.ACCEPTED);
    }
@DeleteMapping("/api/clients/{id}")
    public ResponseEntity<String> deleteClient(@RequestParam("id") int id){
        String s = clientService.deleteClient(id);
        return new ResponseEntity<>(s,HttpStatus.OK);
}
}

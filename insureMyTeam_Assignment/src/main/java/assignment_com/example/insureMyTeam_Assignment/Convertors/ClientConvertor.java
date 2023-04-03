package assignment_com.example.insureMyTeam_Assignment.Convertors;

import assignment_com.example.insureMyTeam_Assignment.Models.Client;
import assignment_com.example.insureMyTeam_Assignment.RequestDTO.ClientRequestDTO;

public class ClientConvertor {
public static Client convertDtoToEntity(ClientRequestDTO clientRequestDTO){
    Client c = Client.builder().name(clientRequestDTO.getName()).dob(clientRequestDTO.getDob())
            .address(clientRequestDTO.getAddress()).contact(clientRequestDTO.getContact()).build();
    return c;
}
}

package assignment_com.example.insureMyTeam_Assignment.RequestDTO;

import jakarta.persistence.Column;
import lombok.Data;

import java.util.Date;

@Data
public class ClientRequestDTO {
    private String name;

    private Date dob;

    private String address;

    @Column(unique = true)
    private String contact;
}

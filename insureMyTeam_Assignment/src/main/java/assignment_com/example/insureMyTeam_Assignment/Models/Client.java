package assignment_com.example.insureMyTeam_Assignment.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private Date dob;

    private String address;

    @Column(unique = true)
    private String contact;
    @OneToMany(mappedBy = "policyType", cascade = CascadeType.ALL)
    private List<InsurancePolicy> insurancePolicyList;

}

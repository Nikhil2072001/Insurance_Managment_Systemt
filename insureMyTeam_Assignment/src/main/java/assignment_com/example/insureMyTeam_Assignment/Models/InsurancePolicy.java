package assignment_com.example.insureMyTeam_Assignment.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int policyNo;

    @Enumerated(value = EnumType.STRING)
    private policyType policyType;
    @ManyToOne
    @JoinColumn
    private Client client;
    private int coverageAmount;
    private int premium;

  @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startDate;
    private Date endDate;
    @OneToOne(mappedBy = "insurancePolicy", cascade = CascadeType.ALL)
    private Claim claim;
}

package assignment_com.example.insureMyTeam_Assignment.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Claim {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true)
    private int claimNumber;
    private String description;
    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date claimDate;
    @Enumerated(EnumType.STRING)
    private claimStatus claimStatus;

    @OneToOne
    @JoinColumn
    private InsurancePolicy insurancePolicy;

}

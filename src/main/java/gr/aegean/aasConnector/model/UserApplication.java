package gr.aegean.aasConnector.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity(name="user_application")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserApplication {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="submition_status")
    private String submissionStatus;
    @Column(name="user_id")
    private String userId;


}

package gr.aegean.aasConnector.model;

import lombok.*;

import javax.persistence.*;

@Entity(name="jhi_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AasUser {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    @Column(name="login")
    private String login;



}

package no.hvl.dat108;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(schema = "public", name="participantlist")
public class ParticipantList {
    @Id
    private int id;

    @OneToMany(
        cascade = CascadeType.ALL,
        orphanRemoval = true,
        fetch = FetchType.EAGER,
        mappedBy = "participantlist"
    )
    private List<Participant> participantList = new ArrayList<>();

    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void addParticipant(Participant participant) {
        participantList.add(participant);
    }
}
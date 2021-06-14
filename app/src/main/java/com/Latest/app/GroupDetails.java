

import com.google.firebase.firestore.ServerTimestamp;

import java.util.Date;

public class GroupDetails implements Serializable {

    public void setSongURL(String songURL) {
        this.songURL = songURL;
    }

    private String songURL;
    private String songTitle;
    private ArrayList<String> participantID;

        this.owner = owner;
        this.ownerName = ownerName;
        this.timestamp = timestamp;
    }

    private @ServerTimestamp Date timestamp;
    public ArrayList<String> getParticipantID() {
        return participantID;
    }

        this.participantID = participantID;
    }

    public ArrayList<String> getParticipantName() {
        this.renderURL = renderURL;
    }

    private String renderURL;

}
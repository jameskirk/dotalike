package dotadodge.core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report {
    
    @Id
    @GeneratedValue
    private int id;
    
    private int stars;
    
    private String description;
    
    private String bySteamId;
    
    private String toMatchId;
    
    public int getId() {
        return id;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getBySteamId() {
        return bySteamId;
    }

    public void setBySteamId(String bySteamId) {
        this.bySteamId = bySteamId;
    }

    public String getToMatchId() {
        return toMatchId;
    }

    public void setToMatchId(String toMatchId) {
        this.toMatchId = toMatchId;
    }
    
}

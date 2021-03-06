package dotalike.common.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Like {
	
	@Id
	@GeneratedValue
	private int id;
	
	private boolean isPositive;
	
	@ManyToOne
	private Player byPlayer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isPositive() {
		return isPositive;
	}

	public void setPositive(boolean isPositive) {
		this.isPositive = isPositive;
	}

	public Player getByPlayer() {
		return byPlayer;
	}

	public void setbyPlayer(Player forPlayer) {
		this.byPlayer = forPlayer;
	}
	
}

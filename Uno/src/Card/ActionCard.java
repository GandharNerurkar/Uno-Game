package Card;

public class ActionCard implements Card {
	private String action;

	public ActionCard() {
		super();
	}

	public ActionCard(String action) {
		super();
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}

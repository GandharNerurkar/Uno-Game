package Card;

public class WildCard implements Card {
	private String wildcard;

	public WildCard() {
		super();
	}

	public WildCard(String wildcard) {
		super();
		this.wildcard = wildcard;
	}

	public String getWildcard() {
		return wildcard;
	}

	public void setWildcard(String wildcard) {
		this.wildcard = wildcard;
	}

}

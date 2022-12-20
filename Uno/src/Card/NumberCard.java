package Card;

public class NumberCard implements Card {
	private Integer value;
	private String color;

	public NumberCard(Integer value, String color) {
		super();
		this.value = value;
		this.color = color;
	}
//
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public NumberCard() {
		super();
	}
}

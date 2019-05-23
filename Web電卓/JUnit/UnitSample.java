package ut;

public class UnitSample {
	private String input = "";
	private Character operator;
	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}
	public Character getOperator() {
		return operator;
	}
	public void setOperator(Character operator) {
		this.operator = operator;
	}

	/**
	 * 入力文字を判別し、数字[0-9]の時にはフィールドinputへ追記し、<br>
	 * 演算子（+-/*）の時はフィールドoperatorへ設定する。<br>
	 * ただし、inputの値が0の時、新たに0が入力されても追記しない。<br>
	 * その他の文字が入力された場合には、処理を行わない。<br>
	 *
	 * @param value
	 */
	public void append(char value) {
		if (value >= '1' && value <= '9') {
			input += value;
		} else if (value == '0') {
			input += value;
		} else if (value == '+' || value == '-' || value == '*' || value == '/') {
			operator = value;
		}
	}
}

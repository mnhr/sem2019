package playground;

public class SimpleCalc {	//1,+,-,=のキーしかない電卓
	private int result = 0;			//計算結果
	private String operator = "+";	//直前に押した演算キー
	private int input = 0;			//入力値
	private boolean displayInput = true;	//結果と入力値のどちらを表示させるかの判別フラグ

	public void calc(String button) {
		if (button.equals("1")) {
			if (!displayInput) {
				input = 0;
				displayInput = true;
			}
			input = input*10 + 1;
		}
		if (button.equals("+") || button.equals("-") || button.equals("=")) {
			displayInput = false;
			if (operator.equals("+")) {
				result += input;
			}else if (operator.equals("-")) {
				result -= input;
			}
			if (!button.equals("=")) {
				operator = button;
			}
		}
	}

	public int display() {
		return (displayInput)? input: result;
	}
}
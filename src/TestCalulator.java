
public class TestCalulator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setValue(4, 3);
		c1.add();
		System.out.print(c1.showResult());
	}
}

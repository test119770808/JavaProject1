package quiz;

public class Quiz_shop_240315 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();

		b1.cash = 5000;

		b1.addToCart(new Coffee(1000, "이디야 원두"));
		b1.addToCart(new Coffee(1000, "이디야 원두"));
		b1.addToCart(new Coffee(1000, "이디야 원두"));

		b1.buyAll();
		b1.addToCart(new Coffee(1000, "이디야 원두"));
		b1.receipt();

		System.out.println("___cart____");
		b1.viewCart();
		System.out.println("___Trunk___");
		b1.viewTrunk();
	}

}

class Buyer {
	int cash;
	private int before_cash;
	private int index = 0;
	private int max_index = 5;
	private int trunk_max_index = 5;
	private int trunk_index = 0;
	private int cart_index;
	private Product[] cart = new Product[max_index];
	private Product[] trunk = new Product[trunk_max_index];

	void buy(Product p) {
		if (!(cash >= p.getPrice())) {
			return;
		}

		addToTrunk(p);
		before_cash = cash;
		cash = cash - p.getPrice();
	}

	void buyAll() {
		before_cash = cash;

		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				return;
			}
			if (!(cash >= cart[i].getPrice())) {
				return;
			}

			addToTrunk(cart[i]);
			cash = cash - cart[i].getPrice();
		}
	}

	void addToCart(Product p) {
		if (index >= max_index) {
			max_index = max_index * 2;

		}

		if (cart_index != 0) {
			cart[cart_index] = p;
		} else {
			cart[index] = p;
		}

		index++;
	}

	void addToTrunk(Product p) {
		if (trunk_index >= trunk_max_index) {
			trunk_max_index = trunk_max_index * 2;
		}

		trunk[trunk_index] = p;

		trunk_index++;
	}

	void viewCart() {
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) {
				return;
			}

			System.out.println(cart[i].getName());
		}
	}

	void viewTrunk() {
		for (int i = 0; i < trunk.length; i++) {
			if (trunk[i] == null) {
				return;
			}

			System.out.println(trunk[i].getName());
		}
	}

	void cancel(int cart_index) {
		cart[cart_index] = null;

		this.cart_index = cart_index;
	}

	void receipt() {
		int amount = 0;

		for (int i = 0; i < trunk.length; i++) {
			if (trunk[i] != null) {
				amount = amount + trunk[i].getPrice();
			}
		}

		System.out.println("사용 금액 : " + amount);
		System.out.println("남음 금액 : " + (before_cash - amount));

	}
}

class Product {

	String name;
	private int price;

	public Product(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

class Coffee extends Product {
	public Coffee(String name) {
		this(0, name);
	}

	public Coffee(int price, String name) {
		super(price);

		this.name = name;
	}
}
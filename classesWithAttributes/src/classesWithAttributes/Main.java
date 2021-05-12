package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "Laptop", "Asus Laptop", 5000, 3, "Siyah");

		Product product2 = new Product();
		product2.set_name("Laptop");
		product2.setId(2);
		product2.set_description("Casper Nirvana");
		product2.set_price(6000);
		product2.set_stockAmount(5);
		product2.set_renk("Siyah");

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
		productManager.add(product2);
		System.out.println(product2.getKod());

	}

}

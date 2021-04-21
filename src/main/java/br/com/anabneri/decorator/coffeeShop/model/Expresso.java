package br.com.anabneri.decorator.coffeeShop.model;

public class Expresso implements Drink {

	@Override
	public void serve() {
		System.out.println("- Adding 50ml of expresso");
	}

	@Override
	public Double getPrice() {
		return 1.5d;
	}

}

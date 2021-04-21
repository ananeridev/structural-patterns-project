package br.com.anabneri.decorator.coffeeShop.model;

public class Tea implements Drink {

	@Override
	public void serve() {
		System.out.println("- Adding 100ml of tea");
	}

	@Override
	public Double getPrice() {
		return 1d;
	}

	
}

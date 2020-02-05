package com.epam.oop;

public class Chocolate implements Comparable<Chocolate> {
	
	private String name;
	private int price;
	private int weight;

	public Chocolate(String name,int price,int weight) {
		
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	
	public String getName(String name) {
		return name;
	}
	
	public int getPrice(int price) {
		return price;
	}
	
	public int getWeight(int weight) {
		return weight;
	}
	
	@Override
    public int compareTo(Chocolate o) {
        if(o.price > price)
            return 1;
        if(o.price < price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "'" + name + "'" +", Price = Rs." + price +", Weight = " + weight +"gms";
    }

}

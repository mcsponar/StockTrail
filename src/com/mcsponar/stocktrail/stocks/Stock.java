package com.mcsponar.stocktrail.stocks;

public class Stock {

	private String symbol;
	private String currency;
	private String market;
	
	public Stock() {
		this.symbol = "";
		this.currency = "";
		this.market = "";
	}
	
	public Stock(String symbol, String currency, String market) {
		this.symbol = symbol;
		this.currency = currency;
		this.market = market;
	}

	@Override
	public String toString() {
		return String.format("Symbol: %1$s Currency: %2$s Market: %3$s", symbol, currency, market);
	};
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getMarket() {
		return market;
	}
	public void setMarket(String market) {
		this.market = market;
	}
	
	
}

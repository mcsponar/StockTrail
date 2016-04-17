package com.mcsponar.stocktrail.stocks;

public class StubGetStocksService implements GetStocksService {

	@Override
	public Stock[] GetStocks() {
		return new Stock[] {
				new Stock("A", "USD", "NASDAQ"),
				new Stock("B", "USD", "NAXDAQ"),
				new Stock("C", "USD", "S&P500")
		};
	}

}

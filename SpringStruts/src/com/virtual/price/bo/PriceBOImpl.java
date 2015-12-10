package com.virtual.price.bo;

import com.virtual.price.exception.PriceBusinessException;
import com.virtual.price.to.Price;

public class PriceBOImpl implements PriceBO {

	@Override
	public Price findPriceByTpnb(String tpnb) throws PriceBusinessException {
		Price price = new Price();

		if (tpnb != null && tpnb.startsWith("0")) {
			price.setRegPrice("150.5");
		} else {
			price.setRegPrice("0");
		}

		return price;
	}

}

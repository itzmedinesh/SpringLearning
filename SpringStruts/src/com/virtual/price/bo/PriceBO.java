package com.virtual.price.bo;

import com.virtual.price.exception.PriceBusinessException;
import com.virtual.price.to.Price;

public interface PriceBO {
	public Price findPriceByTpnb(String tpnb) throws PriceBusinessException;
}

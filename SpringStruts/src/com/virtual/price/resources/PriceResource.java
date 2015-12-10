package com.virtual.price.resources;

import com.opensymphony.xwork2.ActionSupport;
import com.virtual.price.bo.PriceBO;
import com.virtual.price.to.Product;

@SuppressWarnings("serial")
public class PriceResource extends ActionSupport {

	private PriceBO priceBO;

	private Product product;

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setPriceBO(PriceBO priceBO) {
		this.priceBO = priceBO;
	}

	@Override
	public String execute() throws Exception {
		if (priceBO.findPriceByTpnb(product.getTpnb()) != null) {
			return SUCCESS;
		}
		return ERROR;
	}
}

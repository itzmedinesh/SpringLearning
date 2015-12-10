package com.virtual.price.resources;

import com.opensymphony.xwork2.ActionSupport;
import com.virtual.price.bo.PriceBO;
import com.virtual.price.to.Price;
import com.virtual.price.to.Product;

@SuppressWarnings("serial")
public class PriceResource extends ActionSupport {

	private PriceBO priceBO;

	private Product product;

	private Price price;

	public void setPrice(Price price) {
		this.price = price;
	}

	public Price getPrice() {
		return price;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void setPriceBO(PriceBO priceBO) {
		this.priceBO = priceBO;
	}

	@Override
	public String execute() throws Exception {
		Price prc = priceBO.findPriceByTpnb(product.getTpnb());
		if (prc != null) {
			System.out.println("Valid price received...");
			this.setPrice(prc);
			return SUCCESS;
		}
		return ERROR;
	}
}

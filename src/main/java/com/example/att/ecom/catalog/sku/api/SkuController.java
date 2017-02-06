package com.example.att.ecom.catalog.sku.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.att.catalog.product.api.Product;

@RestController
public class SkuController {

	@Autowired
	private SkuService skuService;


	@RequestMapping(method = RequestMethod.GET, value = "/skus")
	public List<Sku> getAllSkus() {
		return skuService.getAllSkus();

	}

	@RequestMapping(method = RequestMethod.GET, value = "/products/{skuid}")
	public Sku getSku(@PathVariable String skuid) {
		return skuService.getSku(skuid);
	}


	@RequestMapping(method = RequestMethod.POST, value = "/{productId}/skus")
	public void addSku(@PathVariable String productId,@RequestBody Sku pSku) {
		pSku.setProduct(new Product(productId,""));
		skuService.addSku(pSku);

	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/skus")
	public void modifysKU(@RequestBody Sku pSku) {
				skuService.modifySku(pSku);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/skus")
	public void deletesKU(@RequestBody Sku PsKU) {
		skuService.deleteSku(PsKU);
	}

}

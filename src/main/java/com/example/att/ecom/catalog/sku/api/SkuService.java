package com.example.att.ecom.catalog.sku.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.att.catalog.product.api.ProductRepository;

@Component
public class SkuService {
	
	@Autowired
	private SkuRepository skuReposiotry;

	public List<Sku> getAllSkus() {
		List<Sku> skus = new ArrayList<>();
		skuReposiotry.findAll().iterator().forEachRemaining(skus::add);
		return skus;

	}

	public Sku getSku(@PathVariable String skuId) {
		Sku  result=skuReposiotry.findOne(skuId);
		return result;
	}

	public void addSku(Sku pSku) {
		skuReposiotry.save(pSku);

	}
	
	public void modifySku(Sku pSku) {
		
		skuReposiotry.save(pSku);
	}

	public void deleteSku(Sku pSku) {
		skuReposiotry.delete(pSku);
	}
}

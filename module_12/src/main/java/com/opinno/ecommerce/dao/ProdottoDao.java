package com.opinno.ecommerce.dao;

import com.opinno.ecommerce.entity.Prodotto;

import java.util.List;


public interface ProdottoDao {
	
	public Prodotto insert(Prodotto p);
	public Prodotto update(Prodotto p);
	public boolean delete(long id);
	public Prodotto get(long id);
	public List<Prodotto> getAll();
	
}

package com.opinno.ecommerce.service;

import com.opinno.ecommerce.dao.ProdottoDao;
import com.opinno.ecommerce.entity.Prodotto;

import java.util.ArrayList;
import java.util.List;


public class ProdottoService {
	
	private ProdottoDao prodottoDao;
	public ProdottoService(ProdottoDao prodottoDao) {
		this.prodottoDao = prodottoDao;
	}
	
	public Prodotto aggiungi(Prodotto p) throws RuntimeException {
		Prodotto prodottoCreato = prodottoDao.insert(p);
		if(prodottoCreato == null)
			throw new RuntimeException("Prodotto non creato");
		return prodottoCreato;
	}
	
	
	public void acquista(Prodotto p, int qty) throws RuntimeException {
		if(qty <= 0)
			throw new RuntimeException("La quantit� richiesta deve essere maggiore di 0");
		Prodotto prodotto = prodottoDao.get(p.getId());
		if(prodotto == null) 
			throw new RuntimeException("prodotto non trovato");
		if(prodotto.getQty() < qty)
			throw new RuntimeException("La quantit� che si richiede � maggiore di quella disponibile");
		//aggiorno la quantit� e poi lo aggiorno
		prodotto.setQty(prodotto.getQty() - qty);
		//true se l'aggiornamento � andato a buon fine
		if(prodottoDao.update(prodotto) == null)
			throw new RuntimeException("impossibile acquistare il prodotto");
	}
	public void elimina(long id) throws RuntimeException {
		if(id <= 0)
			throw new RuntimeException("L'id deve essere maggiore di 0");
		if(!prodottoDao.delete(id))
			throw new RuntimeException("Impossibile cancellare il prodotto");
	}
	public Prodotto get(long id) throws RuntimeException{
		if(id <= 0)
			throw new RuntimeException("id deve essere un numero maggiore di 0");
		Prodotto p = prodottoDao.get(id);
		if(p == null)
			throw new RuntimeException("prodotto non trovato");
		return p;
	}
	public List<Prodotto> getProdottiDisponibili() {
		return prodottoDao.getAll();
	}
}

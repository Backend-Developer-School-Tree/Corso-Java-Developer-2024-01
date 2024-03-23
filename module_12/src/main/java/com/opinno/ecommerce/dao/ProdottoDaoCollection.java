package com.opinno.ecommerce.dao;

import com.opinno.ecommerce.entity.Prodotto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class ProdottoDaoCollection implements ProdottoDao{
	private Set<Prodotto> prodotti;
	//utilizzo come indice per avere id univoci
	private long id;
	public ProdottoDaoCollection() {
		prodotti = new HashSet<Prodotto>();
		id = 0;
	}
	public Prodotto insert(Prodotto p) {
		id++;
		prodotti.add(p);
		//imposto l'id perch� l'id viene generato dalla persistenza
		p.setId(id);
		return p;
	}
	public Prodotto update(Prodotto p) {
		for(Prodotto pTmp : prodotti)
			if(p.getId() == pTmp.getId()) {
				setData(pTmp, p);
				//restituisco l'oggetto aggiornato
				return pTmp;
			}
		//se non trovo l'oggetto restituisco null. Questo lo devo gestire nel service
		return null;
	}
	private void setData(Prodotto vecchio, Prodotto nuovo) {
		vecchio.setDescrizione(nuovo.getDescrizione());
		vecchio.setNome(nuovo.getNome());
		vecchio.setPrezzo(nuovo.getPrezzo());
		vecchio.setQty(nuovo.getQty());
	}
	public boolean delete(long id) {
		Iterator<Prodotto> iterator = prodotti.iterator();
		while(iterator.hasNext()) {
			Prodotto p = iterator.next();
			if(p.getId() == id) {
				iterator.remove();
				return true;
			}
		}
		//non ho trovato l'id da cancellare
		return false;
	}
	public Prodotto get(long id) {
		for(Prodotto p: prodotti)
			if(p.getId() == id)
				return p;
		return null;
	}
	public List<Prodotto> getAll() {
		List<Prodotto> lista = new ArrayList<Prodotto>();
		for(Prodotto p : prodotti)
			if(p.getQty() > 0)
				lista.add(p);
		return lista;
	}
	
}

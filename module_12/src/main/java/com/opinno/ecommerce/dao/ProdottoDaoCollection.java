package miniEcommerce.dao;

import java.util.*;

import miniEcommerce.entity.Prodotto;

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
		//imposto l'id perché l'id viene generato dalla persistenza
		p.setId(id);
		return p;
	}
	public Optional<Prodotto> update(Prodotto p) {
		for(Prodotto pTmp : prodotti)
			if(p.getId() == pTmp.getId()) {
				setData(pTmp, p);
				//restituisco l'oggetto aggiornato
				return Optional.of(pTmp);
			}
		//se non trovo l'oggetto restituisco null. Questo lo devo gestire nel service
		return Optional.empty();
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
	public Optional<Prodotto> get(long id) {
		for(Prodotto p: prodotti)
			if(p.getId() == id)
				return Optional.of(p);
		return Optional.empty();
	}
	public List<Prodotto> getAll() {
		List<Prodotto> lista = new ArrayList<Prodotto>();
		for(Prodotto p : prodotti) {
			//if(p.getQty() > 0)
			//	lista.add(p);
			if(prodottiDisponibili(p)){
				lista.add(p);
			}
		}
		return lista;
	}

	private boolean prodottiDisponibili(Prodotto p){
		return Optional.ofNullable(p)
			.map(_p -> _p.getQty()) // estrapola la quantità per il prodotto
			.filter(quantita -> quantita > 0)  // verifico se la quantità è maggiore di zero
			.isPresent();
	}
}

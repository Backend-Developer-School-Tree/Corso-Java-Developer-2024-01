package miniEcommerce.service;

import java.util.ArrayList;
import java.util.List;

import miniEcommerce.dao.ProdottoDao;
import miniEcommerce.entity.Prodotto;

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
			throw new RuntimeException("La quantità richiesta deve essere maggiore di 0");
		Prodotto prodotto = prodottoDao.get(p.getId()).orElseThrow( () -> new RuntimeException("prodotto non trovato") );
		//if(prodotto == null)
		//	throw new RuntimeException("prodotto non trovato");
		if(prodotto.getQty() < qty)
			throw new RuntimeException("La quantità che si richiede è maggiore di quella disponibile");
		//aggiorno la quantità e poi lo aggiorno
		prodotto.setQty(prodotto.getQty() - qty);
		//true se l'aggiornamento è andato a buon fine

		if(prodottoDao.update(prodotto).isEmpty()){
			throw new RuntimeException("impossibile acquistare il prodotto");
		}
		//if(prodottoDao.update(prodotto) == null)
		//	throw new RuntimeException("impossibile acquistare il prodotto");
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
		Prodotto p = prodottoDao.get(id).orElseThrow(()-> new RuntimeException("prodotto non trovato"));
		//if(p == null)
		//	throw new RuntimeException("prodotto non trovato");
		return p;
	}
	public List<Prodotto> getProdottiDisponibili() {
		return prodottoDao.getAll();
	}
}

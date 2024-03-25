package miniEcommerce.dao;

import java.util.List;
import java.util.Optional;

import miniEcommerce.entity.Prodotto;

public interface ProdottoDao {
	
	public Prodotto insert(Prodotto p);
	public Optional<Prodotto> update(Prodotto p);
	public boolean delete(long id);
	public Optional<Prodotto> get(long id);
	public List<Prodotto> getAll();
	
}

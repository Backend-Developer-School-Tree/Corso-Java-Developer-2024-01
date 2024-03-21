package com.opinno.esercizi.mini_ecommerce.service;

import com.opinno.esercizi.mini_ecommerce.dao.ProdottoDao;
import com.opinno.esercizi.mini_ecommerce.model.Prodotto;

import java.util.List;

public class ProdottoService
{
    ProdottoDao dao;

    public List<Prodotto> elencoProdotti()
    {
        // TODO recuperare i prodotti dal DAO
        return List.of(new Prodotto(0, "Cuffie"), new Prodotto(1, "Caricatore"));
    }

    /*
    public void acquista(Prodotto p, int quantita) {
        // 1. controllo che il prodotto esista
        // 2. SE esiste --> controllo che è disponibile (quantita > 0)
        // 3. SE disponibile --> effettuare l'acquisto --> quantita-1 nel Database (o file o collection che sia)
        p.setQuantita(p.getQuantita() - quantita);
        dao.updateProdotto(p);
    }
     */
}

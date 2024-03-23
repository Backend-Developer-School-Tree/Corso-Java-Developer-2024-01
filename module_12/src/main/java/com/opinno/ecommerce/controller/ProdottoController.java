package com.opinno.ecommerce.controller;


import static spark.Spark.*;

import com.google.gson.Gson;
import com.opinno.ecommerce.entity.Prodotto;
import com.opinno.ecommerce.service.ProdottoService;

public class ProdottoController {
	private ProdottoService prodottoService;
	
	public ProdottoController(ProdottoService prodottoService) {
		this.prodottoService = prodottoService;
		initService();
	}
	
	private void initService() {
		//restituisce la lista di tutti prodotti disponibili. Ovvero quelli cui qty � > di 0
		get("/products", (req, res) -> {
			
			return new Gson().toJson(prodottoService.getProdottiDisponibili());
		});
		get("/product/:id", (req, res) -> {
			try {
				Long id = Long.parseLong(req.params("id"));
				Prodotto p = prodottoService.get(id);
				
				return new Gson().toJson(p);
			} catch(NumberFormatException e) {
				return "Id deve essere un numero";
			} catch(RuntimeException e) {
				return e.getMessage();
			}
			
		});
		post("/product", (req, res) -> {
			Prodotto p = new Gson().fromJson(req.body(), Prodotto.class);
			Prodotto newProdotto = prodottoService.aggiungi(p);
			return new Gson().toJson(newProdotto);
		});
		
		put("/product/:qty", (req, res) -> {
			try {
				Integer qty = Integer.parseInt(req.params("qty"));
				Prodotto p = new Gson().fromJson(req.body(), Prodotto.class);
				prodottoService.acquista(p, qty);
				return "Prodotto acuistato correttamente";
			}catch(NumberFormatException e) {
				return "Quantit� deve essere un numero";
			} catch(RuntimeException e) {
				return e.getMessage();
			}
			
		});
		
		put("/product", (req, res) -> {
			try {
				Integer qty = Integer.parseInt(req.queryParams("qty"));
				Long productId = Long.parseLong(req.queryParams("pId"));
				Prodotto p = new Gson().fromJson(req.body(), Prodotto.class);
				prodottoService.acquista(p, qty);
				return "Prodotto acuistato correttamente";
			}catch(NumberFormatException e) {
				return "Quantit� deve essere un numero";
			} catch(RuntimeException e) {
				return e.getMessage();
			}
			
		});
		
//		put("/product/:pId/:qty", (req, res) -> {
//			try {
//				Integer qty = Integer.parseInt(req.params("qty"));
//				Long productId = Long.parseLong(req.params("pId"));
//				Prodotto p = new Gson().fromJson(req.body(), Prodotto.class);
//				prodottoService.acquista(p, qty);
//				return "Prodotto acuistato correttamente";
//			}catch(NumberFormatException e) {
//				return "Quantit� deve essere un numero";
//			} catch(RuntimeException e) {
//				return e.getMessage();
//			}
//			
//		});
		delete("/product/:productId", (req, res) -> {
			try {
				Long id = Long.parseLong(req.params("productId"));
				prodottoService.elimina(id);
				return "Prodotto cancellato correttamente";
			} catch(NumberFormatException e) {
				return "Id deve essere un numero";
			}catch(RuntimeException e) {
				return e.getMessage();
			}
		});
	}
}

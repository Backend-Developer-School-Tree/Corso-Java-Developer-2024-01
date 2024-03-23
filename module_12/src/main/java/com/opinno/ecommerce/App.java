package com.opinno.ecommerce;


import com.opinno.ecommerce.controller.ProdottoController;
import com.opinno.ecommerce.dao.ProdottoDao;
import com.opinno.ecommerce.dao.ProdottoDaoSql;
import com.opinno.ecommerce.service.ProdottoService;

public class App {
	public static void main(String args[]) {
		ProdottoDao prodottoDao = new ProdottoDaoSql();
		ProdottoService prodottoService = new ProdottoService(prodottoDao);
		
		ProdottoController prodottoController = new ProdottoController(prodottoService);
	}
}

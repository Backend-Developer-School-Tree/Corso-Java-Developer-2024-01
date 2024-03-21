package com.opinno.mini_ecommerce.controller;

import com.google.gson.Gson;
import com.opinno.mini_ecommerce.model.Prodotto;
import com.opinno.mini_ecommerce.service.ProdottoService;
import com.opinno.spark.controller.utility.HttpResponse;

import java.util.List;

import static spark.Spark.*;

public class ProdottoController
{
    // mappiamo ogni funzionalità dell'applicazione
    // (ovvero ogni metodo del Service)
    // ad un API HTTP o endpoint
    // es. http://localhost:4567/acquistaProdotto --> acquista(Prodotto, int)

    // attributo per utilizzare i metodi del service
    ProdottoService service = new ProdottoService();

    public void startWebServices()
    {
        // definiamo tutti gli endpoint

        // 1. GET elenco prodotti
        // service.elencoProdotti() --> http://localhost:4567/products

        // primo parametro "/products" -- http://localhost:4567/products
        get("/products", (req, res) -> {
            // recupero i prodotti dal Service
            List<Prodotto> prodottiDisponibili = service.elencoProdotti();
            // ritornare i dati come JSON
            HttpResponse response = new HttpResponse("200", new Gson().toJsonTree(prodottiDisponibili));

            // if (erroreX)
                // response = new HttpResponse("500", new Gson().toJsonTree("Errore perché Backend errore"));

            return new Gson().toJson(response);
        });
    }

    public static void main(String[] args) {
        new ProdottoController().startWebServices();
    }
}

package com.opinno.ecommerce.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class Prodotto {
	long id;
	@NonNull
	String nome;
	String descrizione;
	int qty;
	double prezzo;
}

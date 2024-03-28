package com.opinno.arcaderank_spring;

import com.opinno.arcaderank_spring.model.Player;
import com.opinno.arcaderank_spring.service.PlayerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OpinnoarcaderankspringApplicationTests {

	@Autowired
	PlayerService playerService;

	@BeforeEach
	void setUp(){

		System.out.println("***** Sono dentro il setup *****");
	}

	@Test
	void testServiceNotNull(){
		assertNotNull(playerService);
	}

	@Test
	void testServiceInsertRecord(){
		assertEquals(playerService.getAll().size(), 20);

		Player p = Player.builder().build();
		playerService.save(p);

		assertEquals(playerService.getAll().size(), 21);
	}

	@Test
	void testHelloWorld(){
		assertEquals(2,2);
	}

	@Test
	void testHelloWorld_fail(){
		assertNotEquals(2,3);
	}

	@Test
	void testHelloWorld_true(){
		assertTrue(2 == 2);
		assertFalse( (2+2) == 5 );
	}

}

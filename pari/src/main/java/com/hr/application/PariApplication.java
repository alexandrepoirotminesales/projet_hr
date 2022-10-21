package com.hr.application;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.hr.controller"})
public class PariApplication {

	public static void main(String[] args) {
		SpringApplication.run(PariApplication.class, args);
		Unirest.setTimeouts(0, 0);
		try {
			HttpResponse<String> response = Unirest.get("https://v3.football.api-sports.io/teams")
					.header("x-rapidapi-key", "5cdb777e63b915c3dc5e52466e9fe6b6")
					.header("x-rapidapi-host", "v3.football.api-sports.io")
					.queryString("season", "2022")
					.queryString("league", "61")
					.asString();

			System.out.println("/n voici la réponse http /n"+ response.getBody());

		} catch (UnirestException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
}

package com.example.API.REST;

import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class ApiRestApplication {

	public static void main(String[] args) {
/* 
		try {
			URL url = new URL("https://tienditaderopa/");

		    HttpURLConnection coneccion = (HttpURLConnection) url.openConnection();

    		coneccion.setRequestMethod("GET");
    	 	coneccion.connect();

    		int respuestaCodigo = coneccion.getResponseCode();

    		if(respuestaCodigo != 200)
    		{
    			throw new RuntimeException("ERROR " + respuestaCodigo);
    		}
    		else
    		{
    			StringBuilder informacionString = new StringBuilder();
    			Scanner scan = new Scanner(url.openStream());

    			while(scan.hasNext())
    			{
    				informacionString.append(scan.next());
    			}

    			scan.close();
    			System.out.println(informacionString);
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		SpringApplication.run(ApiRestApplication.class, args);
	}

}

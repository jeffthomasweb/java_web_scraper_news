package com.example.javascrape;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class JavascrapeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavascrapeApplication.class, args);
	}

	@GetMapping("/")
	public List<String> feed() throws IOException {
		List<String> results = new ArrayList<String>();
    		Document doc = Jsoup.connect("https://text.npr.org/1001").get();
		Elements links = doc.getElementsByTag("a");
		for (Element link : links) {
  			String linkText = link.text();
  			results.add(linkText);
			}
	 
		List<String> resultsFinal = new ArrayList<String>();
		
		resultsFinal = results.subList(1,21);
	
	return resultsFinal;
}
}

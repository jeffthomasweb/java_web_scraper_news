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
	 	String a = results.get(1);
	 	String b = results.get(2);
	 	String c = results.get(3);
	 	String d = results.get(4);
	 	String e = results.get(5);
	 	String f = results.get(6);
	 	String g = results.get(7);
	 	String h = results.get(8);
	 	String i = results.get(9);
	 	String j = results.get(10);
	 	String k = results.get(11);
	 	String l = results.get(12);
	 	String m = results.get(13);
	 	String n = results.get(14);
	 	String o = results.get(15);
	 	String p = results.get(16);
	 	String q = results.get(17);
	 	String r = results.get(18);
	 	String s = results.get(19);
		String t = results.get(20);
		List<String> resultsf = new ArrayList<String>();

	 	resultsf.add(b);
	 	resultsf.add(c);
	 	resultsf.add(d);
	 	resultsf.add(e);
	 	resultsf.add(f);
	 	resultsf.add(g);
	 	resultsf.add(h);
	 	resultsf.add(i);
	 	resultsf.add(j);
	 	resultsf.add(k);
	 	resultsf.add(l);
	 	resultsf.add(m);
	 	resultsf.add(n);
	 	resultsf.add(o);
	 	resultsf.add(p);
	 	resultsf.add(q);
	 	resultsf.add(r);
		resultsf.add(s);
		resultsf.add(t);
	return resultsf;
}
}

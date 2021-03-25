package com.example.demo;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	Reader reader;

	{
		try {
			reader = Files.newBufferedReader(Paths.get("/Users/cpattanaik/Downloads/demo 6/src/main/resources/PartnerAPI-Template1-Orders20190909115005.csv"));
			CSVReader csvReader = new CSVReader(reader);
			List<Attrib> beans = new CsvToBeanBuilder(reader)
					.withType(Attrib.class).build().parse();

			System.out.println("*************************************");
			System.out.println();
			System.out.println();
			System.out.println("DATA :"+beans);
			System.out.println();
			System.out.println();
			System.out.println("*************************************");

		} catch (IOException  e) {
			e.printStackTrace();
		}
	}



}

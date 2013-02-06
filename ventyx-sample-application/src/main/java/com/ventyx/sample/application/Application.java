package com.ventyx.sample.application;

import com.ventyx.sample.application.api.model.Country;
import com.ventyx.sample.application.api.model.Language;
import com.ventyx.sample.application.exception.LocationServiceException;
import com.ventyx.sample.application.service.LocationService;

import java.util.List;

/**
 * Sample console application for testing platform builds and tests
 */
public class Application {

    private static LocationService locationService = new LocationService();
    
    public static void main (String[] args) {

        List<Country> countries = locationService.getCountries();

        System.out.println("Starting display of country codes.");
        for (Country country : countries) {
            System.out.println("County code:  " + country.getCode() + "  Country name:  " + country.getName());
        }
        System.out.println("Completed display of country codes.");

        try {
            Country country = locationService.getCountry("US");
            System.out.println("Completed country lookup for County code:  " + country.getCode() + "  Country name:  " + country.getName());
        } catch (LocationServiceException ex) {
            ex.printStackTrace();
        }

        try {
            List<Language> languages = locationService.getLanguages("US");
            System.out.println("Starting display of language codes.");
            for (Language language : languages) {
                System.out.println("Language code:  " + language.getCode() + "  Language name:  " + language.getName());
            }
            System.out.println("Completed display of language codes.");

        } catch (LocationServiceException ex) {
            ex.printStackTrace();
            System.out.println("Something bad happened.");
        }

        System.out.println("Finished running console application.");
    }
}

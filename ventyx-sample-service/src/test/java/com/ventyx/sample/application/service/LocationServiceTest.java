package com.ventyx.sample.application.service;

import com.ventyx.sample.application.api.model.Country;
import com.ventyx.sample.application.api.model.Language;
import com.ventyx.sample.application.exception.LocationServiceException;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 *
 * Location service test
 *
 */

public class LocationServiceTest  {

    private LocationService locationService = new LocationService();

    @Test
    public void testGetCountries() throws Exception {

        List<Country> countries = locationService.getCountries();
        assertNotNull(countries);
        assertFalse(countries.isEmpty());
        assertTrue(countries.size() > 0);

        Country country = new Country();
        country.setCode("RU");
        country.setName("Russia");

        assertTrue(countries.contains(country));

        country = new Country();
        country.setCode("");
        country.setName("");

        assertFalse(countries.contains(country));

    }

    @Test
    public void testGetLanguages() throws Exception {

        try {
            locationService.getLanguages(null);
            fail("Invalid test case pass");
        } catch (LocationServiceException ex) {
            assertTrue(ex.getMessage().equals("A valid country code is required."));
        }

        try {
            locationService.getLanguages("");
            fail("Invalid test case pass");
        } catch (LocationServiceException ex) {
            assertTrue(ex.getMessage().equals("A valid country code is required."));
        }

        assertTrue(locationService.getLanguages("ZZZZZZZZZ") == null);

        List<Language> languages = locationService.getLanguages("US");
        assertNotNull(languages);
        assertTrue(!languages.isEmpty());

        languages = locationService.getLanguages("us");
        assertNotNull(languages);
        assertTrue(!languages.isEmpty());

        //test data for comparison
        Country unitedStates = new Country();
        unitedStates.setCode("US");
        unitedStates.setName("United States");

        Language english = new Language();
        english.setCode("en");
        english.setName("English");
        english.setCountry(unitedStates);

        assertTrue(languages.contains(english));


    }

    @Test
    public void testGetCountry() throws Exception {


        try {
            locationService.getCountry(null);
            fail("Invalid test case pass");
        } catch (LocationServiceException ex) {
            assertTrue(ex.getMessage().equals("A valid country code is required."));
        }

        try {
            locationService.getCountry("");
            fail("Invalid test case pass");
        } catch (LocationServiceException ex) {
            assertTrue(ex.getMessage().equals("A valid country code is required."));
        }

        assertTrue(locationService.getCountry("ZZZZZZZZZ") == null);

        Country country = locationService.getCountry("US");
        assertNotNull(country);

        country = locationService.getCountry("us");
        assertNotNull(country);

        //test data for comparison
        Country unitedStates = new Country();
        unitedStates.setCode("US");
        unitedStates.setName("United States");

        assertTrue(country.equals(unitedStates));
    }
}

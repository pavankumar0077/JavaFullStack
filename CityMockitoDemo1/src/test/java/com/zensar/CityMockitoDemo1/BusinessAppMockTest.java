package com.zensar.CityMockitoDemo1;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.Test;

public class BusinessAppMockTest {

	@Test(expected = NullPointerException.class)
	public void testBusinessApp() {
		CityService cityService = mock(CityService.class); // mock function internally creates stub class
		
		LoginService loginService = mock(LoginService.class);
		
		when(cityService.findCitiesByCountries("INDIA")).
		thenReturn(Arrays.asList("Pune", "Mumbai", "Delhi"));
		
		when(cityService.findCitiesByCountries("USA")).
		thenReturn(Arrays.asList("New York","Washigton"));
		
		when(cityService.findCitiesByCountries(anyString())).
				thenReturn(Arrays.asList("city1","city2","city3"));
		
		when(cityService.findCitiesByCountries("SWEDEN")).
		thenThrow(NullPointerException.class);
		
		BusinessApp businessApp = new BusinessApp(cityService, loginService);
//		assertEquals(businessApp.retrieveCityListByCountry("INDIA").size(), 3);
//		 assertEquals(businessApp.retrieveCityListByCountry("USA").size(), 3);
//		 assertEquals(businessApp.retrieveCityListByCountry("PAVAN").size(), 3);
		 assertEquals(businessApp.retrieveCityListByCountry("SWEDEN").size(), 3);
		 
		 equals(businessApp.login("Pavan", "98983984234"));

	}

}

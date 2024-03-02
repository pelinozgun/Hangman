
import java.util.Random;
import java.util.*;
import java.util.List;

public class CitiesAndCountries {
	
	  private String hidden_cities_countries;
	  private String hidden_cities_countriesIntermediate;
	  private String hidden_cities_countriesHardest;
	  private String hidden_hint;
	  private String hidden_hintIntermediate;
	  private String hidden_hintHardest;
	
	    
	    
		Random generator= new Random();
		
		List<String> easycities_countries;
	    List<String> intermediatecities_countries;
	    List<String> hardestcities_countries;
		
		//constructor produces 3 levels array list such as easycities_countries, intermediatecities_countries and hardestcities_countries
		public CitiesAndCountries() {
		 easycities_countries=new ArrayList();
		 intermediatecities_countries=new ArrayList();
		 hardestcities_countries=new ArrayList();
		
		}
	   
		// sets city and country names
	    public void setEasycities_countries() {
	    	
	    	easycities_countries.add("turkey");
	    	easycities_countries.add("italy");
	    	easycities_countries.add("france");
	    	easycities_countries.add("paris");
	    	easycities_countries.add("istanbul");
	    	easycities_countries.add("rome");
	    	easycities_countries.add("ankara");
	    	easycities_countries.add("azerbaijan");
	    	easycities_countries.add("hong kong");
	    	easycities_countries.add("mexico");
	    	easycities_countries.add("germany");
	    	easycities_countries.add("the united kingdom");
	    	easycities_countries.add("london");
	    	easycities_countries.add("canada");
	    	easycities_countries.add("vienna");
	    	easycities_countries.add("madrid");
	    	easycities_countries.add("beijing");
	    	easycities_countries.add("dubai");
	    	easycities_countries.add("miami");
	    	easycities_countries.add("milan");
	    	
	    	
	    }
	
	    //randomly select a city or country related word from the easy category
	    public String selectEasyCities_countries() {
	    	setEasycities_countries();
	    	int index=generator.nextInt(easycities_countries.size());
	    	hidden_cities_countries= easycities_countries.get(index);
	    	return hidden_cities_countries;
	    	
	    }
	    
	    
        public void setIntermediatecities_countries() {
	    	
	    	intermediatecities_countries.add("venice");
	    	intermediatecities_countries.add("brasil");
	    	intermediatecities_countries.add("seoul");
	    	intermediatecities_countries.add("moscow");
	    	intermediatecities_countries.add("sao paulo");
	    	intermediatecities_countries.add("budapest");
	    	intermediatecities_countries.add("singapore");
	    	intermediatecities_countries.add("baku");
	    	intermediatecities_countries.add("casablanca");
	    	intermediatecities_countries.add("abu dhabi");
	    	intermediatecities_countries.add("shanghai");
	    	intermediatecities_countries.add("chicago");
	    	intermediatecities_countries.add("copenhagen");
	    	intermediatecities_countries.add("san francisco");
	    	intermediatecities_countries.add("cyprus");
	    	intermediatecities_countries.add("izmir");
	    	intermediatecities_countries.add("antalya");
	    	intermediatecities_countries.add("prague");
	    	intermediatecities_countries.add("athens");
	    	intermediatecities_countries.add("vatican");
	    		
	    }
		
        //randomly select a city or country related word from the intermediate category
	    public String selectIntermediateCities_countries() {
	    	setIntermediatecities_countries();
	    	int index=generator.nextInt(intermediatecities_countries.size());
	    	hidden_cities_countriesIntermediate=intermediatecities_countries.get(index);
	    	return hidden_cities_countriesIntermediate;
	    	
	    }
	    
	    
        public void setHardestcities_countries() {
	    	
	    	hardestcities_countries.add("uruguay");
	    	hardestcities_countries.add("argentina");
	    	hardestcities_countries.add("bahrain");
	    	hardestcities_countries.add("egypt");
	    	hardestcities_countries.add("bangkok");
	    	hardestcities_countries.add("buenos aires");
	    	hardestcities_countries.add("johannesburg");
	    	hardestcities_countries.add("lisbon");
	    	hardestcities_countries.add("sydney");
	    	hardestcities_countries.add("melbourne");
	    	hardestcities_countries.add("portugal");
	    	hardestcities_countries.add("montreal");
	    	hardestcities_countries.add("brussels");
	    	hardestcities_countries.add("bayburt");
	    	hardestcities_countries.add("nevsehir");
	    	hardestcities_countries.add("venezuela");
	    	hardestcities_countries.add("cambodia");
	    	
	    		
	    }
		
       //randomly select a city or country related word from the hardest category
	    public String selectHardestCities_countries() {
	    	setHardestcities_countries();
	    	int index=generator.nextInt(hardestcities_countries.size());
	    	hidden_cities_countriesHardest= hardestcities_countries.get(index);
	    	return hidden_cities_countriesHardest;
	    	
	    }
	    
	    //matches hints with city and country
	    public void setEasycities_countriesHint() {
	    	if(hidden_cities_countries.equalsIgnoreCase("turkey"))
	    		hidden_hint="The country where Atatürk was the founder";
	    	else if(hidden_cities_countries.equalsIgnoreCase("italy"))
	    		hidden_hint="A place known for its food and the tower of Pisa tower";
	    	else if(hidden_cities_countries.equalsIgnoreCase("france"))
	    		hidden_hint="The country that hosts many historical buildings from the Eiffel Tower to Notre Dame Cathedral";
	    	else if(hidden_cities_countries.equalsIgnoreCase("paris"))
	    		hidden_hint="It is called the city of lovers";
	    	else if(hidden_cities_countries.equalsIgnoreCase("istanbul"))
	    		hidden_hint="It is the city that connects the continents of Asia and Europe";
	    	else if(hidden_cities_countries.equalsIgnoreCase("rome"))
	    		hidden_hint="Known as the capital of the world";
	    	else if(hidden_cities_countries.equalsIgnoreCase("azerbaijan"))
	    		hidden_hint="A country whose currency is the Manat";
	    	else if(hidden_cities_countries.equalsIgnoreCase("hong Kong"))
	    		hidden_hint="It is the city that has the Big Buddha statue";
	    	else if(hidden_cities_countries.equalsIgnoreCase("ankara"))
	    		hidden_hint="It is the capital of Turkey";
	    	else if(hidden_cities_countries.equalsIgnoreCase("mexico"))
	    		hidden_hint="The Federal Republic is located in the southern half of North America";
	    	else if(hidden_cities_countries.equalsIgnoreCase("Germany"))
	    		hidden_hint="Country famous for Oktoberfest";
	    	else if(hidden_cities_countries.equalsIgnoreCase("the United Kigdom"))
	    		hidden_hint="The country that drinks the most tea in the world";
	    	else if(hidden_cities_countries.equalsIgnoreCase("london"))
	    		hidden_hint="A city famous for Buckingham Palace";
	    	else if(hidden_cities_countries.equalsIgnoreCase("canada"))
	    		hidden_hint="Also known as the land of dinosaurs";
	    	else if(hidden_cities_countries.equalsIgnoreCase("vienna"))
	    		hidden_hint="It is the most populous city in Austria";
	    	else if(hidden_cities_countries.equalsIgnoreCase("madrid"))
	    		hidden_hint="Is the capital of Spain";
	    	else if(hidden_cities_countries.equalsIgnoreCase("beijing"))
	    		hidden_hint="A place famous for Peking duck";
	    	else if(hidden_cities_countries.equalsIgnoreCase("dubai"))
	    		hidden_hint="The highest build on the earth";
	    	else if(hidden_cities_countries.equalsIgnoreCase("miami"))
	    		hidden_hint="The city whose most famous street is Ocean Drive";
	    	else if(hidden_cities_countries.equalsIgnoreCase("milan"))
	    		hidden_hint="The city is famous for fashion andÂ architecture.";
	    }
	     
	    // gets correct hint
	    public String getEasycities_countriesHint() {
	    	setEasycities_countriesHint();
	    	
	    	return hidden_hint;
	    }

	    
	    public void setIntermediatecities_countriesHint() {
	    	if(hidden_cities_countriesIntermediate.equalsIgnoreCase("venice"))
	    		hidden_hintIntermediate="A city famous for its gondolas";
	    	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("brasil"))
	    		hidden_hintIntermediate="The country known for the Rio Carnival";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("seoul"))
	        	hidden_hintIntermediate="It is known for being the 13th most populous city in the world with its population.";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("moscow"))
	    		hidden_hintIntermediate="The city with the Red Square, the starting point of all its main streets";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("sao paulo"))
	        	hidden_hintIntermediate="Famous place for sao bento monastery";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("budapest"))
	    		hidden_hintIntermediate="The country known for Turo Rudi Chocolate";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("singapore"))
	        	hidden_hintIntermediate="The world's 4th largest financial center, 2nd casino gambling center and 3rd oil refining center";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("Baku"))
	        		hidden_hintIntermediate="A city located in the middle of the Caspian Sea";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("casablanca"))
	            	hidden_hintIntermediate="Place meaning white house in spanish";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("abu dhabi"))
	            	hidden_hintIntermediate="Where is Al Ain Zoo";
	        else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("shanghai"))
	        	hidden_hintIntermediate="Largest city in china";
	     	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("chicago"))
	     		hidden_hintIntermediate="The city ranked fifth among the most entertaining cities in America";
	     	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("Copenhagen"))
	     		hidden_hintIntermediate="capital of denmark";
	     	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("san francisco"))
	     		hidden_hintIntermediate="Where Silicon Valley is";
	     	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("cyprus"))
	     		hidden_hintIntermediate="Turkey's baby homeland";
	     	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("izmir"))
	     		hidden_hintIntermediate="The city famous for its clock tower and Boyoz";
	    	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("athens"))
	    		hidden_hintIntermediate="The place that is famous for Kokoretsi";
	    	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("antalya"))
	    		hidden_hintIntermediate="The city with the famous KaleiÃ§i";
	    	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("prague"))
	    		hidden_hintIntermediate="The place that is famous for its historicalÂ bridge";
	    	else if(hidden_cities_countriesIntermediate.equalsIgnoreCase("vatican"))
	    		hidden_hintIntermediate="Where the basilica of Pietro is located";
	    }
	     
	    
	    public String getIntermediatecities_countriesHint() {
	    	setIntermediatecities_countriesHint();
	    	return hidden_hintIntermediate;
	    }

	    
	    public void setHardestcities_countriesHint() {
	    	if(hidden_cities_countriesHardest.equalsIgnoreCase("uruguay"))
	    		hidden_hintHardest="What country means river of painted birds";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("argentina"))
	    		hidden_hintHardest="The country famous for tango";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("bahrain"))
	    		hidden_hintHardest="Where the island of Amwaj is located";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("egypt"))
	    		hidden_hintHardest="The place that is Sharm el-Sheikh located";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("bangkok"))
	    		hidden_hintHardest="The place is the Chao phyaraÂ river";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("buenos aires"))
	    		hidden_hintHardest="The place that is the capital of Argentina";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("johannesburg"))
	    		hidden_hintHardest="The place that is the largest city of the republic ofÂ SouthÂ Africa";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("lisbon"))
	    		hidden_hintHardest="The place that is the Palacio das EspeciariasÂ located";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("sydney"))
	    		hidden_hintHardest="The place that is Bondi Beach located";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("melbourne"))
	    		hidden_hintHardest="It is the second largest city in Australia";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("portugal"))
	    		hidden_hintHardest="The country where the Barcelos rooster isÂ famous";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("montreal"))
	    		hidden_hintHardest="The place that is the Parc du Mont-Royal located";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("brussels"))
	    		hidden_hintHardest="The location of the Grand Place, its most famous and lively square";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("bayburt"))
	    		hidden_hintHardest="The city whose wire halva isÂ famous";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("nevsehir"))
	    		hidden_hintHardest="Another name of Cappadocia";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("venezuela"))
	    		hidden_hintHardest="The place with the best cocoa in the world when evaluated internationally";
	    	else if(hidden_cities_countriesHardest.equalsIgnoreCase("cambodia"))
	    		hidden_hintHardest="It is a country in Southeast Asia located in the southeastern part of the Indochina Peninsula.";
	        
	    }
	     
	    
	    public String getHardestcities_countriesHint() {
	    	setHardestcities_countriesHint();
	    	return hidden_hintHardest;
	    }
	    
		
	}


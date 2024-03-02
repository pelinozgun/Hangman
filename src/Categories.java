import java.util.Random;

public abstract class Categories {
	
	protected static int gold=5;
	 
	protected static String hiddenVoc;
	
	public static String getHiddenVoc() {
		return hiddenVoc;
	}

// inherited methods
	
	public abstract String selectCities_Countries();
	public abstract String selectHintCities_Countries();
	
	public abstract String selectCarBrands();	
	public abstract String selectHintCarBrands();
	
	public abstract String selectFootballTeams();
	public abstract String selectHintFootballTeams();
	
	public abstract String selectGoods();	
	public abstract String selectHintGoods();
	
	}
		
		
    // child class of Categories
	class EASY extends Categories{
		
		Random generator= new Random();
	    
	    private String hidden_cities_countries;
	    private String hidden_carbrand;
	    private String hidden_footballteams;
	    private String hidden_goods;
		private String hidden_hint;
		 
		
		// aggregation
		//creating objects from whole classes
		CitiesAndCountries obj1 = new CitiesAndCountries();
		FootballTeam obj2 = new FootballTeam();
		CarBrands obj3 = new CarBrands();
		Goods obj4 = new Goods();
		
		
		
		// gets easy city and country from CitiesAndCountries class
			private String getcities_countries() {
				hidden_cities_countries=obj1.selectEasyCities_countries();
				return hidden_cities_countries;
			}
			
			
			// it assigns the hidden city and country to hidden vocabulary 
			@Override
			public String selectCities_Countries() {
				 getcities_countries();
				 hiddenVoc=hidden_cities_countries;
		    	return hiddenVoc;
			}
			

            // gets the chosen cities and countries hint
			@Override
			public String selectHintCities_Countries() {
				hidden_hint=obj1.getEasycities_countriesHint();
				
				return hidden_hint;
			}

		
			// gets easy football team from FootballTeam class
			private String getFootballTeam() {
				hidden_footballteams=obj2.selectEasyFootballTeam();
				return hidden_footballteams;
			}
			
			// it assigns the hidden football team to hidden vocabulary 
			@Override
			public String selectFootballTeams() {
				getFootballTeam();
				hiddenVoc=hidden_footballteams;
				return hiddenVoc;
			}
			
			 // gets the chosen football team hint
			@Override
			public String selectHintFootballTeams() {
			hidden_hint=obj2.getEasyfootballTeamHint();
				return hidden_hint;
			}
			
			// gets easy car brand from CarBrands class
			private String getCarBrands(){
				hidden_carbrand=obj3.selectEasyCar();
				return hidden_carbrand;
			}
			
			// it assigns the hidden car brand to hidden vocabulary 
			@Override
			public String selectCarBrands() {
				getCarBrands();
			hiddenVoc=hidden_carbrand;
				return hiddenVoc;
			}
		
			// gets the chosen car brands hint
			@Override
			public String selectHintCarBrands() {
				hidden_hint=obj3.getEasycarHint();
				return hidden_hint;
			}

			// gets easy good from Goods class
			private String getGoods() {
				hidden_goods=obj4.selectEasyGoods();
				return hidden_goods;
			}
						
						
			// it assigns the hidden good to hidden vocabulary 
			@Override
			public String selectGoods() {
				 getGoods();
				 hiddenVoc=hidden_goods;
			     return hiddenVoc;
			}
						

		   // gets the chosen goods hint
			@Override
			public String selectHintGoods() {
			hidden_hint=obj4.getEasygoodsHint();
			return hidden_hint;
			}

		}

		




	class INTERMEDIATE extends Categories{
		
		Random generator= new Random();
		
		private String hidden_cities_countries;
	    private String hidden_carbrand;
	    private String hidden_footballteams;
	    private String hidden_goods;
		private String hidden_hint;
		
		
		CitiesAndCountries obj1 = new CitiesAndCountries();
		FootballTeam obj2 = new FootballTeam();
		CarBrands obj3 = new CarBrands();
		Goods obj4 = new Goods();
		

	 
		private String getcities_countries() {
			hidden_cities_countries=obj1.selectIntermediateCities_countries();
			return hidden_cities_countries;
		}

		@Override
		public String selectCities_Countries() {
			getcities_countries();	
			hiddenVoc=hidden_cities_countries;
	   	return hiddenVoc;
		}

		public void setHint(String hint) {
			hidden_hint=hint;
		}
		public String getHint() {
			hidden_hint=obj1.getIntermediatecities_countriesHint();
			return hidden_hint;
		}
		
		
		@Override
		public String selectHintCities_Countries() {
			getHint();	
			return hidden_hint;
		}
		private String getFootballTeam() {
			hidden_footballteams=obj2.selectIntermediateFootballTeam();
			return hidden_footballteams;
		}
		@Override
		public String selectFootballTeams() {
			getFootballTeam();
			hiddenVoc=hidden_footballteams;
			return hiddenVoc;
		}
		
		
		@Override
		public String selectHintFootballTeams() {
		hidden_hint=obj2.getIntermediatefootballTeamHint();
			return hidden_hint;
		}
		
		private String getCarBrands(){
			hidden_carbrand=obj3.selectIntermediateCar();
			return hidden_carbrand;
		}
		
		
		@Override
		public String selectCarBrands() {
			getCarBrands();
		hiddenVoc=hidden_carbrand;
			return hiddenVoc;
		}
	
		@Override
		public String selectHintCarBrands() {
			hidden_hint=obj3.getIntermediatecarHint();
			return hidden_hint;
		}
		private String getGoods() {
			hidden_goods=obj4.selectIntermediateGoods();
			return hidden_goods;
		}
	
		@Override
		public String selectGoods() {
			 getGoods();
			 hiddenVoc=hidden_goods;
		     return hiddenVoc;
		}
					
		@Override
		public String selectHintGoods() {
		hidden_hint=obj4.getIntermediategoodsHint();
		return hidden_hint;
		}
		
	}



		
	class HARDEST extends Categories{
			
			
        Random generator= new Random();
	    
	    private String hidden_cities_countries;
	    private String hidden_carbrand;
	    private String hidden_footballteams;
	    private String hidden_goods;
		private String hidden_hint;
			
			CitiesAndCountries obj1 = new CitiesAndCountries();
			FootballTeam obj2 = new FootballTeam();
			CarBrands obj3 = new CarBrands();
			Goods obj4 = new Goods();
			
			private String getcities_countries() {
				hidden_cities_countries=obj1.selectHardestCities_countries();
				return hidden_cities_countries;
			}

			@Override
			public String selectCities_Countries() {
				getcities_countries();	
				hiddenVoc=hidden_cities_countries;
		   	return hiddenVoc;
			}
			
			
			@Override
			public String selectHintCities_Countries() {
			hidden_hint=obj1.getHardestcities_countriesHint();
				return hidden_hint;
			}
			private String getFootballTeam() {
				hidden_footballteams=obj2.selectHardestFootballTeam();
				return hidden_footballteams;
			}
			@Override
			public String selectFootballTeams() {
				getFootballTeam();
				hiddenVoc=hidden_footballteams;
				return hiddenVoc;
			}
			
			
			@Override
			public String selectHintFootballTeams() {
			hidden_hint=obj2.getHardestfootballTeamHint();
				return hidden_hint;
			}

			private String getCarBrands(){
				hidden_carbrand=obj3.selectHardestCar();
				return hidden_carbrand;
			}
			
			@Override
			public String selectCarBrands() {
				getCarBrands();
			hiddenVoc=hidden_carbrand;
				return hiddenVoc;
			}
		
			@Override
			public String selectHintCarBrands() {
				hidden_hint=obj3.getHardestcarHint();
				return hidden_hint;
			}
			private String getGoods() {
				hidden_goods=obj4.selectHardestGoods();
				return hidden_goods;
			}
		
			@Override
			public String selectGoods() {
				 getGoods();
				 hiddenVoc=hidden_goods;
			     return hiddenVoc;
			}
						
			@Override
			public String selectHintGoods() {
			hidden_hint=obj4.getHardestgoodsHint();
			return hidden_hint;
			}
			
		
}
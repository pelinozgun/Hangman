
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FootballTeam {

	  private String hidden_footballTeam;
	  private String hidden_footballTeamIntermediate;
	  private String hidden_footballTeamHardest;
	  private String hidden_hint;
	  private String hidden_hintIntermediate;
	  private String hidden_hintHardest;
	
	  List<String> easyFootballTeam;
	    List<String> intermediateFootballTeam;
	    List<String> hardestFootballTeam;
	    
		Random generator= new Random();
		
		//constructor produces 3 levels array list such as easyFootballTeam, intermediateFootballTeam and hardestFootballTeam  
		public FootballTeam(){
		 easyFootballTeam=new ArrayList();
		 intermediateFootballTeam=new ArrayList();
		 hardestFootballTeam=new ArrayList();
		 
		}
		
		// sets football teams' names
	    public void setEasyfootballTeam() {
	    	
	    	easyFootballTeam.add("galatasaray");
	    	easyFootballTeam.add("fenerbahce");
	    	easyFootballTeam.add("besiktas");
	    	easyFootballTeam.add("real madrid");
	    	easyFootballTeam.add("barcelona");
	    	easyFootballTeam.add("trabzonspor");
	    	easyFootballTeam.add("manchester city");
	    	easyFootballTeam.add("manchester united");
	    	easyFootballTeam.add("liverpool");
	    	easyFootballTeam.add("bayern munich");
	    	easyFootballTeam.add("paris saintgermain");
	    	easyFootballTeam.add("Tottenham Hotspur");
	    	easyFootballTeam.add("Borussia Dortmund");
	    	easyFootballTeam.add("chealse");
	    	easyFootballTeam.add("arsenal");
	    	easyFootballTeam.add("atletico madrid");
	    	easyFootballTeam.add("porto");
	    	easyFootballTeam.add("juventus");
	    	easyFootballTeam.add("inter");
	    	easyFootballTeam.add("milan");
	    	
	    }
	
	    //randomly select a football team name related word from the easy category
	    public String selectEasyFootballTeam() {
	    	setEasyfootballTeam();
	    	int index=generator.nextInt(easyFootballTeam.size());
	    	hidden_footballTeam= easyFootballTeam.get(index);
	    	return hidden_footballTeam;
	    	}
	  

	    public void setIntermediatefootballTeam() {
	    intermediateFootballTeam.add("fiorentina");
    	intermediateFootballTeam.add("lazio");
    	intermediateFootballTeam.add("leicester city");
    	intermediateFootballTeam.add("lille");
    	intermediateFootballTeam.add("monaco");
    	intermediateFootballTeam.add("marseille");
    	intermediateFootballTeam.add("leipzig");
    	intermediateFootballTeam.add("atalanta");
    	intermediateFootballTeam.add("napoli");
    	intermediateFootballTeam.add("roma");
    	intermediateFootballTeam.add("hamburg");
    	intermediateFootballTeam.add("rennes");
    	intermediateFootballTeam.add("southampton");
    	intermediateFootballTeam.add("lyon"); 
    	intermediateFootballTeam.add("aston villa");
    	intermediateFootballTeam.add("nice");
    	intermediateFootballTeam.add("west ham united");
    	intermediateFootballTeam.add("crystal palace");
    	intermediateFootballTeam.add("fulham");
    	intermediateFootballTeam.add("lens");
    	
	    	
	    }
		
	    //randomly select a football team name related word from the intermediate category
	    public String selectIntermediateFootballTeam() {
	    	setIntermediatefootballTeam();
	    	int index=generator.nextInt(intermediateFootballTeam.size());
	    	hidden_footballTeamIntermediate=intermediateFootballTeam.get(index);
	    	return hidden_footballTeamIntermediate;
	    	
	    }
	    
	  
	    public void setHardestfootballTeam() {
	    	
	    	hardestFootballTeam.add("Club Brugge");
	    	hardestFootballTeam.add("benfica");
	    	hardestFootballTeam.add("nantes");
	    	hardestFootballTeam.add("Udinese");
	    	hardestFootballTeam.add("braga");
	    	hardestFootballTeam.add("vizela");
	    	hardestFootballTeam.add("wolfsburg");
	    	hardestFootballTeam.add("freiburg");
	    	hardestFootballTeam.add("stuttgart");
	    	hardestFootballTeam.add("brentford");
	    	hardestFootballTeam.add("hoffenheim");
	    	hardestFootballTeam.add("spartak moscow");
	    	hardestFootballTeam.add("wolverhampton wanderers");
	    	hardestFootballTeam.add("nottingham forest");
	    	hardestFootballTeam.add("zenit");	    
	    	hardestFootballTeam.add("villarreal");
	    	hardestFootballTeam.add("real sociedad");
	    	hardestFootballTeam.add("real betis");
	    	hardestFootballTeam.add("athletic bilbao");
	    	hardestFootballTeam.add("bordeaux");	    
	    	
	    		
	    		
	    }
	
	    //randomly select a football team name related word from the hardest category
	    public String selectHardestFootballTeam() {
	    	setHardestfootballTeam();
	    	int index=generator.nextInt(hardestFootballTeam.size());
	    	hidden_footballTeamHardest= hardestFootballTeam.get(index);
	    	return hidden_footballTeamHardest;
	    	
	    }
	    
	    
	   //matches hints with football team
	    public void setEasyfootballTeamHint() {
	    	
	    	if(hidden_footballTeam.equalsIgnoreCase("galatasaray"))
	    		hidden_hint="One of the most famous and successful football teams in Turkey. Their colors are yellow and red.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("fenerbahce"))
	    		hidden_hint="One of Turkey's long-standing football clubs. They play in yellow and navy blue.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("besiktas"))
	    		hidden_hint="Another important football team in Turkey. Their colors are black and white.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("real madrid"))
	    		hidden_hint="One of the renowned football clubs in Spain. They wear white jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("barcelona"))
	    		hidden_hint="Another famous football team in Spain. They have blue and red colors.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("trabzonspor"))
	    		hidden_hint="An important football club from the Black Sea region of Turkey. Their colors are maroon and blue.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("manchester city"))
	    		hidden_hint=" A football team based in Manchester, England. They play in blue jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("manchester united"))
	    		hidden_hint="One of the well-known football teams in England. They are recognized for their red-colored jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("liverpool"))
	    		hidden_hint="A successful football team in England. They play in red.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("bayern munich"))
	    		hidden_hint="One of the strongest football clubs in Germany. Their colors are red and white.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("paris saintgermain"))
	    		hidden_hint="The team representing Paris, the capital of France. They have blue and red colors.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("tottenham hotspur"))
	    		hidden_hint="One of the successful football teams in England. They have white jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("borussia dortmund"))
	    		hidden_hint="A renowned football team from Germany. They have yellow and black colors.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("chelsea"))
	    		hidden_hint="A successful football club in England. They are known for their blue jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("arsenal"))
	    		hidden_hint="One of the prominent football clubs in England. They play in red and white.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("atletico madrid"))
	    		hidden_hint=" One of the significant football teams in Spain. They have red and white striped jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("porto"))
	    		hidden_hint="A football team from Portugal. They are recognized for their blue and white colors.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("juventus"))
	    		hidden_hint="One of Italy's most famous football clubs. They play in black and white striped jerseys.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("inter"))
	    		hidden_hint=" One of Italy's successful football teams. They have blue and black colors.";
	    	else if(hidden_footballTeam.equalsIgnoreCase("milan"))
	    		hidden_hint="One of Italy's historic football clubs. They have red and black colors.";
	    	
	    }
	     
	    // gets correct hint
	    public String getEasyfootballTeamHint() {
	    	setEasyfootballTeamHint();
	    	return hidden_hint;
	    }
	    
	    
	    public void setIntermediatefootballTeamHint() {
	    	if(hidden_footballTeamIntermediate.equalsIgnoreCase("fiorentina"))
	    		hidden_hintIntermediate="A professional football team based in Florence, Italy. They play in purple and white.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("lazio"))
	    		hidden_hintIntermediate="A football club based in Rome, Italy. Their colors are sky blue and white.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("leicester city"))
	    		hidden_hintIntermediate="A football team from Leicester, England. They are known as \"The Foxes.\"";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("lille"))
	    		hidden_hintIntermediate="A French football club based in Lille, France. Their colors are red and white.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("monaco"))
	    		hidden_hintIntermediate="A football team from Monaco, a sovereign city-state on the French Riviera.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("marseille"))
	    		hidden_hintIntermediate="A football club based in Marseille, France. They play in white and light blue.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("leipzig"))
	    		hidden_hintIntermediate="'A German football team based in Leipzig, Germany. They play in red and white.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("atalanta"))
	    		hidden_hintIntermediate="An Italian football club based in Bergamo, Italy. Their colors are black and blue.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("napoli"))
	    		hidden_hintIntermediate="A football team from Naples, Italy. They play in light blue.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("roma"))
	    		hidden_hintIntermediate="A football club based in Rome, Italy. Their colors are maroon and orange.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("hamburg"))
	    		hidden_hintIntermediate="A German football team based in Hamburg ,Germany.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("rennes"))
	    		hidden_hintIntermediate=" A French football club based in Rennes, France. Their colors are red and black.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("southampton"))
	    		hidden_hintIntermediate="An English football team based in Southampton, England.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("lyon"))
	    		hidden_hintIntermediate="A French football club based in Lyon, France. They play in white and red.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("aston villa"))
	    		hidden_hintIntermediate="An English football team based in Birmingham, England. Their colors are claret and blue.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("nice"))
	    		hidden_hintIntermediate="A football club based in Nice, France. They play in red and black.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("west ham united"))
	    		hidden_hintIntermediate=" An English football team based in London, England. They are known as \"The Hammers.\"";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("crystal palace"))
	    		hidden_hintIntermediate="lAn English football club based in London, England.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("fulham"))
	    		hidden_hintIntermediate="An English football team based in London, England.";
	    	else if(hidden_footballTeamIntermediate.equalsIgnoreCase("lens"))
	    		hidden_hintIntermediate=" A French football club based in Lens, France.";
	    		    }
	     
	    
	    public String getIntermediatefootballTeamHint() {
	    	setIntermediatefootballTeamHint();
	    	return hidden_hintIntermediate;
	    }
	    
	    
	    public void setHardestfootballTeamHint(){
	    	if(hidden_footballTeamHardest.equalsIgnoreCase("club brugge"))
	    		hidden_hintHardest="A Belgian football club based in Bruges, known for their blue and black striped jerseys.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("benfica"))
	    		hidden_hintHardest="A Portuguese football club based in Lisbon, recognized for their red-colored jerseys.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("nantes"))
	    		hidden_hintHardest=" A French football club based in Nantes, known as \"The Canaries.\"";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("udinese"))
	    		hidden_hintHardest="An Italian football team based in Udine, playing in black and white stripes.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("braga"))
	    		hidden_hintHardest="A Portuguese football club based in Braga, known for their red and white colors.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("vizela"))
	    		hidden_hintHardest="A Portuguese football club based in Vizela, playing in green and white.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("wolfsburg"))
	    		hidden_hintHardest=" A German football team based in Wolfsburg, known as \"The Wolves.\"";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("freiburg"))
	    		hidden_hintHardest="A German football club based in Freiburg, playing in black and white.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("stuttgart"))
	    		hidden_hintHardest="A German football team based in Stuttgart, recognized for their red jerseys.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("brentford"))
	    		hidden_hintHardest="An English football team based in Brentford, playing in red and white.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("hoffenhein"))
	    		hidden_hintHardest="A German football club based in Sinsheim, recognized for their blue and white colors.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("spartak moscow"))
	    		hidden_hintHardest=" A Russian football club based in Moscow, playing in red and white.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("Wolverhampton Wanderers"))
	    		hidden_hintHardest="An English football team based in Wolverhampton, known as \"The Wolves.\"";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("nottingham forest"))
	    		hidden_hintHardest="An English football club based in Nottingham, recognized for their red jerseys.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("zenit"))
	    		hidden_hintHardest="A Russian football club based in Saint Petersburg, playing in blue and white.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("villarreal"))
	    		hidden_hintHardest="A Spanish football club based in Villarreal, recognized for their yellow jerseys.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("real sociedad"))
	    		hidden_hintHardest="A Spanish football club based in San SebastiÃ¡n, playing in blue and white.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("real betis"))
	    		hidden_hintHardest=" A Spanish football team based in Seville, known for their green and white colors.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("athletic bilbao"))
	    		hidden_hintHardest="A Spanish football club based in Bilbao, recognized for their red and white stripes.";
	    	else if(hidden_footballTeamHardest.equalsIgnoreCase("bordeaux"))
	    		hidden_hintHardest="A French football club based in Bordeaux, playing in navy blue.";
	    	}
	     
	   
	    public String getHardestfootballTeamHint(){
	    	setHardestfootballTeamHint();
	    	return hidden_hintHardest;
	    }
	 }

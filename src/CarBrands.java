import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarBrands {

	  private String hidden_car;
	  private String hidden_carIntermediate;
	  private String hidden_carHardest;
	  private String hidden_hint;
	  private String hidden_hintIntermediate;
	  private String hidden_hintHardest;
	
	  Random generator= new Random();
	  
	    List<String> easyCar;
	    List<String> intermediateCar;
	    List<String> hardestCar;
	    
		//constructor produces 3 levels array list such as easyCar, intermediateCar and hardestCar
		public CarBrands() {
		 easyCar=new ArrayList();
		 intermediateCar=new ArrayList();
		 hardestCar=new ArrayList();
		}
		
		
		// sets cars' brands
	    public void setEasycar() {
	    	easyCar.add("ford");
	    	easyCar.add("honda");
	    	easyCar.add("toyota");
	    	easyCar.add("chevrolet");
	    	easyCar.add("volkswagen");
	    	easyCar.add("nissan");
	    	easyCar.add("BMW");
	    	easyCar.add("mercedes benz");
	    	easyCar.add("audi");
	    	easyCar.add("hyundai ");
	    	easyCar.add("kia");
	    	easyCar.add("mazda");
	    	easyCar.add("jeep");
	    	easyCar.add("volvo");
	    	easyCar.add("fiat");
	    	easyCar.add("tesla");
	    	easyCar.add("lexus");
	    	
	    }
	
	    //randomly select a car brand related word from the easy category
	    public String selectEasyCar() {
	    	setEasycar();
	    	int index=generator.nextInt(easyCar.size());
	    	hidden_car= easyCar.get(index);
	    	return hidden_car;
	    	
	    }
	    
	   
	    public void setIntermediatecar() {
	    	
	    	intermediateCar.add("ferrari");
	    	intermediateCar.add("lamborghini");
	    	intermediateCar.add("porsche");
	    	intermediateCar.add("aston martin");
	    	intermediateCar.add("jaguar");
	    	intermediateCar.add("bentley");
	    	intermediateCar.add("maserati");
	    	intermediateCar.add("rolls royce");
	    	intermediateCar.add("mcLaren");
	    	intermediateCar.add("land rover");
	    	intermediateCar.add("lotus");
	    	intermediateCar.add("alfa Romeo");
	    	intermediateCar.add("bugatti");
	    	intermediateCar.add("pagani");
	    	intermediateCar.add("mini");
	    	intermediateCar.add("GMC");
	    	intermediateCar.add("infiniti");
	    	intermediateCar.add("acura");
	    	
	    	
	    		
	    }
		
	   //randomly select a car brand related word from the intermediate category
	    public String selectIntermediateCar() {
	    	setIntermediatecar();
	    	int index=generator.nextInt(intermediateCar.size());
	    	hidden_carIntermediate=intermediateCar.get(index);
	    	return hidden_carIntermediate;
	    	
	    }    
	    
	    
	 public void setHardestcar() {
	    	
		    hardestCar.add("koenigsegg");
		    hardestCar.add("pagani");
		    hardestCar.add("spyker");
		    hardestCar.add("rimac");
		    hardestCar.add("wiesmann");
		    hardestCar.add("zenvo");
		    hardestCar.add("ariel");
		    hardestCar.add("donkervoort");
		    hardestCar.add("morgan");
		    hardestCar.add("venturi");
		    hardestCar.add("arrinera");
		    hardestCar.add("vuhl");
		    hardestCar.add("hispano suiza");
		    hardestCar.add("bristol");
		    hardestCar.add("panoz");
		    hardestCar.add("faraday future");
		    hardestCar.add("de tomaso");
		    hardestCar.add("gumpert");
		    hardestCar.add("czinger");
		    
	    }
		
	   //randomly select a car brand related word from the hardest category
	    public String selectHardestCar() {
	    	setHardestcar();
	    	int index=generator.nextInt(hardestCar.size());
	    	hidden_carHardest= hardestCar.get(index);
	    	return hidden_carHardest;
	    	
	    }
	    
	    //matches hints with relation information
	    public void setEasycarHint() {
	    	if(hidden_car.equalsIgnoreCase("ford"))
	    		hidden_hint="The brand that owns the iconic car model Mustang";
	    	else if(hidden_car.equalsIgnoreCase("honda"))
	    		hidden_hint="Civic is the most widely used and famous model of the brand";
	    	else if(hidden_car.equalsIgnoreCase("toyota"))
	    		hidden_hint="One of the pioneers and most popular of hybrid car technology";
	    	else if(hidden_car.equalsIgnoreCase("chevrolet"))
	    		hidden_hint="This car brand is known for its iconic American muscle car, the Camaro";
	    	else if(hidden_car.equalsIgnoreCase("wolkswagen"))
	    		hidden_hint="This car brand's name translates to 'people's car' in German";
	    	else if(hidden_car.equalsIgnoreCase("nissan"))
	    		hidden_hint="This car brand's logo features a circle with a horizontal line running through it";
	    	else if(hidden_car.equalsIgnoreCase("BMW"))
	    		hidden_hint="This car brand is known for its slogan 'The Ultimate Driving Machine.";
	    	else if(hidden_car.equalsIgnoreCase("mercedes benz"))
	    		hidden_hint="The f1 team driver of the car brand has been champion 7 times in the world";
	    	else if(hidden_car.equalsIgnoreCase("audi"))
	    		hidden_hint="This car brand is known for its iconic four interlocking rings in its logo.";
	    	else if(hidden_car.equalsIgnoreCase("hyundai"))
	    		hidden_hint=" it originated from South Korea.";
	    	else if(hidden_car.equalsIgnoreCase("kia"))
	    		hidden_hint="This car brand is known for its stylish and sporty compact SUV called the 'Sportage.'";
	    	else if(hidden_car.equalsIgnoreCase("mazda"))
	    		hidden_hint="This car brand is known for its 'zoom-zoom' slogan, emphasizing the joy of driving";
	    	else if(hidden_car.equalsIgnoreCase("jeep"))
	    		hidden_hint="This car brand is known for its rugged and off-road capabilities, often associated with exploration and adventure.";
	    	else if(hidden_car.equalsIgnoreCase("volvo"))
	    		hidden_hint="This car brand is renowned for its strong emphasis on safety, with features like 'seat belts' and 'crumple zones' being introduced by them.";
	    	else if(hidden_car.equalsIgnoreCase("fiat"))
	    		hidden_hint="This car brand's name is an acronym, which stands for 'Fabbrica Italiana Automobili Torino.'";
	    	else if(hidden_car.equalsIgnoreCase("tesla"))
	    		hidden_hint="This car brand is synonymous with electric vehicles and was founded by Elon Musk";
	    	else if(hidden_car.equalsIgnoreCase("lexus"))
	    		hidden_hint="This luxury car brand is known for its exceptional craftsmanship, smooth performance, and distinctive 'L' logo.";
	    	
	    }
	     
	    // gets correct hint
	    public String getEasycarHint() {
	    	setEasycarHint();
	    	return hidden_hint;
	    }
	    
	    public void setIntermediatecarHint() {
	    	if(hidden_carIntermediate.equalsIgnoreCase("ferrari"))
	    		hidden_hintIntermediate="This car brand's logo features a prancing horse, symbolizing strength and elegance.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("lamborghini"))
	    		hidden_hintIntermediate="This car brand is known for its iconic scissor doors, which swing upward instead of outward.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("porsche"))
	    		hidden_hintIntermediate="This car brand is known for its high-performance sports cars, including the iconic '911' model";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("aston martin"))
	    		hidden_hintIntermediate="This car brand is synonymous with luxury and sophistication, often associated with the famous fictional spy, James Bond";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("jaguar"))
	    		hidden_hintIntermediate="This car brand is known for its sleek and powerful luxury vehicles, often associated with the image of a majestic big cat";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("bentley"))
				hidden_hintIntermediate="This car brand's logo features a stylized 'B' in a circular badge.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("maserati"))
				hidden_hintIntermediate="This car brand is known for its luxurious and sporty Italian vehicles, often recognized by its iconic trident logo.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("rolls royce"))
				hidden_hintIntermediate="This car brand is renowned for its prestigious and handcrafted luxury vehicles, often chosen by royalty and dignitaries";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("mclaren"))
				hidden_hintIntermediate="World-famous pilot Daniel Ricciardo left this team in 2023.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("land rover"))
				hidden_hintIntermediate="This car brand is famous for its versatile SUVs, designed to handle various terrains with ease.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("lotus"))
	    		hidden_hintIntermediate="This car brand is known for its iconic models like the Elise, Exige, and Evora, offering a thrilling driving experience";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("alfa romeo"))
	    		hidden_hintIntermediate="This car brand is renowned for its iconic emblem featuring a red cross and a crowned serpent.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("bugatti"))
	    		hidden_hintIntermediate="This car brand is synonymous with luxury and speed, known for producing some of the fastest and most exclusive hypercars in the world";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("pagani"))
	    		hidden_hintIntermediate="This Italian car brand is known for its striking designs and innovative use of materials, such as carbon fiber, to create lightweight and high-performance vehicles.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("mini"))
	    		hidden_hintIntermediate="This car brand is famous for its iconic small cars that are perfect for urban driving and known for their playful personality.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("gmc"))
	    		hidden_hintIntermediate="This car brand is widely recognized for its lineup of rugged and capable trucks and SUVs, often associated with professional-grade performance and durability.";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("infiniti"))
	    		hidden_hintIntermediate="This car brand is synonymous with luxury and is a division of a well-known Japanese automaker";
	    	else if(hidden_carIntermediate.equalsIgnoreCase("acura"))
	    		hidden_hintIntermediate="This car brand is a division of Honda, and it specializes in producing upscale vehicles with a focus on precision and craftsmanship.";
	    	
	    }
	     
	    
	    public String getIntermediatecarHint() {
	    	setIntermediatecarHint();
	    	return hidden_hintIntermediate;
	    }
	    
	    public void setHardestcarHint() {
	    	
	    		if(hidden_carHardest.equalsIgnoreCase("koenigsegg"))
		    		hidden_hintHardest="This exclusive and high-performance car brand is based in Sweden and is known for its record-breaking speed and distinctive design.";
		    
		    	else if(hidden_carHardest.equalsIgnoreCase("pagani"))
		    		hidden_hintHardest="This car brand is renowned for its limited-production, high-performance supercars that combine breathtaking design with exceptional craftsmanship, making them highly sought after by automotive enthusiasts worldwide.";
		    	else if(hidden_carHardest.equalsIgnoreCase("spyker"))
		    		hidden_hintHardest="This car brand has its roots in the Netherlands and is known for its distinctive design, aviation-inspired elements, and limited production models";
		    	else if(hidden_carHardest.equalsIgnoreCase("rimac"))
		    		hidden_hintHardest="This car brand, hailing from Croatia, is renowned for its cutting-edge electric hypercars that offer mind-boggling acceleration and impressive range, showcasing the future of automotive technology";
		    	else if(hidden_carHardest.equalsIgnoreCase("wiesmann"))
		    		hidden_hintHardest="This car brand, based in Germany, is known for its handcrafted sports cars that seamlessly blend classic design with modern performance, offering a truly exhilarating driving experience.";
		    	else if(hidden_carHardest.equalsIgnoreCase("zenvo"))
		    		hidden_hintHardest="This car brand, hailing from Denmark, is renowned for its high-performance supercars that feature striking design and exceptional power, making them a true marvel on the roads.";
		    	else if(hidden_carHardest.equalsIgnoreCase("ariel"))
		    		hidden_hintHardest="This British car brand is famous for its lightweight and high-performance sports cars that offer an exhilarating driving experience. It shares its name with a character from Shakespeare's play 'The Tempest'.";
		    	else if(hidden_carHardest.equalsIgnoreCase("donkervoort"))
		    		hidden_hintHardest="This Dutch car brand is known for its handcrafted, high-performance sports cars. The founder's last name, which is also the brand name, translates to 'Donkey's Ford' in English";
		    	else if(hidden_carHardest.equalsIgnoreCase("morgan"))
		    		hidden_hintHardest="This British car brand has a long heritage, dating back over a century. It is famous for its classic and elegant designs, often featuring a combination of wood and metal in its construction.";
		    	else if(hidden_carHardest.equalsIgnoreCase("venturi"))
		    		hidden_hintHardest="This car brand is known for its focus on electric and high-performance vehicles. It was founded in France in the 1980s and has been involved in innovative projects such as setting land speed records for electric vehicles.";
		    	else if(hidden_carHardest.equalsIgnoreCase("arrinera"))
		    		hidden_hintHardest="This car brand is a Polish manufacturer known for producing high-performance sports cars. Their flagship model is named after a mythical creature known for its speed and agility. It made its debut in the early 2010s and has gained attention for its sleek design and impressive performance capabilities.";
		    	else if(hidden_carHardest.equalsIgnoreCase("vuhl"))
		    		hidden_hintHardest="The name of the brand stands for 'Vehicles of Ultra-lightweight and High-performance";
		    	else if(hidden_carHardest.equalsIgnoreCase("hispano suiza"))
		    		hidden_hintHardest="The brand's name combines the Spanish word for 'Spanish' and the French word for 'Swiss";
		    	else if(hidden_carHardest.equalsIgnoreCase("bristol"))
		    		hidden_hintHardest="Think of luxury, elegance, and a touch of British heritage. This car brand shares its name with a vibrant city known for its suspension bridge";
		    	else if(hidden_carHardest.equalsIgnoreCase("panoz"))
		    		hidden_hintHardest="Think of a sleek, black feline predator associated with luxury and combine it with the letter 'Z' at the end";
		    	else if(hidden_carHardest.equalsIgnoreCase("faraday future"))
		    		hidden_hintHardest="Think of a famous scientist who conducted groundbreaking experiments with electricity and combine it with a word that represents a time yet to come";
		    	else if(hidden_carHardest.equalsIgnoreCase("de tomaso"))
		    		hidden_hintHardest="It is famous for its pantera model, which means panther in Italian.";
		    	else if(hidden_carHardest.equalsIgnoreCase("gumpert"))
		    		hidden_hintHardest="Apollo is a 2-door super sports car of the brand, produced between 2005-2012.";
		    	else if(hidden_carHardest.equalsIgnoreCase("czinger"))
		    		hidden_hintHardest="21C is a hybrid sports car developed using artificial intelligence and 3D printed by the American car manufacturer";

	    }
	     
	    public String getHardestcarHint(){
	    	setHardestcarHint();
	    	return hidden_hintHardest;
	    }
	
}
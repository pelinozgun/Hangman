public class Questions {
	private  boolean IsAnswerFeasible;	
	private  String question,answer;
	
	//create array for questions
	 private String [] array= new String[26];
		
		
		public Questions() {
			this.question="";
			this.answer="";
		}
		
		// sets question names into array
		public void setQuestions() {
			array[0]="where is capital of France?";
			array[1]="Who painted the Mona Lisa?";
			array[2]="Which planet is known as the \"Red Planet\"?";
			array[3]="What is the largest organ in the human body?";
			array[4]="Who wrote the play Romeo and Juliet?";
			array[5]="What is the chemical symbol for gold?";
			array[6]="How many continents are there in the world?";
			array[7]="What is the largest ocean on Earth";
			array[8]="Who is the author of the Harry Potter book series?";
			array[9]="Which animal is known as the \"King of the Jungle\"?";
			array[10]="What is the tallest mountain in the world";
			array[11]="Who was the first person to step on the moon";
			array[12]="What is the national bird of the United States";
			array[13]="Which country is famous for the Taj Mahal";
			array[14]="What is the largest species of shark?";
			array[15]="Who is the current President of the United States?";
			array[16]="What is the currency of Japan?";
			array[17]="Which planet is known as the \"Blue Planet\"?";
			array[18]="Who painted the famous artwork \"The Starry Night\"?";
			array[19]="What is the chemical symbol for oxygen?";
			array[20]="What is the capital city of Australia?";
			array[21]="Who is the author of the book \"To Kill a Mockingbird\"?";
			array[22]="Which country is home to the Great Wall?";
			array[23]="What is the largest desert in the world?";
			array[24]="What is the largest planet in our solar system?";
			array[25]="Who painted the famous artwork \"The Last Supper\"?";
					
			}
			
		
		
        //gets question
	  public String [] getQuestion() {
		  setQuestions();
		 return array;
	   }
	  
		 //select random question
	  public String selectQuestion() {
		  getQuestion();
		  int index=(int)(Math.random()*(array.length));
		  if(index<array.length)
		  question=array[index];
		  return question;
		  
	  }
	  
	  //set answers to questions
	  public  void setAnswers() {
		  if(question.equalsIgnoreCase("Where is capital of France?"))
			  answer="Paris";
		  else if(question.equalsIgnoreCase("Who painted the Mona Lisa? "))
			  answer="Leonardo da Vinci";
		  else if(question.equalsIgnoreCase("Which planet is known as the \"Red Planet\"?"))
			  answer="Mars";
		  else if(question.equalsIgnoreCase("What is the largest organ in the human body?"))
			  answer="Skin";
		  else if(question.equalsIgnoreCase("Who wrote the play Romeo and Juliet?"))
			  answer="William Shakespeare";
		  else if(question.equalsIgnoreCase("What is the chemical symbol for gold?"))
			  answer="Au";
		  else if(question.equalsIgnoreCase("How many continents are there in the world?"))
			  answer="Seven";
		  else if(question.equalsIgnoreCase("What is the largest ocean on Earth?"))
			  answer="Pacific Ocean";
		  else if(question.equalsIgnoreCase("Who is the author of the Harry Potter book series?"))
			  answer="J.K. Rowling";
		  else if(question.equalsIgnoreCase("Which animal is known as the \"King of the Jungle\"?"))
			  answer="Lion";
		  else if(question.equalsIgnoreCase("What is the tallest mountain in the world?"))
			  answer="Mount Everest";
		  else if(question.equalsIgnoreCase("Who was the first person to step on the moon"))
			  answer="Neil Armstrong";
		  else if(question.equalsIgnoreCase("What is the national bird of the United States?"))
			  answer="Bald eagle";
		  else if(question.equalsIgnoreCase("Which country is famous for the Taj Mahal"))
			  answer="India";
		  else if(question.equalsIgnoreCase("What is the largest species of shark"))
			  answer="Whale shark";
		  else if(question.equalsIgnoreCase("Who is the current President of the United States"))
			  answer="Joe Biden";
		  else if(question.equalsIgnoreCase("What is the currency of Japan"))
			  answer="Japanse yen";
		  else if(question.equalsIgnoreCase("Which planet is known as the \"Blue Planet\"?"))
			  answer="Earth";
		  else if(question.equalsIgnoreCase("Who painted the famous artwork \"The Starry Night\"?"))
			  answer="Vincent van Gogh";
		  else if(question.equalsIgnoreCase("What is the chemical symbol of oxygen"))
			  answer="O";
		  else if(question.equalsIgnoreCase("What is the capital city of Australia?"))
			  answer="Canberra";
		  else if(question.equalsIgnoreCase("Who is the author of the book \"To Kill a Mockingbird\"?"))
			  answer="Harper Lee";
		  else if(question.equalsIgnoreCase("Which country is home to the Great Wall?"))
			  answer="China";
		  else if(question.equalsIgnoreCase("What is the largest desert in the world?"))
			  answer="Sahara Desert";
		  else if(question.equalsIgnoreCase("What is the largest planet in our solar system?"))
			  answer="Jupiter";
		  else if(question.equalsIgnoreCase("Who painted the famous artwork\"The Last Supper\"?"))
			  answer="Leonardo da Vinci";
		  
		  
		  
	  }
	  
	  //gets answer
	  public  String getAnswers() {
		  setAnswers();
		  return answer;
	  }
	  
	  // checks if the answer correct
		public boolean answersCorrect(String playerAnswers) {
			getAnswers();
			IsAnswerFeasible=answer.equalsIgnoreCase(playerAnswers);
			return IsAnswerFeasible;
		}	

}
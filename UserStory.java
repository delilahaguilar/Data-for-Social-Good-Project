import java.util.Scanner;

public class UserStory {
  //Array stores the top genres
 private String[]topgenre;
  //Array storing minutes streamed for each genre
  private int []minutestreamed;

  //Initializes empty arrays
  public UserStory(){
    topgenre = new String [0];
    minutestreamed = new int[0];
  }

  //Gets data from files
  public UserStory(String topgenreFile, String minutestreamedFile) {
    this.topgenre = FileReader.toStringArray(topgenreFile);
    this.minutestreamed = FileReader.toIntArray(minutestreamedFile);
    
  }
  //Returns genre with highest number of minutes streamed
    public String getMostPopular() {
      //If theres no data then, returns empty string
        if (topgenre.length == 0) return "";
        int maxIndex = 0;

      //Loop through all generes to find maximum minutes
      
        for (int i = 1; i < topgenre.length; i++) {
            if (minutestreamed[i] > minutestreamed[maxIndex]) {
                maxIndex = i; //Updates when higher value is found 
            }
        }
      return topgenre[maxIndex]; //Returns most popular genre
    }
  
  //Returns summarizing the data 
  public String toString (){
    String result = "";
    result += "Total minutes:" + minutestreamed.length + "\n";
    result += "Most Popular:" + getMostPopular() +"\n\n";
    //Lists each genre with minutestreamed
    for (int i = 0; i < minutestreamed.length; i++) {
      result += minutestreamed[i] +"," + topgenre[i] +"\n";
      
    }
    return result;
  }





  
}
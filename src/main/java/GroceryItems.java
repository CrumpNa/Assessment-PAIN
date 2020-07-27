import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.regex.*;

//steps
//take in each line put variables from file like name,price etc into fields below
//(use regex to find all keys and put them into the fields)
//use hashmap and go thru and count occurrences


public class GroceryItems {

    //fields
    private String name;
    private int nameCounter=0; //counts the number of times a certain name is "seen"
    private int price;
    private int priceCounter=0; //counts the number of times a certain price is seen
    private String type;
    private Date expiration;
    //hashmap
    public HashMap<String, Integer> occurrences = new HashMap<String, Integer>();//char is key: int occurrences is value
    private static final Logger logger = Logger.getGlobal(); //logger initiated


    GroceryItems(String n, int p, String t, Date e) {//constructor
        name = n;
        price = p;
        type = t;
        expiration = e;
    }

    public String inFile() throws FileNotFoundException {
        //read from file, add to hash map
        try {
            Scanner sc = new Scanner(new File("RawData.txt")); //input text file
            while (sc.hasNextLine()) { //run thru file
                occurrences.add(sc.nextLine()); //adds every line  from the txt into

            }
            }
        catch(FileNotFoundException f){ //if file not found put out these errors
            System.out.print("Unfortunately the file you are trying to import was not found.");//error to print out to the user
            logger.info("File was not found"); //logger to print out

        }
        return sc;//return curr line
    }


    public void regexChecker() throws FileNotFoundException {
        String currLine=inFile(); //call input method to bring in current line
        boolean n1 = Pattern.matches("n", currLine); //if matches n in name
        boolean n2= Pattern.matches("N", currLine); //if matches N in name
        if(n1 || n2==true){
            //put into name field in hashmap
        }
    }
}
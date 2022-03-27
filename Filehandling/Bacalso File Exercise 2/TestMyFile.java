/**
 * File Handling Set 2 (JSON Object)
 * Written by: Sly Kint Bacalso
 * CS228-G1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ArrayNode;

public class TestMyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        ObjectMapper mapper = new ObjectMapper();
        ArrayNode arrayNode = null;
        ArrayNode arrayNodeOutput = null;
        JsonNode node = null;

        MyFile myFile = new MyFile(inputFileName);
        myFile.createFile(outputFileName);

        // init to read the file content
        if(myFile.readFromFile(inputFileName)){
            // if the content is null create new Array Node of object
            if(myFile.getContent() == null){
                arrayNode = mapper.createArrayNode();
            } else {
                try {
                    // Otherwise parse the json data as fast as it can with proper arrangement of the data
                    BufferedReader br = new BufferedReader(myFile.readJsonFile(inputFileName));
                    // Reading nodes inside the input file which format as  JsonString
                    node = mapper.readTree(br);
                    
                    // now here from the result of Json Node tree will pass it to Array node so that it will form as 
                    // JsonArray
                    arrayNode = (ArrayNode) node;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // now let's create a new object
        MyBankAccountFile account = new MyBankAccountFile();
        System.out.print("Enter account number: ");
        account.setAccountNumber(sc.nextInt());
        System.out.print("Enter beginning balance: ");
        account.setBeginningBalance(sc.nextDouble());
        System.out.print("Enter total charges: ");
        account.setTotalCharges(sc.nextDouble());
        System.out.print("Enter total credits: ");
        account.setTotalCredits(sc.nextDouble());
        System.out.print("Enter credit limit: ");
        account.setCreditLimit(sc.nextDouble());
        // new node to write
        node = account.toJSONNode();
        // append new node
        arrayNode.add(node);

        // Writing input file section
        try {
            // Format the JsonArray to form again as json string so that the content of input file is readable
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNode);

            // init to write data to file
            if(myFile.writeToFile(inputFileName)){
                // invoke write method to write the json string to input file
                myFile.write(json);
            }
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading input file section

        // init new array node for output since we cannot do the same to input.txt for append data
        arrayNodeOutput = mapper.createArrayNode();
        try {
            // Buffering the input file 
            BufferedReader br = new BufferedReader(myFile.readJsonFile(inputFileName));
            // Parsing the buffered json array to cast as MyBankAccountFile list of object since json is a list of object
            List<MyBankAccountFile> inputList = Arrays.asList(mapper.readValue(br, MyBankAccountFile[].class));

            // for each object from array list calculate the balance
            for (MyBankAccountFile accountList : inputList) {
                accountList.calculateBalance();
                // Adding the Json node that holds new balance of each MyBankAccountFile object
                arrayNodeOutput.add(accountList.toJSONFINALNode());
            }
        } catch( IOException e ) {
            e.printStackTrace();
        }

        // Writing output file section
        try {
            // Format the JsonArray to form again as json string so that the content of input file is readable
            String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(arrayNodeOutput);
            // init write to output file
            if(myFile.writeToFile(outputFileName)){
                // invoking write method to write the json string to output file
                myFile.write(json);
            }
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading output file and display section
        try {
            BufferedReader br = new BufferedReader(myFile.readJsonFile(outputFileName));
            List<MyBankAccountFile> outputList = Arrays.asList(mapper.readValue(br, MyBankAccountFile[].class));
            for (MyBankAccountFile accountList : outputList) {
                // From the instruction display only customers whose credit limit is insufficient for the new balance 
                if(accountList.getCreditLimit() < accountList.getBalance()){
                    System.out.println(accountList.toString());
                }
            }
        } catch( IOException e ) {
            e.printStackTrace();
        }
        sc.close();
    }
}
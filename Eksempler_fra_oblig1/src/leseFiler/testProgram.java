/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leseFiler;

/**
 *
 * @author Silje
 */
public class testProgram {
   public static void main(String[] arg){
    
       String separator=System.getProperty("file.separator");
       
       String dataFromFile=readFile.loadData("data"+separator+"countryInfoCSV.txt");
      
       String dataFromURL=readUrl.loadData("http://ws.geonames.org/countryInfoCSV");
     
       System.out.print(dataFromFile);
       System.out.println(dataFromURL);
      
      
   }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leseFiler;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Silje
 */
public class readFile {

    public static String loadData(String file) {
        BufferedReader in = null;
        StringBuffer result = new StringBuffer();
        try {
            FileReader fr = new FileReader(file);

            in = new BufferedReader(fr);
            String str;

            while ((str = in.readLine()) != null) {
                result = result.append(str);
                result = result.append("\n");
            }
            in.close();
        } catch (Exception e) {
            return null;
        }
        return result.toString();
    }
}
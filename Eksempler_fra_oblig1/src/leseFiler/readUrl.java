/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leseFiler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author Silje
 */
public class readUrl {

    public static String loadData(String address) {
        BufferedReader in = null;
        StringBuffer result = new StringBuffer();
        try {
            // -------------------------------------------------
            // ---- Forskjellen mellom å lese fra fil og URL ---
            // -------------------------------------------------
            URL url = new URL(address);
            InputStreamReader is = new InputStreamReader(url.openStream(), "utf-8");
            // --------------------------------------------------
            
            
            in = new BufferedReader(is);
            String str;

            while ((str = in.readLine()) != null) {
                result = result.append(str);
                result = result.append("\n");
            }
            in.close();
            return result.toString();
        } catch (Exception ex) {
            System.out.println(ex.toString());
            return null;

        }

    }
}

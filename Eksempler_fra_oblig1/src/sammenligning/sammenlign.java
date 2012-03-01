
package sammenligning;

/**
 *
 * @author Silje
 */
public class sammenlign {
    public static void main(String[] arg){
        
        biggestValue1(10, 20);
        
        biggestValue2(25, 18);
        
        biggestValue3(150, 20);
        
       
    }

    // På variabler av int, double, long osv (primitive datatyper)
    // kan man bruke relasjonsopperatorer, <, ==, >, != ...
    private static void biggestValue1(int i, int i0) {
        if(i>i0)
            System.out.println(i);
        else
            System.out.println(i0);
       
    }
    
    // Er variablene av klassen Ineger kan man bruke både relasjonsopperatorer og
    // compareTo
    private static void biggestValue2(Integer i, Integer i0) {
       if(i.compareTo(i0)>0)
           System.out.println(i);
        else
            System.out.println(i0);
       
    }
    private static void biggestValue3(Integer i, Integer i0) {
       if(i>i0)
           System.out.println(i);
        else
            System.out.println(i0);
       
    }

    
    
    
}

package day41_Erors_GarbageCoolector;

public class P01_ {

	public static void main(String[] args) {
		System.out.println(exceptions());
    }
    @SuppressWarnings({ "finally", "null" })
	public static String exceptions() {
        String result ="";
        String v = null ;
        
        try {
            try {
            result = result + "a" ;
            v.length() ;
            result = result + "b";
            
            } catch (NullPointerException e) {
                result = result + "c" ;
                
            }finally {
                result = result + "d" ;
                throw new Exception() ;
            }
        } catch (Exception e) {
            result = result + "e" ;
        }
        
    
        return result;

	}

}

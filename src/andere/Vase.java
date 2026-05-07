package andere;

public class Vase {
	
	private int volumen;  //in Litern
	public String farbe;
	
	      public Vase() {
  	   super();
     }
	      public Vase(int volumen) {
	    	  this.volumen = volumen;
	      }
     
        public Vase(int v, String farbe) {
  	   volumen = v;
  	   this.farbe = farbe;
     }
        
	 public void setzeVolumen(int liter) {
		 volumen = liter;
	 }
           public int gebeVolumen() {
	         return volumen;
}
          
           
         
}

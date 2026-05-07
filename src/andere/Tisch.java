package andere;

public class Tisch {

	private Vase eineVase;
	
	public Tisch() {
		super();
	}
	public Tisch(Vase vase) {
		eineVase = vase;
	}
	
		public void stellVase(Vase vase) {
		eineVase = vase;
	}
}

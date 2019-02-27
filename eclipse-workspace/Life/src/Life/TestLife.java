package Life;

public class TestLife {
	public static void main(String[] args) {
		NewLife NewLife1 = new NewLife();
		NewLife1.setName("aaaa");
		NewLife1.displayName();
		NewLife NewLife2 = new NewLife("san");
		NewLife2.displayName();
		NewLife l = new NewLife(2);
		l.displayAge();
	}
}

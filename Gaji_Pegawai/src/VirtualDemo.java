
public class VirtualDemo {
public static void main(String[]args) {
	Gaji s = new Gaji("wahyu", "KUBAR", 3, 5000.00);
	Pegawai e = new Gaji("Ini nama", "samarinda", 2, 2500.00);
	System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji--");
	
	s.mailCheck();
	
	System.out.println("\nMeanggil mailCheck Berdasarkan Referensi Pegawai--");
	
	e.mailCheck();
}
	
}
class Biodata{
	String nama = "Muhamad Mashudi";
	String alamat = "Jepara";
	int umur = 21;

	void CekBiodata(){
		System.out.println("Nama : " + nama + "\nAlamat : " + alamat + "\nUmur : " + umur);
	}
}

public class Tugas8{
	public static void main(String[] args){
		Biodata b = new Biodata();
		b.CekBiodata();
	}
}

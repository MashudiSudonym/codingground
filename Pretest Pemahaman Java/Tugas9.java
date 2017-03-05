class BiodataTgs9{
	String nama;

	BiodataTgs9(String n){
		nama = n;
	}

	void Display(){
		System.out.println(nama);
	}
}

public class Tugas9{
	public static void main(String[] args){
		BiodataTgs9 b = new BiodataTgs9("Muhamad Mashudi");
		b.Display();
	}
}

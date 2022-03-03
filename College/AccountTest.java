public class AccountTest {
	public static void main(String[] args){
		Account akun1 = new Account("999", "Fathir Maula", 8000);
		System.out.println(akun1);

		Account akun2 = new Account("1412", "Piter Maula", 10000);
		System.out.println(akun2);

		akun1.transferTo(akun2, 4000);
		System.out.println(akun1);
		System.out.println(akun2);
}
}
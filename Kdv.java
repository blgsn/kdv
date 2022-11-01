import java.util.Scanner;
public class Kdv {
	public static void main(String[] args) {
		double tutar, kdvOran=0.18;
		Scanner input = new Scanner(System.in);
		System.out.print("ücret tutarını giriniz :");
		tutar =input.nextDouble();
		double kdvTutar=kdvOran*tutar;
		double kdvliTutar=kdvTutar+tutar;
		System.out.println(kdvliTutar);
	}

}

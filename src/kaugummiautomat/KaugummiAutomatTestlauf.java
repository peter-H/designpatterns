package kaugummiautomat;

public class KaugummiAutomatTestlauf {

	public static void main(String[] args) {
		KaugummiAutomat kaugummiAutomat = new KaugummiAutomat(5);

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.muenzeAuswerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.muenzeAuswerfen();

		System.out.println(kaugummiAutomat);

		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.griffDrehen();
		kaugummiAutomat.muenzeEinwerfen();
		kaugummiAutomat.griffDrehen();

		System.out.println(kaugummiAutomat);
	}
}

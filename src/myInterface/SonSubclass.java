package myInterface;

public class SonSubclass implements FatherSuperclass, MotherSuperclass {

	public static void main(String[] args) {
		SonSubclass ap = new SonSubclass();
		ap.receipe();
		ap.care();
		ap.love();
		ap.nature();
		ap.money();
		FatherSuperclass.mymethod();
		FatherSuperclass.mymethod1();
		MotherSuperclass.mymethod();
		MotherSuperclass.mymethod1();

	}

	@Override
	public void receipe() {
		System.out.println("hii i am incomplete method of mothers class, my name is receipe " + "& now I'm complete");

	}

	@Override
	public void care() {
		System.out.println("hii i am incomplete method of mothers class, my name is care " + "& now I'm complete");

	}

	@Override
	public void love() {
		System.out.println("hii i am incomplete method of fathers class, my name is love " + "& now I'm complete");
	}

	@Override
	public void nature() {
		System.out.println("hii i am incomplete method of fathers class, my name is nature " + "& now I'm complete");

	}

	@Override
	public void money() {

		FatherSuperclass.super.money();
		MotherSuperclass.super.money();
	}

}

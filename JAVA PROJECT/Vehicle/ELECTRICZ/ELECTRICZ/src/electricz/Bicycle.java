package electricz;

import java.util.ArrayList;
import java.util.Scanner;

public class Bicycle extends TwoWheeler 
{
	Scanner m=new Scanner(System.in);
	
	public  void bicycle() 
	{
		System.out.println("==========================================================================================");
	ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for Hero Lectro");
	lk.add("2 for Nuze");
	lk.add("3 for EMotorad");
	lk.add("4 for Pedaleze");
	lk.add("5 for Nienty One");
	lk.add("6 for WaltX");
	lk.add("7 for Triad");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	
	if(ch<8)
	{
		switch(ch)
		{
		case 1: heroLectro();
		break;
		case 2: nuzeElectric();
		break;
		case 3: eMotorad();
		break;
		case 4: pedaleze();
		break;
		case 5: nientyOne();
		break;
		case 6: waltX();
		break;
		case 7: triad();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	else if(ch>8)
	{
		System.out.println("please choose correct option");
		System.out.println("===========================================================");
		System.out.println(lk);
		System.out.println("===========================================================");
		int n=m.nextInt();
		switch(n)
		{
		case 1: heroLectro();
		break;
		case 2: nuzeElectric();
		break;
		case 3: eMotorad();
		break;
		case 4: pedaleze();
		break;
		case 5: nientyOne();
		break;
		case 6: waltX();
		break;
		case 7: triad();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}

	public  void heroLectro() {
		System.out.println("==========================================================================================");
		ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for F6i");
	lk.add("2 for F3i");
	lk.add("3 for F2i");
	lk.add("4 for C8i");
	lk.add("5 for C7 Plus");
	lk.add("6 for C5");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<7)
	{
		switch(ch)
		{
		case 1: f6i();
		break;
		case 2: f3i();
		break;
		case 3: f2i();
		break;
		case 4: c8i();
		break;
		case 5: c7Plus();
		break;
		case 6: c5();
		break;
		}
	}
	}
	public void f6i() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Hero Lectro F6I ==========");
		}driver();
	}

	private void f3i() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Hero Lectro F3I ==========");
		}driver();
	}

	private void f2i() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Hero Lectro F2I ==========");
		}driver();
	}

	private void c8i() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Hero Lectro C8I ==========");
		}driver();
	}

	private void c7Plus() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Hero Lectro C7 Plus ==========");
		}driver();
	}

	private void c5() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Hero Lectro C5 ==========");
		}driver();
	}

	public  void nuzeElectric() {
		System.out.println("==========================================================================================");
		ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for i1");
	lk.add("2 for i3");
	lk.add("3 for S1");
	lk.add("4 for S3");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<5)
	{
		switch(ch)
		{
		case 1: i1();
		break;
		case 2: i3();
		break;
		case 3: s1();
		break;
		case 4: s3();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	private void i1() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Nuze I1 ==========");
		}driver();
	}

	private void i3() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Nuze I3 ==========");
		}driver();
	}

	private void s1() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing WaltX Nuze S1 ==========");
		}driver();
	}

	private void s3() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Nuze S3 ==========");
		}driver();
	}

	public  void eMotorad() {
		System.out.println("==========================================================================================");
		ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for T-Rex Plus");
	lk.add("2 for EMX");
	lk.add("3 for T-Rex");
	lk.add("4 for Doodle");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<5)
	{
		switch(ch)
		{
		case 1: trexplus();
		break;
		case 2: emx();
		break;
		case 3: trex();
		break;
		case 4: doodle();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	private void trexplus() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing EMotorad T-Rex Plus ==========");
		}driver();
	}

	private void emx() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing EMotorad EMX ==========");
		}driver();
	}

	private void trex() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Emotorad T-Rex ==========");
		}driver();
	}

	private void doodle() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing EMotorad Doodle ==========");
		}driver();
	}

	public  void pedaleze() {
		System.out.println("==========================================================================================");
		ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for O2");
	lk.add("2 for C2");
	lk.add("3 for H2");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<4)
	{
		switch(ch)
		{
		case 1: o2();
		break;
		case 2: c2();
		break;
		case 3: h2();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	private void o2() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Pedaleze O2 ==========");
		}driver();
	}

	private void c2() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Pedaleze C2 ==========");
		}driver();
	}

	private void h2() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Pedaleze H2 ==========");
		}
	}

	public  void nientyOne() {
		Scanner m=new Scanner(System.in);
		System.out.println("==========================================================================================");
		ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for Meraki UX 26T");
	lk.add("2 for Meraki S7 27.5T");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<3)
	{
		switch(ch)
		{
		case 1: merakiUX();
		break;
		case 2: merakiS7();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	private void merakiUX() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing NientyOne Meraki UX 26T ==========");
		}driver();
	}

	private void merakiS7() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing NientyOne Meraki S7 27.5T ==========");
		}driver();
	}

	public void waltX() {
		System.out.println("==========================================================================================");
	ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for Spark 1");
	lk.add("2 for Spark 3");
	lk.add("3 for Spark 5");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<4)
	{
		switch(ch)
		{
		case 1: spark1();
		break;
		case 2: spark3();
		break;
		case 3: spark5();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}
	private void spark1() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing WaltX Spark 1 ==========");
		}driver();
	}

	private void spark3() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing WaltX Spark 3 ==========");
		}driver();
	}

	private void spark5() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing WaltX Spark 5 ==========");
		}driver();
	}

	public void triad() {
		System.out.println("==========================================================================================");
	ArrayList<String> lk=new ArrayList<>();
	lk.add("1 for E1");
	lk.add("2 for E3");
	lk.add("3 for E5");
	System.out.println(lk);
	System.out.println("==========================================================================================");
	int ch=m.nextInt();
	if(ch<4)
	{
		switch(ch)
		{
		case 1: e1();
		break;
		case 2: e3();
		break;
		case 3: e5();
		break;
		default : System.out.println("Please choose right key");
		break;
		}
	}
	}

	private void e1() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Triad E1 ==========");
		}driver();
	}

	private void e3() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Triad E3 ==========");
		}driver();
	}

	private void e5() {
		color();
		purchase();
		int otp=m.nextInt();
		if(otp!=33445544)
		{
			System.out.println("==========================================================================================");
			System.out.println("===== Thank you for Purchasing Triad E5 ==========");
		}driver();
	}
}

package operator;

public class VolumeOfSphere {
	public static void main(String[] args) {
		double radius=6378;
		double volumeofsphereinKm =(4/3)*3.14*radius*radius*radius;
		double volumeofsphereinMiles = volumeofsphereinKm*1.6;
		System.out.println("The volume of sphere in cubic kilometers is " + volumeofsphereinKm);
		System.out.println("The volume of sphere in cubic miles is " + volumeofsphereinMiles);
		
	}
}

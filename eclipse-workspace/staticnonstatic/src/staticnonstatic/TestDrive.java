package staticnonstatic;

public class TestDrive {
	public static void main(String[] arg) {
		House AA = new House();
		AA.setDriveWaySize(6);
		int AADriveWaySizeBefore = AA.getDriveWaySize();
		System.out.println("AA's drive way size: " + AADriveWaySizeBefore);
		
		House BB = new House();
		AA.setDriveWaySize(8);
		int BBDriveWaySizeBefore = BB.getDriveWaySize();
		System.out.println("BB's drive way size: " + BBDriveWaySizeBefore);
		
		House.moveDriveWayDirection();
	}

}

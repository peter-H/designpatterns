package soon;

public class SoonTestDrive {

	public static void main(String[] args) {

		Soon player = new Soon();
		System.out.println(player);
		
		player.powerButton();
		player.playButton();
		player.volumeUpButton();
		player.powerButton();
		player.powerButton();
		player.volumeDownButton();
		player.stopButton();
		player.powerButton();
	}

}

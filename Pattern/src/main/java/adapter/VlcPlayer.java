package adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void palyVlc(String filename) {

		System.out.println("Playing vlc fileName: " + filename);
	}

	@Override
	public void palyMp4(String filename) {}

}

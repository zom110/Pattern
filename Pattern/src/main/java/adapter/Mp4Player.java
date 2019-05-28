package adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void palyVlc(String filename) {}

	@Override
	public void palyMp4(String filename) {
		
		System.out.println("Playing Mp4 fileName: " + filename);
	}

}

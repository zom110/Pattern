package adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	MediaAdapter(String audioType){
		
		if("vlc".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(audioType)){
			advancedMediaPlayer = new Mp4Player();
		}

	}
	
	@Override
	public void play(String audioType, String filename) {
		
		if("vlc".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer.palyVlc(filename);;
		}else if("mp4".equalsIgnoreCase(audioType)){
			advancedMediaPlayer.palyMp4(filename);;
		}
	}

}

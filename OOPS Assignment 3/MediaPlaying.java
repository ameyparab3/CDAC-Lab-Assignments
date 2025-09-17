interface AudioPlayer{
	void playAudio();
}

interface VideoPlayer{
	void playVideo();
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
	String audio, video;
	MediaPlayer(String audio, String video){
		this.audio=audio;
		this.video=video;
	}
	
	public void playAudio(){
		System.out.println("Playing Audio: "+this.audio);
	}
	
	public void playVideo(){
		System.out.println("Playing Video: "+this.video);
	}
}

class MediaPlaying{
	public static void main(String argz[]){
		MediaPlayer m1 = new MediaPlayer("Shape of You", "Inception");
		m1.playAudio();
		m1.playVideo();
	}
}
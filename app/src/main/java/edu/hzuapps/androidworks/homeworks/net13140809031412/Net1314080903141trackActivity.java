package edu.hzuapps.androidworks.homeworks.net13140809031412;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;

public class Net1314080903141trackActivity implements Runnable {

	// �����ݴ�
	int out_size;
	// ��������
	AudioTrack track = null;

	public void run() {

	}

	// ���ͷ���
	public void track() {
		out_size = android.media.AudioTrack.getMinBufferSize(8000,
				AudioFormat.CHANNEL_CONFIGURATION_MONO,
				AudioFormat.ENCODING_PCM_16BIT);

		track = new AudioTrack(AudioManager.STREAM_MUSIC, 8000,
				AudioFormat.CHANNEL_CONFIGURATION_MONO,
				AudioFormat.ENCODING_PCM_16BIT, out_size,
				AudioTrack.MODE_STREAM);
	}
}

package com.yedam.app.di;

public class SamsungTV implements TV {
	
	// 기본생성자
	public SamsungTV() {
		System.out.println("===> SamsungTV");
	}
	
	private Speaker speaker; //NullPointerError
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}

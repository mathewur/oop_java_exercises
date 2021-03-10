package com.techreturners.cats;

public abstract class AnyCat implements Cat {
	private boolean isAsleep;
	private int avgHeightCm;
	private Setting setting;
	public enum Setting {
		  WILD("wild"),
		  DOMESTIC("domestic");
		  private String settingName;
		  Setting(String string) {
			  this.settingName = string;
		  }

		@Override
		  public String toString() {
			  return this.settingName;
		  }
		}
	AnyCat(){
		//cats should be awake by default
		this.isAsleep = false;
	}
	@Override
	public int getAverageHeight() {
		return avgHeightCm;
	}
	public void setAverageHeight(int avgHeightCm) {
		this.avgHeightCm = avgHeightCm;
	}
	@Override
	public boolean isAsleep() {
		return isAsleep;
	}
	public void setAsleep(boolean isAsleep) {
		this.isAsleep = isAsleep;
	}
	@Override
	public String getSetting() {
		return this.setting.toString();
	}
	public void setSetting(Setting setting) {
		this.setting = setting;
	}	
	@Override 
	public void goToSleep() {
	  setAsleep(true);
	}
	@Override 
	public void wakeUp() {
	  setAsleep(false);
	}




}

package edu.mu.myLittleMozart.data;

public class MidiEventData {
	
/**
 * Data based on format of CSV file 
*/
	
private int startEndTick;
private int noteOnOff;
private int channel; 
private int note;
private int velocity; 
private int instrument; 



public MidiEventData ( int startEndTick , int velocity , int note,
int channel , int instrument , int noteOnOff ) {
this.startEndTick = startEndTick;
this.velocity = velocity;
this.note = note;
this.channel = channel;
this.instrument = instrument;
this.noteOnOff = noteOnOff;
}

/**
 * Getters and setters for StartEndTick
 * @return startEndTick
 */
public int getTick() {
	return startEndTick; 
}

public void setTick(int startEndTick) {
	this.startEndTick = startEndTick;
}

/**
 * Getters and Setters for velocity
 * @return velocity 
 */
public int getVelocity() {
	return velocity; 
}

public void setVelocity(int velocity) {
	this.velocity = velocity; 
}


/**Getters and setters for note 
 * @return note
 */
public int getNote() {
	return note; 
}

public void setNote(int note) { 
	this.note = note; 
}

/**
 * Getters and setters for channel
 * @return channel
 */

public int getChannel() {
	return channel;
}

public void setChannel(int channel) { 
	this.channel = channel;
}

/**
 * Getters and setters for instrument 
 * @return instrument
 */

public int getInstrument() { 
	return instrument; 
}

public void setInstrument(int instrument) { 
	this.instrument = instrument;
}

/**
 * Getters and setters for noteOnOff
 * @return noteOnOff
 */

public int getNoteOnOff() {
	return noteOnOff; 
}

public void setNoteOnOff(int noteOnOff) {
	this.noteOnOff = noteOnOff; 
}
}

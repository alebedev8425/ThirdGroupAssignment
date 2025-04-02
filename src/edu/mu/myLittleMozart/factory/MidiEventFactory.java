package edu.mu.myLittleMozart.factory;

import javax.sound.midi.MidiEvent;
import javax.sound.midi.InvalidMidiDataException; 

public interface MidiEventFactory {
	
	/**
	 * 
	 * @param tick
	 * @param note
	 * @param velocity
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
	
	
	MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException;
	
	/**
	 * 
	 * @param tick
	 * @param note
	 * @param channel
	 * @return
	 * @throws InvalidMidiDataException
	 */
	
	MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException;


}

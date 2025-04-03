package edu.mu.myLittleMozart.factory;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiEvent;
import javax.sound.midi.ShortMessage;

public class StaccatoMidiEventFactory implements MidiEventFactory{

	@Override
	public MidiEvent createNoteOn(int tick, int note, int velocity, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		ShortMessage noteOnShortMessage = new ShortMessage();
		noteOnShortMessage.setMessage(ShortMessage.NOTE_ON, channel, note, velocity);
		
		
		return new MidiEvent(noteOnShortMessage,tick);
	}

	@Override
	public MidiEvent createNoteOff(int tick, int note, int channel) throws InvalidMidiDataException {
		// TODO Auto-generated method stub
		int newTick = tick - 120;
		
		if (newTick < 0) {
            newTick = 0;
        }
		
		ShortMessage noteOffShortMessage = new ShortMessage();
		noteOffShortMessage.setMessage(ShortMessage.NOTE_OFF, channel, note, 0);
		
		return new MidiEvent(noteOffShortMessage,newTick);
	}

}

package edu.mu.myLittleMozart.strategy;

public class AcousticGrandPianoStrategy {
	
	public void applyInstrument(javax.sound.midi.Track track, int channel) throws javax.sound.midi.InvalidMidiDataException {
		javax.sound.midi.ShortMessage message = new javax.sound.midi.ShortMessage();
		message.setMessage(javax.sound.midi.ShortMessage.PROGRAM_CHANGE, channel, 0,0);
		javax.sound.midi.MidiEvent event = new javax.sound.midi.MidiEvent(message, 0);
		track.add(event);
		
	}

}

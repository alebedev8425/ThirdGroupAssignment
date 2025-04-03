package edu.mu.myLittleMozart.strategy;

import javax.sound.midi.*;

public class TrumpetStrategy implements InstrumentStrategy {
    @Override
    public void applyInstrument(Track track, int channel) throws InvalidMidiDataException {
        ShortMessage message = new ShortMessage();
        message.setMessage(ShortMessage.PROGRAM_CHANGE, channel, 56, 0); // Trumpet is 56
        MidiEvent event = new MidiEvent(message, 0);
        track.add(event);
    }
}

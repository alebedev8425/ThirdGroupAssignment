package edu.mu.myLittleMozart.strategy;

public interface InstrumentStrategy {
    void applyInstrument(javax.sound.midi.Track track, int channel) throws javax.sound.midi.InvalidMidiDataException;
}

package edu.mu.myLittleMozart.main;

import java.util.List;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Track;

import edu.mu.myLittleMozart.data.MidiCsvParser;
import edu.mu.myLittleMozart.data.MidiEventData;
import edu.mu.myLittleMozart.factory.MidiEventFactory;
import edu.mu.myLittleMozart.factory.MidiEventFactoryAbstract;
import edu.mu.myLittleMozart.factory.StandardMidiEventFactoryAbstract;
import edu.mu.myLittleMozart.strategy.ElectricBassGuitarStrategy;
import edu.mu.myLittleMozart.strategy.HigherPitchStrategy;
import edu.mu.myLittleMozart.strategy.InstrumentStrategy;
import edu.mu.myLittleMozart.strategy.PitchStrategy;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            List<MidiEventData> midiEvents = MidiCsvParser.readCSVFile("./files/mystery_song.csv");
            Sequence sequence = new Sequence(Sequence.PPQ, 384);
            Track track = sequence.createTrack();

            MidiEventFactoryAbstract factoryAbstract = new StandardMidiEventFactoryAbstract();
            // MidiEventFactoryAbstract factoryAbstract = new LegatoMidiEventFactoryAbstract();
            // MidiEventFactoryAbstract factoryAbstract = new StaccatoMidiEventFactoryAbstract();

            MidiEventFactory factory = factoryAbstract.createFactory();

            // Choose an instrument strategy (e.g., Trumpet, Bass Guitar, Piano)
            InstrumentStrategy instrumentStrategy = new ElectricBassGuitarStrategy();
            instrumentStrategy.applyInstrument(track, 0);
            // instrumentStrategy = new TrumpetStrategy();
            // instrumentStrategy.applyInstrument(track, 1);

            // Choose a pitch strategy (e.g., HigherPitch, LowerPitch)
            PitchStrategy pitchStrategy = new HigherPitchStrategy();

            for (MidiEventData event : midiEvents) {
                int modifiedNote = pitchStrategy.modifyPitch(event.getNote());
                // call this as much as you want if you want to get a higher pitch
                modifiedNote = pitchStrategy.modifyPitch(modifiedNote);

                if (event.getNoteOnOff() == ShortMessage.NOTE_ON) {
                    track.add(factory.createNoteOn(
                        event.getTick(),
                        modifiedNote,
                        event.getVelocity(),
                        event.getChannel()
                    ));
                } else {
                    track.add(factory.createNoteOff(
                        event.getTick(),
                        modifiedNote,
                        event.getChannel()
                    ));
                }
            }

            // Playing the sequence
           System.out.println("sequencer started");
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.setSequence(sequence);
            sequencer.start();

            while (sequencer.isRunning() || sequencer.isOpen()) {
                Thread.sleep(100);
            }

            Thread.sleep(500);
            sequencer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	}



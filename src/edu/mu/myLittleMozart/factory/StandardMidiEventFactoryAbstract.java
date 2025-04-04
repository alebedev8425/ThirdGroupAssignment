package edu.mu.myLittleMozart.factory;

public class StandardMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	/**
	 * Create and returns a standard midi event factory
	 * 
	 * @return a StandMidiEventFactory instance
	 */
	
	
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StandardMidiEventFactory();
	}

}

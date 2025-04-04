package edu.mu.myLittleMozart.factory;

public class LegatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{

	/**
	 * creates and returns an instance of legato midi event factory
	 * @return LegatoMidiEventFactory instance
	 */
	
	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new LegatoMidiEventFactory();
	}

}

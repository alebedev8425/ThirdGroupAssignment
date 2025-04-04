package edu.mu.myLittleMozart.factory;

public class StaccatoMidiEventFactoryAbstract implements MidiEventFactoryAbstract{
	
	/**
	 * creates an returns an instance of staccato midi event factory
	 * @return StaccatoMidiEventFactory instance
	 */

	@Override
	public MidiEventFactory createFactory() {
		// TODO Auto-generated method stub
		return new StaccatoMidiEventFactory();
	}

}

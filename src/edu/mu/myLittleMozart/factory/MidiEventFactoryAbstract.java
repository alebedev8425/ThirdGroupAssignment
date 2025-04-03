package edu.mu.myLittleMozart.factory;

public interface MidiEventFactoryAbstract {
	
	/**
	 * This creates and returns an instance of the Factory while
	 * still keeping client code separate from concrete factories
	 * 
	 * @return an instance of the Midi factory
	 */
	
	MidiEventFactory createFactory();

}

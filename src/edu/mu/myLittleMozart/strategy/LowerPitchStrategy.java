package edu.mu.myLittleMozart.strategy;

public class LowerPitchStrategy implements PitchStrategy {

	/**
	 * Method returns note with a lowered pitch
	 * @param integer note  
	 * @return integer note -2 
	 */
	@Override
	public int modifyPitch(int note) {
		return note -2; 
	}

}

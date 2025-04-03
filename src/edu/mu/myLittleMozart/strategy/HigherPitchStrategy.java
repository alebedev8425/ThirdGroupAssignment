package edu.mu.myLittleMozart.strategy;

public class HigherPitchStrategy implements PitchStrategy  {

	/**
	 * returns note with a higher pitch 
	 * @param integer note 
	 * @return note +2
	 */
	@Override
	public int modifyPitch(int note) {
		return note +2; 
	}

}

package edu.mu.myLittleMozart.data;
import java.io.BufferedReader;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileReader;

public class MidiCsvParser {
	/**
	 * reads csv file and stores contents into midiEvents.
	 * @param <MidiEventData>
	 * @param <MidiEventData>
	 * @param filepath
	 * @return list of MidiEventData 
	 * @throws IOException if an error is encountered while reading the file 
	 */
	
	public static List<MidiEventData> readCSVFile(String filepath) throws IOException {
		
		//creates list 
		List<MidiEventData> midiEvents = new ArrayList<>();
		
		//uses bufferedReader to read lines of file  
		 try (BufferedReader br = Files.newBufferedReader(Paths.get(filepath))) { 
			 	
			 //read lines until end  
			 String line; 
			 while((line = br.readLine()) != null) { 
				 System.out.println(line);   //comment out test code.
				 String[] data = line.split(",");
				 
				 try {
				 // converting the strings read to integers, then trimming spaces 
				 int startEndTick = Integer.parseInt(data[0].trim());
				 int noteOnOff;
				 String noteOnOffStr= data[1].trim();
				 int channel = Integer.parseInt(data[2].trim());
				 int note = Integer.parseInt(data[3].trim());
				 int velocity = Integer.parseInt(data[4].trim());
				 int instrument = Integer.parseInt(data[5].trim());
				 
				 //Using .equals to decide if noteOnOff should be = to 1 or 0 
				 if (noteOnOffStr.equals("Note_on_c")) {
					 noteOnOff = 1;
				 }
				 else if (noteOnOffStr.equals("Note_off_c")) { 
					 noteOnOff = 0;
				 }
				 else {
					 //System.out.println("Skipping invalid note type in line: " + String.join(", ", data));
					 continue; 
				 }
				 
				 
				 //create new midiEventData with correct values 
				 MidiEventData event = new MidiEventData(startEndTick, velocity, note, channel, instrument,
						 noteOnOff);
				 midiEvents.add(event);
			 }
				 
			 catch (NumberFormatException e) 
				 {
				 //handle error 
			 System.out.println("Skipping invalid number format in line: " + line); 
				 }
		 }
		
	}
		 return midiEvents; 
	}
}

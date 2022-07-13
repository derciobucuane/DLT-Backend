package dlt.dltbackendmaster.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import dlt.dltbackendmaster.domain.AlphanumericSequence;

public class SequenceGenerator {

	private final DAOService _service;


    public SequenceGenerator(DAOService service) {
        this._service = service;
    }
	
	public synchronized AlphanumericSequence getNextAlphanumericSequence(String username) {
		
		// get last sequence from db
		AlphanumericSequence sequence = _service.GetUniqueEntityByNamedQuery("AlphanumericSequence.find");
		
		if(sequence == null) {
			return null;
		}
		
		// generate next value
		String newSequence = generateAlphanumericSequence(sequence.getSequence());
		
		while(newSequence.matches("^[0-9]*$")) { // if sequence only contains numbers, discard it and generate the next one
			newSequence = generateAlphanumericSequence(newSequence);
		}
		
		// create new sequence
		AlphanumericSequence newSeq = new AlphanumericSequence();
		newSeq.setSequence(newSequence);
		newSeq.setUsername(username);
		newSeq.setDateCreated(new Date());
		_service.Save(newSeq);
		
		return newSeq;
	}
	
	private String generateAlphanumericSequence(String s) {
		// use hexadecimal base-36 conversion
		long n = Long.parseLong (s, 36); 
        n = n + 1;
        s = Long.toString (n, 36).toUpperCase(); 
        // extend to 3 chars
        s = ("00" + s);
        s = s.substring (s.length() - 3);
	    return s;
	}
	
	
}

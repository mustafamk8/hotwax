package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Party;
import com.project.repo.PartyRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PartyService {
    private final PartyRepo partyRepository;

    @Autowired
    public PartyService(PartyRepo partyRepository) {
        this.partyRepository = partyRepository;
    }

    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    public Optional<Party> getPartyById(String partyId) {
        return partyRepository.findById(partyId);
    }

    public Party createParty(Party party) {
        return partyRepository.save(party);
    }

//    public Party updateParty(String partyId, Party updatedParty) {
//        if (partyRepository.existsById(partyId)) {
//            updatedParty.setPartyId(partyId);
//            return partyRepository.save(updatedParty);
//        }
//        return null; // Handle not found scenario as needed
//    }

    public void deleteParty(String partyId) {
        partyRepository.deleteById(partyId);
    }
}


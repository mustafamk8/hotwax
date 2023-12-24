package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.project.model.Party;
import com.project.service.PartyService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/parties")
public class PartyController {
    private final PartyService partyService;

    @Autowired
    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    @GetMapping
    public ResponseEntity<List<Party>> getAllParties() {
        List<Party> parties = partyService.getAllParties();
        return ResponseEntity.ok(parties);
    }

    @GetMapping("/{partyId}")
    public ResponseEntity<Party> getPartyById(@PathVariable String partyId) {
        Optional<Party> party = partyService.getPartyById(partyId);
        return party.map(value -> ResponseEntity.ok().body(value))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<Party> createParty(@RequestBody Party party) {
        Party createdParty = partyService.createParty(party);
        return new ResponseEntity<>(createdParty, HttpStatus.CREATED);
    }

//    @PutMapping("/{partyId}")
//    public ResponseEntity<Party> updateParty(@PathVariable String partyId, @RequestBody Party updatedParty) {
//        Party party = partyService.updateParty(partyId, updatedParty);
//        return party != null ? ResponseEntity.ok(party) : ResponseEntity.notFound().build();
//    }

    @DeleteMapping("/{partyId}")
    public ResponseEntity<Void> deleteParty(@PathVariable String partyId) {
        partyService.deleteParty(partyId);
        return ResponseEntity.noContent().build();
    }
}


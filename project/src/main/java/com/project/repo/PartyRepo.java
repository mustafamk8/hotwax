package com.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Party;

public interface PartyRepo extends JpaRepository<Party, String> {

}

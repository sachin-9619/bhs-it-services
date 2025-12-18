package com.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.model.ContactMessage;

@Repository
public interface ContactRepository extends JpaRepository<ContactMessage, Long> {
}

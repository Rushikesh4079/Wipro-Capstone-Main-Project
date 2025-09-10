package com.rushikesh.wipro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rushikesh.wipro.entity.Notification;


public interface Repo extends JpaRepository<Notification, Long>{

}
package com.pratice.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratice.demo.model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}

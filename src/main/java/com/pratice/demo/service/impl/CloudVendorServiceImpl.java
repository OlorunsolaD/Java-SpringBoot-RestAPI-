package com.pratice.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pratice.demo.exception.CloudVendorNotFoundException;
import com.pratice.demo.model.CloudVendor;
import com.pratice.demo.repository.CloudVendorRepository;
import com.pratice.demo.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {

        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {

        cloudVendorRepository.deleteById(cloudVendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        if (cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor details does not exist");
        return cloudVendorRepository.findById(cloudVendorId).get();
    
    }

    @Override
    public List<CloudVendor> getallCloudVendors() {
        
        return cloudVendorRepository.findAll();
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }

}

package com.pratice.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="cloud_vendor_info")
public class CloudVendor
 {

    @Id
    private String VendorId;
    private String VendorName;
    private String VendorAddress;
    private String VendorPhoneNo;

    public CloudVendor() {
    }

  public String getVendorId() {
    return VendorId;
}


public void setVendorId(String vendorId) {
    VendorId = vendorId;
}


public String getVendorName() {
    return VendorName;
}


public void setVendorName(String vendorName) {
    VendorName = vendorName;
}


public String getVendorAddress() {
    return VendorAddress;
}


public void setVendorAddress(String vendorAddress) {
    VendorAddress = vendorAddress;
}


public String getVendorPhoneNo() {
    return VendorPhoneNo;
}


public void setVendorPhoneNo(String vendorPhoneNo) {
    VendorPhoneNo = vendorPhoneNo;
}

  public CloudVendor(String vendorId, String vendorName, String vendorAddress, String vendorPhoneNo) {
        VendorId = vendorId;
        VendorName = vendorName;
        VendorAddress = vendorAddress;
        VendorPhoneNo = vendorPhoneNo;
    }

}

package com.example.demo;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;
    private String location;
    private String natureOfBusiness;
    private String website;

    @ElementCollection
    @CollectionTable(
        name = "supplier_manufacturing_processes",
        joinColumns = @JoinColumn(name = "supplier_id")
    )
    private List<ManufacturingProcess> manufacturingProcesses;

    // Getters and setters
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<ManufacturingProcess> getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(List<ManufacturingProcess> manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }

    @Embeddable
    public static class ManufacturingProcess {
        
        @Column(name = "process_key")
        private String processKey;

        @Column(name = "process_value")
        private String value;

        @Column(name = "process_description")
        private String description;

        // Getters and setters
        public String getProcessKey() {
            return processKey;
        }

        public void setProcessKey(String processKey) {
            this.processKey = processKey;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

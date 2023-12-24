package com.project.model;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Order_Part")
public class OrderPart {
    @Id
    @Column(name = "ORDER_ID", length = 40, nullable = false)
    private String orderId;

    @Id
    @Column(name = "ORDER_PART_SEQ_ID", length = 40, nullable = false)
    private String orderPartSeqId;

    @Column(name = "PART_NAME", length = 255)
    private String partName;

    @Column(name = "STATUS_ID", length = 40)
    private String statusId;

    @Column(name = "VENDOR_PARTY_ID", length = 40)
    private String vendorPartyId;

    @Column(name = "CUSTOMER_PARTY_ID", length = 40)
    private String customerPartyId;

    @Column(name = "PART_TOTAL", precision = 24, scale = 4)
    private BigDecimal partTotal;

    @Column(name = "FACILITY_ID", length = 40)
    private String facilityId;

    @Column(name = "SHIPMENT_METHOD_ENUM_ID", length = 40)
    private String shipmentMethodEnumId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    private OrderHeader orderHeader;

    // Getters and setters

    // Rest of the code...
}

package com.project.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "Order_Header")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderHeader {
    @Id
    @Column(name = "ORDER_ID", length = 40, nullable = false)
    private String orderId;

    @Column(name = "ORDER_NAME", length = 255)
    private String orderName;

    @Column(name = "PLACED_DATE")
    private Timestamp placedDate;

    @Column(name = "APPROVED_DATE")
    private Timestamp approvedDate;

    @Column(name = "STATUS_ID", length = 40)
    private String statusId;

    @Column(name = "CURRENCY_UOM_ID", length = 40)
    private String currencyUomId;

    @Column(name = "PRODUCT_STORE_ID", length = 40)
    private String productStoreId;

    @Column(name = "SALES_CHANNEL_ENUM_ID", length = 40)
    private String salesChannelEnumId;

    @Column(name = "GRAND_TOTAL", precision = 24, scale = 4)
    private BigDecimal grandTotal;

    @Column(name = "COMPLETED_DATE")
    private Timestamp completedDate;

    // Getters and setters
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    // Rest of the code...
}

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
@Table(name = "Order_Item")
public class OrderItem {
    @Id
    @Column(name = "ORDER_ID", length = 40, nullable = false)
    private String orderId;

    @Id
    @Column(name = "ORDER_ITEM_SEQ_ID", length = 40, nullable = false)
    private String orderItemSeqId;

    @Column(name = "ORDER_PART_SEQ_ID", length = 40)
    private String orderPartSeqId;

    @Column(name = "PRODUCT_ID", length = 40)
    private String productId;

    @Column(name = "ITEM_DESCRIPTION", length = 255)
    private String itemDescription;

    @Column(name = "QUANTITY", precision = 26, scale = 6)
    private BigDecimal quantity;

    @Column(name = "UNIT_AMOUNT", precision = 25, scale = 5)
    private BigDecimal unitAmount;

    @Column(name = "ITEM_TYPE_ENUM_ID", length = 40)
    private String itemTypeEnumId;

    @Column(name = "PARENT_ITEM_SEQ_ID", length = 40)
    private String parentItemSeqId;

    @ManyToOne
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false)
    private OrderHeader orderHeader;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "ORDER_ID", referencedColumnName = "ORDER_ID", insertable = false, updatable = false),
            @JoinColumn(name = "ORDER_PART_SEQ_ID", referencedColumnName = "ORDER_PART_SEQ_ID", insertable = false, updatable = false)
    })
    private OrderPart orderPart;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "PRODUCT_ID", insertable = false, updatable = false)
    private Product product;

    // Getters and setters

    public void setOrderItemSeqId(String orderItemSeqId) {
        this.orderItemSeqId = orderItemSeqId;
    }
   
    
    // Rest of the code...
}


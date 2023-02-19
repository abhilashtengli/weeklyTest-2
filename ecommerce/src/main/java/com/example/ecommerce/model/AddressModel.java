package com.example.ecommerce.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Add_tbl")
public class AddressModel {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    @Column(name ="add_id")
    private Integer aId;
    private String aname;
    private String aphoneNumber;
    private String azipCode;
    private String astate;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private userModel user;
}

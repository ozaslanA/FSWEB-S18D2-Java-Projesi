package com.example.fruitapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass /*Bu sınıfın bir tablosu olmayacak fakat bu bir süperclass */
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    @NotNull
    @Size(min=2,max=45,message = "İsim 2-45 arası olsun")
    private String name;
    @Column(name="price")
    @DecimalMin("10")
    private double price;

}

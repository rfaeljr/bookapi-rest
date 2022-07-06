package com.book.bookapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<Book> books;

    @Enumerated(EnumType.ORDINAL)
    TypePayment typePayment;

    @OneToOne
    private Client client;

    @Column(scale = 2)
    private BigDecimal valueTotal;

    @Column(nullable = false)
    private LocalDateTime dateSale;
}

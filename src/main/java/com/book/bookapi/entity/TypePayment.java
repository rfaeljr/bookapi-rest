package com.book.bookapi.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
public enum TypePayment{
    DINHEIRO, CARTAODEBITO, CARTAOCREDITO, PARCELADOCARNE;
}
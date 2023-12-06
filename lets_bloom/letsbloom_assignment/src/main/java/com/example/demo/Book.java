package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
@Entity
@Table(name="Book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Getter
    @Setter
    @NotBlank(message = "Title cannot be blank")
    private String title;
    @Getter
    @Setter
    @NotBlank(message = "Author cannot be blank")
    private String author;

    @Getter
    @Setter
    @NotNull(message = "ISBN cannot be null")
    private Long isbn;


}
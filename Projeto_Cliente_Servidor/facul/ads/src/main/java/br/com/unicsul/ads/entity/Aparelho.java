package br.com.unicsul.ads.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter @Setter @NoArgsConstructor
@Entity
@Table(name = "aparelho")
public class Aparelho implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "nome", nullable = false, unique = true, length = 100)
    private String nome;
    @Column(name = "repeticoes")
    private int repeticoes;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aparelho aparelho = (Aparelho) o;
        return Objects.equals(id, aparelho.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "aparelho{" +
                "id=" + id +
                '}';
    }
}

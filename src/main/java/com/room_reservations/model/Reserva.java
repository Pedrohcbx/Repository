package com.room_reservations.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "sala_id", nullable = false)
    private Sala sala;

    @NotBlank(message = "O nome do usuário é obrigatório")
    private String usuario;

    @NotNull(message = "A data e hora de início são obrigatórias")
    private LocalDateTime dataHoraInicio;

    @NotNull(message = "A data e hora de fim são obrigatórias")
    private LocalDateTime dataHoraFim;
}

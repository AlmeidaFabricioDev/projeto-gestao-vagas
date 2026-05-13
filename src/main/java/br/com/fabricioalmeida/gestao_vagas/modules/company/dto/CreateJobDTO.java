package br.com.fabricioalmeida.gestao_vagas.modules.company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CreateJobDTO {
    private String description;
    private String benefits;
    private String level;
}

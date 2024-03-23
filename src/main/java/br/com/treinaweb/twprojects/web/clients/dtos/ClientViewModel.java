package br.com.treinaweb.twprojects.web.clients.dtos;

import br.com.treinaweb.twprojects.core.models.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientViewModel {

    private Long id;

    private String name;

    private String email;

    private String fone;

    public String getFone(){
        return fone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
    }

    public static ClientViewModel of(Client client) {
        return ClientViewModel.builder()
                .id(client.getId())
                .name(client.getName())
                .email(client.getEmail())
                .fone(client.getFone())
                .build();
    }

}
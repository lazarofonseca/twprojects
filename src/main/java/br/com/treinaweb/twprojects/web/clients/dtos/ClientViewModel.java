package br.com.treinaweb.twprojects.web.clients.dtos;

import br.com.treinaweb.twprojects.core.models.Client;
import br.com.treinaweb.twprojects.core.utils.StringUtils;
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

    public String getFone() {
        return StringUtils.formatPhone(fone);
    }

    public static ClientViewModel of(Client client) {
        return ClientViewModel.builder()
                .id(client.getId())
                .name(client.getName())
                .email(client.getEmail())
                .fone(StringUtils.formatPhone(client.getFone()))
                .build();
    }

}

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
public class ClientForm {

    private String name;

    private String email;

    private String fone;

    public Client toClient() {
        return Client.builder()
                .name(name)
                .email(email)
                .fone(StringUtils.cleanPhone(fone))
                .build();
    }

    public static ClientForm of(Client client) {
        return ClientForm.builder()
                .name(client.getName())
                .email(client.getEmail())
                .fone(StringUtils.formatPhone(client.getFone()))
                .build();
    }


}

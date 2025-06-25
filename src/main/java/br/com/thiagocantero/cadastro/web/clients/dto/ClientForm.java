package br.com.thiagocantero.cadastro.web.clients.dto;

import br.com.thiagocantero.cadastro.core.models.Client;
import br.com.thiagocantero.cadastro.core.utils.StringUtils;
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

    private String phone;
    

    
    public Client toClient() {
        return Client.builder()
                .name(name)
                .email(email)
                .phone(StringUtils.cleanPhone(phone))
                .build();
    }

    public static ClientForm of(Client client) {
        return ClientForm.builder()
                .name(client.getName())
                .email(client.getEmail())
                .phone(StringUtils.formatPhone(client.getPhone()))
                .build();
    }
}

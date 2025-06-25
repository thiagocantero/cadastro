package br.com.thiagocantero.cadastro.web.clients.dto;

import br.com.thiagocantero.cadastro.core.models.Client;
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
    

    public String cleanedPhone(){
        return phone.replaceAll("[^0-9]", "");
    }
    public Client toClient() {
        return Client.builder()
                .name(name)
                .email(email)
                .phone(cleanedPhone())
                .build();
    }
}
